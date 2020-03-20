package cn.teamar.genki.pos.basic.vo.pos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @program: genki-basic-pos
 * @description: 桌台信息
 * @author: jie.pang
 * @create: 2018-08-17 19:08
 **/

@Setter
@Getter
@ToString
@ApiModel
public class TableVO {

    @ApiModelProperty("唯一标识，和云端统一")
    private long tableCloudId;

    @ApiModelProperty("排序")
    private int weight;

    @ApiModelProperty("桌台名称")
    private String tableName;

    @ApiModelProperty("桌台编码")
    private String tableCode;

    @ApiModelProperty("所属区域id")
    private long areaId;

    @ApiModelProperty("所属区域名称")
    private String areaName;

    @ApiModelProperty("桌台总人数")
    private int count;

}
