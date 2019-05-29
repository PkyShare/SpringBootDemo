package com.pky.springbootdemo.web.admin.controller;

import com.pky.springbootdemo.commons.domain.TbUser;
import com.pky.springbootdemo.commons.dto.AbstractBaseResult;
import com.pky.springbootdemo.commons.utils.BeanValidator;
import com.pky.springbootdemo.web.admin.controller.base.AbstractBaseController;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "v1/login")
public class LoginController extends AbstractBaseController<TbUser> {

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

        return success(request.getRequestURI(), tbUser);
    }
}
