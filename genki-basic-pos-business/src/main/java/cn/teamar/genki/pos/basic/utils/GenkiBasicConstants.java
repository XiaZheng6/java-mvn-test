package cn.teamar.genki.pos.basic.utils;

import cn.teamar.genki.basic.common.enums.DataStateEnum;
import cn.teamar.genki.basic.common.enums.SpecEnum;
import cn.teamar.genki.basic.common.enums.TxtTagEnum;
import cn.teamar.genki.basic.common.enums.UnitEnum;
import cn.teamar.genki.common.consts.NameCode;
import cn.teamar.genki.common.tools.vo.OptionVO;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: genki-basic
 * @description: 常量池
 * @author: jie.pang
 * @create: 2018-07-30 15:26
 **/
public class GenkiBasicConstants {

    //允许最大时段数量
    public static final int ALLOW_SLOTTIME_NUMS = 5;
    //验证码默认分割符
    public static final String CAPTCHA_ID_PREFIX = "capt_";
    //验证码默认过期时间
    public static final int CAPTCHA_EXPIRE = 120;
    //默认用户密码
    public static final String DEFAULT_USER_PASSWORD = "123456";

    /** 数据状态列表 */
    private static final List<OptionVO<String, Integer>> stateTypeList = toList(DataStateEnum.values());


    /** 文字标签 */
    private static final List<OptionVO<String, Integer>> txtTagList = toList(TxtTagEnum.values());




    /** 单位列表 */
    private static final List<OptionVO<String, Integer>> unitList = toList(UnitEnum.values());

    /** 规格标签 */
    private static final List<OptionVO<String, Integer>> specList = toList(SpecEnum.values());


    /**
     * 获取数据状态
     * @return
     */
    public static List<OptionVO<String, Integer>> getStateTypeList() {
        return stateTypeList;
    }

    /**
     * 获取文字标签
     * @return
     */
    public static List<OptionVO<String, Integer>> getTxtTag() {
        return txtTagList;
    }

    /**
     * 获取单位
     * @return
     */
    public static List<OptionVO<String, Integer>> getUnitList() {
        return unitList;
    }

    /**
     * 获取规格
     * @return
     */
    public static List<OptionVO<String, Integer>> getSpecList() {
        return specList;
    }


    public static List<OptionVO<String, Integer>> toList(NameCode[] ncPairs) {
        return Collections.unmodifiableList(Arrays.asList(ncPairs).stream()
                .map(nc -> OptionVO.newOption(nc.getName(), nc.getCode())).collect(Collectors.toList()));
    }
}
