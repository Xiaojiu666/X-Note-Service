package com.sn.x.note.controller;

import com.sn.x.note.domain.PlanDetails;
import com.sn.x.note.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlanController {

    @Autowired
    private PlanService planService;

    @RequestMapping(value = "/plan/create", method = RequestMethod.POST)
    public void createPlan(@RequestBody PlanDetails planDetails) {
        planService.insertPlan(planDetails);
    }



}
