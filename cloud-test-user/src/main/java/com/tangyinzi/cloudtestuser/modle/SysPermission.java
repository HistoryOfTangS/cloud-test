package com.tangyinzi.cloudtestuser.modle;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 权限表
 */
@Data
public class SysPermission implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 权限code
     */
    private String permissionCode;

    /**
     * 权限名
     */
    private String permissionName;

    private static final long serialVersionUID = 1L;
}