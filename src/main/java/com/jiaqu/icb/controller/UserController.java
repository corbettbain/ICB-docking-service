package com.jiaqu.icb.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.corbett.annotation.CheckParam;
import com.corbett.entity.ReturnMessage;
import com.corbett.enums.ParamType;
import com.jiaqu.icb.pojo.order.publics.Rd;
import com.jiaqu.icb.pojo.user.User;
import com.jiaqu.icb.service.user.IUserService;

import jiaqugs.TestResult;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request,Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        
        List<User> users = new ArrayList<>();
		users.add(user);
		List<Rd> rds = new ArrayList<>();
		rds.add(new Rd());
		com.jiaqu.icb.pojo.result.TestResult testResult = new com.jiaqu.icb.pojo.result.TestResult(1, "2", User.class.getSimpleName(),users,Rd.class.getSimpleName(), rds);
		
        model.addAttribute("user", testResult);
        return "showUser";
    }
    
    @CheckParam(paramPosition = 1,paramType = ParamType.STRING,paramChangeType = ParamType.JSON,paramChangedType = User.class,errorResult="flag")
    @RequestMapping(value = "/showUser1" ,method = RequestMethod.POST)
    @ResponseBody
    public ReturnMessage toIndex1(HttpServletRequest request,String data){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        
        List<User> users = new ArrayList<>();
		users.add(user);
		List<Rd> rds = new ArrayList<>();
		rds.add(new Rd());
		
       
        return new ReturnMessage();
    }
}