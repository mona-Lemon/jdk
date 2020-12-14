package com.zking.ssm.controller;

import com.zking.ssm.model.Book;
import com.zking.ssm.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * @author mona
 * @site www.xiaomage.com
 * @company T250
 * @create  2020-12-02 16:29
 */
@Controller
@RequestMapping("/book")
public class HelloController {
    //注入
    @Autowired
    private IBookService iBookService;

    //类似于钩子函数,预先加载数据
    @ModelAttribute
    public void getBook(Model model){
        Book b=iBookService.selectByPrimaryKey(3);
        model.addAttribute("book",b);
    }


    //请求的映射
    @RequestMapping("/how")
    public String how(@RequestParam("userName")String userName, HttpServletRequest request){
        System.out.println(userName);
        request.setAttribute( "userName",userName);
        System.out.println("Hello lyy");
        return "Login";
    }

    @RequestMapping("/what")
    public String what(){
        System.out.println(11111111);
        return "Top";
    }

    @RequestMapping("{language}")
    public String change(@PathVariable String language, HttpSession session, HttpServletRequest request){
        if("zh".equals(language)){
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME, Locale.CHINA);
        }else if("en".equals(language)) {
            session.setAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME,Locale.US);
        }
        else{
            throw new RuntimeException("不支持该语言["+language+"]");
        }

        return "Top";
    }



}
