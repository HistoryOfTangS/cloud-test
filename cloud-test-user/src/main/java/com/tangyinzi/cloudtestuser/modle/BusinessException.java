package com.tangyinzi.cloudtestuser.modle;

public class BusinessException extends Throwable {
    private static final long serialVersionUID = 1L;

    /**
     * 不同错误码表示不同的业务异常, 默认为BUSINESS_ERROR
     */
    private Integer errorCode = ActionResultCode.BUSINESS_ERROR.getValue();

    /**
     * 构造方法
     */
    public BusinessException() {
        super("业务规则异常");
    }

    /**
     * 构造方法
     * @param message 异常消息
     */
    public BusinessException(String message) {
        super(message);
    }

    /**
     * 构造方法
     * @param message 异常消息
     * @param cause 内部异常
     */
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构造方法
     * @param cause 内部异常
     */
    public BusinessException(Throwable cause) {
        super(cause);
    }

    /**
     * 构造方法
     * @param message 异常信息
     * @param cause 内部异常
     * @param enableSuppression 能否挂起异常
     * @param writableStackTrace 能否写入堆栈
     */
    protected BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    /**
     * 构造方法
     * @param errorCode 错误码
     */
    public BusinessException(Integer errorCode) {
        super("业务规则异常");
        setErrorCode(errorCode);
    }

    /**
     * 构造方法
     * @param errorCode 错误码
     * @param message 异常信息
     */
    public BusinessException(Integer errorCode, String message) {
        super(message);
        setErrorCode(errorCode);
    }

    /**
     * 构造方法
     * @param errorCode 错误码
     * @param message 异常信息
     * @param cause 内部异常
     */
    public BusinessException(Integer errorCode, String message, Throwable cause) {
        super(message, cause);
        setErrorCode(errorCode);
    }

    /**
     * 构造方法
     * @param errorCode 错误码
     * @param cause 内部异常
     */
    public BusinessException(Integer errorCode, Throwable cause) {
        super(cause);
        setErrorCode(errorCode);
    }

    /**
     * 构造方法
     * @param errorCode 错误码
     * @param message 异常信息
     * @param cause 内部异常
     * @param enableSuppression 能否挂起异常
     * @param writableStackTrace 能否写入堆栈
     */
    public BusinessException(Integer errorCode, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        setErrorCode(errorCode);
    }

    /**
     * 获取错误码
     * @return 错误码
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * 设置错误码
     * @param errorCode 错误码
     */
    public void setErrorCode(Integer errorCode) {
        if (errorCode <= 0) {
            throw new IllegalArgumentException("业务规则异常错误码必须大于0");
        }
        this.errorCode = errorCode;
    }
}
