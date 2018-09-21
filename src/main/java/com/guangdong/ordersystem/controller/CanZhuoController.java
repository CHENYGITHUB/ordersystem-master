package com.guangdong.ordersystem.controller;

import com.guangdong.ordersystem.mapper.DinnertableMapper;
import com.guangdong.ordersystem.pojo.Dinnertable;
import com.guangdong.ordersystem.pojo.DinnertableExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CanZhuoController {
    @Autowired
    DinnertableMapper dinnertableMapper;
    @RequestMapping("CanzhuoList")
    public String CanZhuoList(Model model) {
      DinnertableExample example = new DinnertableExample();
      example.createCriteria().getAllCriteria();
      List<Dinnertable> dinnertables = dinnertableMapper.selectByExample(example);
      model.addAttribute("CanList", dinnertables);
      return "canzhuo";

    }
}
