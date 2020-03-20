package cn.teamar.genki.pos.basic.dao.ext;

import cn.teamar.genki.common.tools.vo.NameCodeVO;
import cn.teamar.genki.pos.basic.vo.pos.PosUserListVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @program: genki-basic
 * @description: 用户Mapper扩展
 * @author: jie.pang
 * @create: 2018-07-30 16:15
 **/

public interface TUserMapperExt {

    List<NameCodeVO> selectIdAndNameBySid(@Param("sid") long sid);
    List<PosUserListVO> selectBySidAndCondition(@Param("sid") Long sid, @Param("real_name") String realName, @Param("mobile") String mobile);
    List<Long> selectDutyByUserId(Long id);
    List<Long> selectDutyByUserIds(Long id);
    List<Long> selectRightByUserIds(Long id);
}
