package com.sn.x.note.domain;

public class PlanDetails {

    private int planId;

    private String planName;

    private String planCreateTime;

    private String planRemindTime;

    private String planContent;

    private int planStatus;

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanCreateTime() {
        return planCreateTime;
    }

    public void setPlanCreateTime(String planCreateTime) {
        this.planCreateTime = planCreateTime;
    }

    public String getPlanRemindTime() {
        return planRemindTime;
    }

    public void setPlanRemindTime(String planRemindTime) {
        this.planRemindTime = planRemindTime;
    }

    public String getPlanContent() {
        return planContent;
    }

    public void setPlanContent(String planContent) {
        this.planContent = planContent;
    }

    public int getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(int planStatus) {
        this.planStatus = planStatus;
    }



    @Override
    public String toString() {
        return "PlanDetails{" +
                "planId=" + planId +
                ", planName='" + planName + '\'' +
                ", planCreateTime='" + planCreateTime + '\'' +
                ", planRemindTime='" + planRemindTime + '\'' +
                ", planContent='" + planContent + '\'' +
                ", planStatus=" + planStatus +
                '}';
    }
}
