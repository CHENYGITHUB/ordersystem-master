package com.guangdong.ordersystem.controller;

import com.guangdong.ordersystem.mapper.FoodMapper;
import com.guangdong.ordersystem.mapper.FoodtypeMapper;
import com.guangdong.ordersystem.pojo.Food;
import com.guangdong.ordersystem.pojo.FoodExample;
import com.guangdong.ordersystem.pojo.FoodtypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ChuanCuisineController {
//    @Autowired
//    FoodtypeMapper foodtypeMapper;
//    @RequestMapping("emps")
//    public String Cuisine(Model model){
//        FoodtypeExample example=new FoodtypeExample();
//        example.createCriteria().getAllCriteria();
//        foodtypeMapper.selectByExample(example);
//        model.addAttribute("emps",example);
//        return "ChuanCuisine";
//    }
    @Autowired
     FoodMapper foodMapper;
    @RequestMapping("list")
     public String CuisineList(Model model){
         FoodExample  example = new FoodExample();
         example.createCriteria().getAllCriteria();
        List<Food> foods = foodMapper.selectByExample(example);
        model.addAttribute("CanList",foods);
         return "ChuanCuisine";
     }
}
