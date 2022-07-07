package com.sn.x.note.service.impl;

import com.sn.x.note.dao.PlanDao;
import com.sn.x.note.domain.PlanDetails;
import com.sn.x.note.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    PlanDao planDao;

    @Override
    public boolean insertPlan(PlanDetails details) {
        int i = planDao.insertPlan(details);
        return true;
    }

    @Override
    public boolean deletePlan4Id(int planId) {
        return false;
    }

    @Override
    public PlanDetails findPlan4Id(int planId) {
        return null;
    }
}
