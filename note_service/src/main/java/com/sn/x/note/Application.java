package com.sn.x.note;

import ch.qos.logback.classic.BasicConfigurator;
import com.sn.x.note.domain.PlanDetails;
import com.sn.x.note.service.impl.PlanServiceImpl;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 应用启动类
 * <p>
 * Created by bysocket on 09/29/2017.
 */
// Spring Boot 应用的标识
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class, args);
    }


//    @Test
//    public void insertTest() {
//        PlanServiceImpl planService = new PlanServiceImpl();
//        PlanDetails planDetails = new PlanDetails();
//        planDetails.setPlanId(1);
//        planDetails.setPlanContent("AAA");
//        planDetails.setPlanCreateTime(System.currentTimeMillis() + "");
//        planDetails.setPlanRemindTime(System.currentTimeMillis() + "");
//        planDetails.setPlanStatus(1);
//        planDetails.setPlanName("This is a title");
//        planService.insertPlan(planDetails);
//    }
}
