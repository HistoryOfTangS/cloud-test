package com.tangyinzi.cloudtestuser.modle;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 请求路径
 */
@Data
public class SysRequestPath implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 请求路径
     */
    private String url;

    /**
     * 路径描述
     */
    private String description;

    private static final long serialVersionUID = 1L;
}