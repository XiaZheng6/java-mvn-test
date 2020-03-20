package cn.teamar.genki.pos.basic.vo.area;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: genki-basic
 * @description: 区域视图类
 * @author: jie.pang
 * @create: 2018-08-01 14:38
 **/
@Setter
@Getter
@ToString
@ApiModel
public class AreaVO {
    @ApiModelProperty("ID")
    private Long id;
    @ApiModelProperty("区域名称")
    private String areaName;
}
