package com.tangyinzi.cloudtestservice.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author tangyinzi
 * @since 2022-02-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Countrylanguage对象", description="")
public class Countrylanguage implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "CountryCode", type = IdType.ASSIGN_ID)
    private String CountryCode;

    @TableField("Language")
    private String Language;

    @TableField("IsOfficial")
    private String IsOfficial;

    @TableField("Percentage")
    private Float Percentage;


}
