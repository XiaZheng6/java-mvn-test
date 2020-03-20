package cn.teamar.genki.pos.basic.service;

import cn.teamar.genki.common.tools.vo.NameCodeVO;
import cn.teamar.genki.pos.basic.po.TUser;
import cn.teamar.genki.pos.basic.vo.pos.PosUserListVO;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * @program: genki-basic
 * @description: UserService
 * @author: jie.pang
 * @create: 2018-07-30 15:44
 **/
public interface UserService {


    List<TUser> selectBySid(long sid);

    TUser getByUserName(String userName);

    List<NameCodeVO> selectNamesWithId(long sid);


    TUser getById(long userId);

    Page<TUser> selectBySid(long sid, int start, int size);

    List<TUser> selectBySids(long sid);

    List<Long> dutyIdList(Long id);

    List<Long> rightIdList(Long id);

    Page<TUser> selectByGid(long gid, int start, int size);

    Page<PosUserListVO> selectBySidAndCondition(long sid, String realName, String mobile, int offsize, int size);


    TUser updatePassWord(Long userId, String oldPassWord, String newPassWord);
}
