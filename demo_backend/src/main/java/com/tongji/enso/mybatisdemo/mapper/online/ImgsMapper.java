package com.tongji.enso.mybatisdemo.mapper.online;

import com.tongji.enso.mybatisdemo.entity.online.Imgs;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImgsMapper {

    String findSICByDate(String year, String month, String day);

    String findNAOByMonth(String year, String month);

    List<Imgs> findAllByType(String type);

import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ImgsMapper {

    /**
     * 从 imgs 中查询指定年、月、日、类型的数据
     * @return
     */
    @Select("SELECT * FROM imgs WHERE year = #{year} AND month = #{month} AND day = #{day} AND type = #{type}")
    List<Imgs> findImgsInfoByDayType(@RequestParam("year") String year, @RequestParam("month") String month, @RequestParam("day") String day, @RequestParam("type") String type);


}
