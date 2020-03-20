package cn.teamar.genki.pos.basic.vo.table;

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
public class TableVO {
    @ApiModelProperty("ID")
    private Long id;
    @ApiModelProperty("桌台名称")
    private String tableName;
    @ApiModelProperty("桌台编号")
    private String tableCode;
    @ApiModelProperty("区域ID")
    private Long areaId;
    @ApiModelProperty("默认人数")
    private Byte defaultNum;
}
