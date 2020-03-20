package cn.teamar.genki.pos.basic.vo.slottime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-08-02 15:55
 **/
@Setter
@Getter
@ToString
@ApiModel
public class SlotTimeVO {

    @ApiModelProperty("ID")
    private Long id;
    @ApiModelProperty("时段名称")
    private String slotName;
    @ApiModelProperty("开始时间")
    private Long slotStart;
    @ApiModelProperty("结束时间")
    private Long slotEnd;
}
