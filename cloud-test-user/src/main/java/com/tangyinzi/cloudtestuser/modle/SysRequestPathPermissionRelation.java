package com.tangyinzi.cloudtestuser.modle;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 路径权限关联表
 */
@Data
public class SysRequestPathPermissionRelation implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 请求路径id
     */
    private Integer urlId;

    /**
     * 权限id
     */
    private Integer permissionId;

    private static final long serialVersionUID = 1L;
}