package com.sn.x.note.dao;

import com.sn.x.note.domain.PlanDetails;
import org.apache.ibatis.annotations.*;

import java.util.List;

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
    PlanDetails findPlanById(@Param("planId") int planId);


    @Insert("INSERT INTO plan(plan_name,plan_create_time,plan_remind_time,plan_content,plan_status) " +
            "values(#{planName},#{planCreateTime},#{planRemindTime},#{planContent},#{planStatus}) ")
    int insertPlan(PlanDetails details);

    @Select("SELECT * FROM plan")
    @Results({
            @Result(property = "planId", column = "plan_id"),
            @Result(property = "planName", column = "plan_name"),
            @Result(property = "planCreateTime", column = "plan_create_time"),
            @Result(property = "planRemindTime", column = "plan_remind_time"),
            @Result(property = "planContent", column = "plan_content"),
            @Result(property = "planStatus", column = "plan_status"),
    })
    List<PlanDetails> findPlans();


    @Delete("DELETE FROM plan WHERE plan_id = #{planId};")
    int deletePlan(@Param("planId")int planId);

    @Update({ "update plan set " +
            "plan_name = #{planName}," +
            "plan_content = #{planContent}," +
            "plan_remind_time = #{planRemindTime}," +
            "plan_status = #{planStatus}" +
            " where "  +
            "plan_id = #{planId}" })
    int updatePlan4Id(PlanDetails details);

}
