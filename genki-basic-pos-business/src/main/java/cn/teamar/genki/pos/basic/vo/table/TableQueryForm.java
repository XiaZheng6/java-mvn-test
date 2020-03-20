package cn.teamar.genki.pos.basic.vo.table;

import cn.teamar.genki.basic.common.entity.PageForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-08-01 16:21
 **/
@Setter
@Getter
@ToString
@ApiModel
public class TableQueryForm extends PageForm {
    @ApiModelProperty("区域ID")
    private Long areaId;
}
