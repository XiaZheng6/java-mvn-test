package cn.teamar.genki.pos.basic.vo.base;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @program: genki-basic
 * @description:
 * @author: jie.pang
 * @create: 2018-08-02 17:03
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class CityNodeVO {
    private int code;
    private String name;
    private long parentCode;
}
