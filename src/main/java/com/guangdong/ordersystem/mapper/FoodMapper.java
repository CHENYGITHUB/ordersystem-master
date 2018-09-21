package com.guangdong.ordersystem.mapper;

import com.guangdong.ordersystem.pojo.Food;
import com.guangdong.ordersystem.pojo.FoodExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FoodMapper {
    int countByExample(FoodExample example);

    int deleteByExample(FoodExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Food record);

    int insertSelective(Food record);

    List<Food> selectByExample(FoodExample example);

    Food selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByExample(@Param("record") Food record, @Param("example") FoodExample example);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);
}