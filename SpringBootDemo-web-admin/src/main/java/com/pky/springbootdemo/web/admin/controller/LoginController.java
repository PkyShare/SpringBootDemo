package com.pky.springbootdemo.web.admin.controller;

import com.pky.springbootdemo.commons.domain.TbUser;
import com.pky.springbootdemo.commons.dto.AbstractBaseResult;
import com.pky.springbootdemo.commons.service.LoginService;
import com.pky.springbootdemo.commons.utils.BeanValidator;
import com.pky.springbootdemo.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 登录控制器
 */
@CrossOrigin // 跨域处理
@RestController
@RequestMapping(value = "v1/login")
public class LoginController extends AbstractBaseController<TbUser> {

    @Autowired
    LoginService loginService;

    /**
     * 测试
     * @return
     */
    @GetMapping(value = "")
    public AbstractBaseResult testLogin(TbUser tbUser){

        //数据校验
        String message = BeanValidator.validator(tbUser);
        if(StringUtils.isNotBlank(message)){
            return error(message, "null");
        }

        TbUser user = loginService.testExample(tbUser);

        if(user == null) {
            return error("用户名或密码错误！", null);
        }

        return success(request.getRequestURI(), tbUser);
    }
}
