package com.tangyinzi.cloudtestuser.modle;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 用户角色表
 */
@Data
public class SysRole implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    private String roleCode;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 角色说明
     */
    private String roleDescription;

    private static final long serialVersionUID = 1L;
}