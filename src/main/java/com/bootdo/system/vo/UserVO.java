package com.bootdo.system.vo;

import com.bootdo.system.domain.FuserDO;
import com.bootdo.system.domain.UserDO;

/**
 * @author gaoyuzhe
 * @date 2017/12/15.
 */
public class UserVO {
    /**
     * 更新的用户对象
     */
    private UserDO userDO = new UserDO();
    private FuserDO fuserDO = new FuserDO();
    /**
     * 旧密码
     */
    private String pwdOld;
    /**
     * 新密码
     */
    private String pwdNew;

    public UserDO getUserDO() {
        return userDO;
    }
    public FuserDO getFuserDO() {
        return fuserDO;
    }
    public void setUserDO(UserDO userDO) {
        this.userDO = userDO;
    }
    public void setFuserDO(FuserDO userDO) {
        this.fuserDO = userDO;
    }
    public String getPwdOld() {
        return pwdOld;
    }

    public void setPwdOld(String pwdOld) {
        this.pwdOld = pwdOld;
    }

    public String getPwdNew() {
        return pwdNew;
    }

    public void setPwdNew(String pwdNew) {
        this.pwdNew = pwdNew;
    }
}
