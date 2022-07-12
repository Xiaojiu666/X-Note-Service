package com.sn.x.note.service;


import com.sn.x.note.domain.PlanDetails;

import java.util.List;

public interface PlanService {

    //
    boolean insertPlan(PlanDetails details);

    boolean deletePlan4Id(int planId);

    PlanDetails findPlan4Id(int planId);

    List<PlanDetails> findPlans();

     boolean upDatePlan(PlanDetails details);


}
