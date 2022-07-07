package com.sn.x.note.service;


import com.sn.x.note.domain.PlanDetails;

public interface PlanService {

    //
    boolean insertPlan(PlanDetails details);

    boolean deletePlan4Id(int planId);

    PlanDetails findPlan4Id(int planId);



}
