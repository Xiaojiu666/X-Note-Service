package com.sn.x.note.dao;

import com.sn.x.note.domain.PlanDetails;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PlanDao {

    @Select("SELECT * FROM plan")
    @Results({
            @Result(property = "planId", column = "plan_id"),
            @Result(property = "planName", column = "plan_name"),
            @Result(property = "planCreateTime", column = "plan_create_time"),
            @Result(property = "planRemindTime", column = "plan_remind_time"),
            @Result(property = "planContent", column = "plan_content"),
            @Result(property = "planStatus", column = "plan_status"),
    })
    PlanDetails findPlanById(@Param("planId") String planId);


    @Insert("INSERT INTO plan(plan_id,plan_name,plan_create_time,plan_remind_time,plan_content,plan_status) " +
            "values(#{planId},#{planName},#{planCreateTime},#{planRemindTime},#{planContent},#{planStatus}) ")
    int insertPlan(PlanDetails details);



}
