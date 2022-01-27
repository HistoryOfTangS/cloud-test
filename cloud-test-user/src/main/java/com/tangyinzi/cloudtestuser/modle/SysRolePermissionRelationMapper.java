package com.tangyinzi.cloudtestuser.modle;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 角色-权限关联关系表
 */
@Data
public class SysRolePermissionRelationMapper implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 权限id
     */
    private Integer permissionId;

    private static final long serialVersionUID = 1L;
}