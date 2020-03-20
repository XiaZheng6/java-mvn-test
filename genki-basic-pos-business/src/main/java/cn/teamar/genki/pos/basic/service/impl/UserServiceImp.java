package cn.teamar.genki.pos.basic.service.impl;

import cn.teamar.genki.basic.common.enums.DataStateEnum;
import cn.teamar.genki.basic.common.enums.ErrorsEnum;
import cn.teamar.genki.basic.common.utils.Assert;
import cn.teamar.genki.common.consts.State;
import cn.teamar.genki.common.tools.vo.NameCodeVO;
import cn.teamar.genki.pos.basic.dao.TUserMapper;
import cn.teamar.genki.pos.basic.dao.ext.TUserMapperExt;
import cn.teamar.genki.pos.basic.errors.Errors;
import cn.teamar.genki.pos.basic.po.TUser;
import cn.teamar.genki.pos.basic.po.TUserExample;
import cn.teamar.genki.pos.basic.service.UserService;
import cn.teamar.genki.pos.basic.utils.Password;
import cn.teamar.genki.pos.basic.vo.pos.PosUserListVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: genki-basic
 * @description: UserServiceImp
 * @author: jie.pang
 * @create: 2018-07-30 15:45
 **/
@Slf4j
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private TUserMapper userMapper;
    @Autowired
    private TUserMapperExt userMapperExt;

    @Override
    public List<TUser> selectBySid(long sid) {
        TUserExample ex = new TUserExample();
        ex.createCriteria().andSIdEqualTo(sid).andStateNotEqualTo((byte)DataStateEnum.DATA_STATE_DELETE.getCode());
        return userMapper.selectByExample(ex);
    }

    @Override
    public TUser getByUserName(String userName) {
        TUserExample ex = new TUserExample();
        ex.createCriteria().andUserNameEqualTo(userName).andStateEqualTo(State.IN_USE.getCode()).andIsPrimaryEqualTo((byte) 1);
        List<TUser> users = userMapper.selectByExample(ex);
        if (users == null || users.size() == 0) return null;
        if (users.size() > 1) throw new IllegalStateException("Multiple Users Named '" + userName + "'!");
        return users.get(0);
    }


    @Override
    public List<NameCodeVO> selectNamesWithId(long sid) {
        return userMapperExt.selectIdAndNameBySid(sid);
    }



    @Override
    public TUser getById(long userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public Page<TUser> selectBySid(long sid, int start, int size) {
        TUserExample ex = new TUserExample();
        ex.createCriteria().andSIdEqualTo(sid).andStateEqualTo(State.IN_USE.getCode());
        Page<TUser> result = PageHelper.offsetPage(start, size);
        userMapper.selectByExample(ex);
        return result;
    }
    @Override
    public List<TUser> selectBySids(long sid) {
        TUserExample ex = new TUserExample();
        ex.createCriteria().andSIdEqualTo(sid).andStateEqualTo(State.IN_USE.getCode());
        return userMapper.selectByExample(ex);
    }

    /**
     * 根据用户ID查询关联到职能ID
     * @param id
     * @return
     */
    @Override
    public List<Long> dutyIdList(Long id){
        return userMapperExt.selectDutyByUserIds(id);
    }
/**
     * 根据用户ID查询关联到权限ID
     * @param id
     * @return
     */
    @Override
    public List<Long> rightIdList(Long id){
        return userMapperExt.selectRightByUserIds(id);
    }

    @Override
    public Page<TUser> selectByGid(long gid, int start, int size) {
        TUserExample ex = new TUserExample();
        ex.createCriteria().andGIdEqualTo(gid).andStateEqualTo(State.IN_USE.getCode());
        Page<TUser> result = PageHelper.offsetPage(start, size);
        userMapper.selectByExample(ex);
        return result;
    }

    @Override
    public Page<PosUserListVO> selectBySidAndCondition(long sid, String realName, String mobile, int offsize, int size) {
        Page<PosUserListVO> result = PageHelper.offsetPage(offsize, size);
        userMapperExt.selectBySidAndCondition(sid, realName,mobile);
        return result;
    }


    /**
     * 修改密码服务(POS端传来密文)
     * 1:旧密码 oldPassWord 2: 新密码 newPassWord
     * 2：旧密码 oldPassWord 需要MD5加密
     */
    @Override
    public TUser updatePassWord(Long userId, String oldPassWord, String newPassWord){
        TUser user = userMapper.selectByPrimaryKey(userId);
        if (user != null) {
            if(user.getIsPrimary()!=1){
                Assert.isTrue(oldPassWord.equals(user.getPassword()), Errors.INCORRECT_MESSAGE.params("旧密码"));
                user.setPassword(newPassWord);
                int ret = userMapper.updateByPrimaryKeySelective(user);
                if (ret != 1) {
                    Assert.isTrue(ret==1, Errors.UPDATE_MESSAGE.params("修改密码"));
                }
            }else{
                Assert.isTrue(user.getIsPrimary()!=1, Errors.PRIMARY_MESSAGE.params(user.getUserName()));
            }
        }else{
            Assert.notNull(user, Errors.USER_NOT_EXISTS);
        }
        return user;
    }


}
