package com.guangdong.ordersystem.mapper;

import com.guangdong.ordersystem.pojo.Foodtype;
import com.guangdong.ordersystem.pojo.FoodtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodtypeMapper {
    int countByExample(FoodtypeExample example);

    int deleteByExample(FoodtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Foodtype record);

    int insertSelective(Foodtype record);

    List<Foodtype> selectByExample(FoodtypeExample example);

    Foodtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Foodtype record, @Param("example") FoodtypeExample example);

    int updateByExample(@Param("record") Foodtype record, @Param("example") FoodtypeExample example);

    int updateByPrimaryKeySelective(Foodtype record);

    int updateByPrimaryKey(Foodtype record);
}