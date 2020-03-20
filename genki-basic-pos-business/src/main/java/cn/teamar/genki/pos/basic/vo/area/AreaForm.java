package cn.teamar.genki.pos.basic.vo.area;

import cn.teamar.genki.basic.common.entity.BaseForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @program: genki-basic
 * @description: 区域表单
 * @author: jie.pang
 * @create: 2018-08-01 14:38
 **/
@Setter
@Getter
@ToString
@ApiModel
public class AreaForm extends BaseForm {

    @ApiModelProperty("区域名称")
    @NotNull
    private String areaName;
}
