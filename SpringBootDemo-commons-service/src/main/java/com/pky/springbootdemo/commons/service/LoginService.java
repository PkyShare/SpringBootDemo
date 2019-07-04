package com.pky.springbootdemo.commons.service;

import com.pky.springbootdemo.commons.domain.TbUser;

public interface LoginService {

    /**
     * 测试
     * @return
     */
    String test();

    /**
     * 通过用户名获取 tbUser
     * @param tbUser
     * @return
     */
    TbUser getUser(TbUser tbUser);

    /**
     * tk_mybatis 的 example 测试
     * @param tbUser
     * @return
     */
    TbUser testExample(TbUser tbUser);
}
