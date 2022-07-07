package com.sn.x.note.controller;

import com.sn.x.note.domain.PlanDetails;
import com.sn.x.note.service.PlanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PlanController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlanController.class);

    @Autowired
    private PlanService planService;

    @RequestMapping(value = "/plan/create", method = RequestMethod.POST)
    public void createPlan(@RequestBody PlanDetails planDetails) {
        planService.insertPlan(planDetails);
    }

    @RequestMapping(value = "/plan/query", method = RequestMethod.GET)
    public PlanDetails getPlan4Id(@RequestParam(value = "planId", required = true) int planId) {
        PlanDetails plan4Id = planService.findPlan4Id(planId);
        LOGGER.debug(plan4Id.toString());
        return plan4Id;
    }


}
