package com.vincent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	/* 관리자 메인 페이지 이동 */
    @RequestMapping(value="main", method = RequestMethod.GET)
    public void adminMainGET() throws Exception{
        
        System.out.println("관리자 페이지 이동");
        
    }
    /* 주문 관리 페이지 접속 */
    @RequestMapping(value = "orderManage", method = RequestMethod.GET)
    public void orderManageGET() throws Exception{
       
    }
    /* 상품 등록 페이지 접속 */
    @RequestMapping(value = "goodsManage", method = RequestMethod.GET)
    public void goodsManageGET() throws Exception{
       
    }
    
    /* 상품 판매 등록 페이지 접속 */
    @RequestMapping(value = "goodsEnroll", method = RequestMethod.GET)
    public void goodsEnrollGET() throws Exception{
       
    }
   
    
    /* 회원 관리 페이지 접속 */
    @RequestMapping(value = "memberManage", method = RequestMethod.GET)
    public void authorManageGET() throws Exception{
       
    }    

}
