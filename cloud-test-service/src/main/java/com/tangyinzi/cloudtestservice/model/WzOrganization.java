package com.tangyinzi.cloudtestservice.model;

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
 * 组织机构名称
 * </p>
 *
 * @author tangyinzi
 * @since 2022-01-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="WzOrganization对象", description="组织机构名称")
public class WzOrganization implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = " ")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "机构名称")
    private String name;

    @ApiModelProperty(value = "上一级机构id")
    private Integer parentId;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "所在城市")
    private String city;

    @ApiModelProperty(value = "所在省份")
    private String province;

    @ApiModelProperty(value = "所在县区")
    private String district;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "地图放大比率")
    private Integer ratio;

    @ApiModelProperty(value = "经度")
    private Double longitude;

    @ApiModelProperty(value = "纬度")
    private Double latitude;

    @ApiModelProperty(value = "是否有直接辖区")
    private Integer hasArea;

    @ApiModelProperty(value = "是否安装信令设备, 一般只有分局才有信令设备")
    private Integer hasSignalling;

    @ApiModelProperty(value = "机构类型,110,120,119")
    private String type;

    @ApiModelProperty(value = "最高级别的code(前端筛选地图用)")
    private String addressCode;

    @ApiModelProperty(value = "接入日期, 只有最低一级才设置")
    private String joinDate;

    private Integer customerId;

    private Integer aggregateMark;


}
