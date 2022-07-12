package com.sn.x.note.controller;

import com.sn.x.note.domain.PlanDetails;
import com.sn.x.note.service.PlanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlanController {

    private static Logger LOGGER = LoggerFactory.getLogger(PlanController.class);

    @Autowired
    private PlanService planService;

    @RequestMapping(value = "/plan/create", method = RequestMethod.POST)
    public void createPlan(@RequestBody PlanDetails planDetails) {
        planService.insertPlan(planDetails);
    }

    @RequestMapping(value = "/plan/update", method = RequestMethod.POST)
    public void updatePlan(@RequestBody PlanDetails planDetails) {
        planService.upDatePlan(planDetails);
    }

    @RequestMapping(value = "/plan/query", method = RequestMethod.GET)
    public PlanDetails getPlan4Id(@RequestParam(value = "planId", required = true) int planId) {
        PlanDetails plan4Id = planService.findPlan4Id(planId);
        LOGGER.debug("debug " + plan4Id.toString());
        LOGGER.info("debug " + plan4Id.toString());
        LOGGER.error("debug " + plan4Id.toString());
        LOGGER.warn("debug " + plan4Id.toString());
        return plan4Id;
    }

    @RequestMapping(value = "/plan/query/all", method = RequestMethod.GET)
    public List<PlanDetails> getPlans() {
        List<PlanDetails> plans = planService.findPlans();
        LOGGER.info("plans " + plans.toString());
        return plans;
    }

    @RequestMapping(value = "/plan/delete", method = RequestMethod.GET)
    public boolean deletePlan4Id(@RequestParam(value = "planId", required = true) int planId) {
        boolean plan4Id = planService.deletePlan4Id(planId);
        LOGGER.warn("debug " + plan4Id);
        return false;
    }


}
