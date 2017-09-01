package com.poc.controller;

import com.poc.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.mvc.multiaction.PropertiesMethodNameResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Controller
//@RequestMapping("/")
public class HelloController extends MultiActionController {

    private HelloService helloService;
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
  public ModelAndView sayHello(HttpServletRequest request, HttpServletResponse response){
      ModelAndView model = new ModelAndView("hello");
      model.addObject("message", helloService.getHelloMessage("getting.."));
      return model;
  }

    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        ModelAndView model = new ModelAndView("hello");
        model.addObject("message", helloService.getHelloMessage("adding..."));
        return model;
    }

    public ModelAndView modify(HttpServletRequest request, HttpServletResponse response){
        ModelAndView model = new ModelAndView("hello");
        model.addObject("message", helloService.getHelloMessage("updating..."));
        return model;
    }



   /* @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("message", "Spring MVC XML Config Example");
        return "hello";
    }*/



   /* @RequestMapping(method = RequestMethod.GET)
    public Test index(){
        //ModelMap model
        //model.addAttribute("message", "Spring MVC XML Config Example");

        return new Test("Gopal", 152);
    }*/
}