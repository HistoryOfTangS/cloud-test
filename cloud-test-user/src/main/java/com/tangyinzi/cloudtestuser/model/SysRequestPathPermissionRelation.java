package com.tangyinzi.cloudtestuser.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 路径权限关联表
 * </p>
 *
 * @author tangyinzi
 * @since 2022-02-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysRequestPathPermissionRelation对象", description="路径权限关联表")
public class SysRequestPathPermissionRelation implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "请求路径id")
    private Integer urlId;

    @ApiModelProperty(value = "权限id")
    private Integer permissionId;


}
