package com.frankmoley.lil.fid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.frankmoley.lil.fid.config.ApplicationConfig;
import com.frankmoley.lil.fid.service.OutputService;

public class Application {

    public static void main(String[] args) throws Exception {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    	OutputService outputService = context.getBean(OutputService.class);
    	
//        GreetingService greetingService = new GreetingService("Hello");
//        TimeService timeService = new TimeService(true);
//        OutputService outputService = new OutputService(greetingService, timeService);

        for (int i=0;i<5;i++){
            outputService.generateOutput("Frank");
            Thread.sleep(5000);
        }
    }
}
