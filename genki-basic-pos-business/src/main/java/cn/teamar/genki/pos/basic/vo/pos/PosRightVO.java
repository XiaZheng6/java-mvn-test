package cn.teamar.genki.pos.basic.vo.pos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @program: genki-basic
 * @description: 用户Form
 * @author: jie.pang
 * @create: 2018-07-31 13:52
 **/
@Getter
@Setter
@ApiModel("权限视图")
public class PosRightVO {

    @ApiModelProperty("权限名称")
    private String rightName;
    @ApiModelProperty("权限类型")
    private Byte rightType;
    @ApiModelProperty("权限CODE")
    private String rightCode;
    @ApiModelProperty("图片路径")
    private String imageUrl;
    @ApiModelProperty("资源路径")
    private String sourcePath;


}
