package com.tangyinzi.cloudtestuser.utils;

/**
 * 抽象接口
 *
 * @author tangyiner
 */
public interface ServiceExceptionEnum {

    /**
     * 获取异常编码
     */
    Integer getCode();

    /**
     * 获取异常信息
     */
    String getMessage();
}
