package com.sailing.springbootmybatis.controller;

import com.sailing.springbootmybatis.bean.Userinfo;
import com.sailing.springbootmybatis.service.UserinfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

/**
 * @author baibing
 * @project: springboot-mybatis
 * @package: com.sailing.springbootmybatis.controller
 * @Description: Userinfo controller 控制层
 * @date 2018/9/12 10:07
 */
@RestController
@Api(value = "USERINFO", description = "用户信息测试controller")
public class UserinfoController{

    @Autowired
    private UserinfoService userinfoService;


    /**
     * 删除指定用户
     * @return
     */
    @RequestMapping(value = "/deleteUser")
    public Object deleteUser(){
        return userinfoService.deleteUser(1);
    }




}
