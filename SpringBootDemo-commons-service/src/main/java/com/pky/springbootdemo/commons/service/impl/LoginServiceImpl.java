package com.pky.springbootdemo.commons.service.impl;

import com.pky.springbootdemo.commons.domain.TbUser;
import com.pky.springbootdemo.commons.mapper.TbUserMapper;
import com.pky.springbootdemo.commons.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * 登录业务逻辑实现
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    TbUserMapper tbUserMapper;

    /**
     * 测试
     * @return
     */
    @Override
    public String test() {
        return "testService";
    }


    /**
     * 通过用户名获取 tbUser
     * @param tbUser
     * @return
     */
    @Override
    public TbUser getUser(TbUser tbUser) {
        tbUserMapper.selectOne(tbUser);
        return null;
    }

    /**
     * tk_mybatis 的 example 测试
     * @param tbUser
     * @return
     */
    @Override
    public TbUser testExample(TbUser tbUser) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", tbUser.getUsername());
        TbUser user = tbUserMapper.selectOneByExample(example);

        if(user != null) {
            return user;
        }
        return null;
    }
}
