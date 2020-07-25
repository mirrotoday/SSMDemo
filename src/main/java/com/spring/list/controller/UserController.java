package com.spring.list.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.spring.list.entity.User;
import com.spring.list.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import javax.annotation.Resource;
import java.util.List;


/**
 * User 的控制类
 *
 * @author Freestyle
 */
@Controller
@RequestMapping("")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("user.do")
    public String queryAll(@RequestParam(name="page",defaultValue="1") Integer page,Model model){

        PageHelper.startPage(page, 4);//每页条数=4
        //查询数据
        List<User> user_list = userService.finAll();
        //查看一下是否查到了数据
        for (User user : user_list) {
            System.out.println("========="+user);
        }
        /**
         * pageNum:当前页
         * pageSize:每页的数量
         * size:当前页的数量
         * pages:总页数
         * total:总记录数
         */

        /**
         *  PageInfo就是当初那个分页工具类(分页bean)
         */
        PageInfo<User> pageInfo = new PageInfo<User>(user_list);//把数据放在分页类中
        //封装数据
        model.addAttribute("user_list", user_list);
        System.out.println("user_list的值为:" + user_list);
        //传分页类
        model.addAttribute("pageInfo", pageInfo);
        System.out.println("pageInfo的值为:" + pageInfo);
        return "index";//跳转页面

    }

/**
 *   @Resource(name="userService")
 *     private UserService userService;
 *
    @RequestMapping(value ="index")
    public String findUser(Model model) {
        int id = 1;
        User user = this.userService.findUserByid(id);
        model.addAttribute("user", user);
        return "index";
    }

*/



}