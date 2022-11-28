package com.enigmacamp.student.container;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppContainer {

    public static void run(Class appClass, String... args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(appClass);

        ctx.registerBean("app", appClass);
        String[] beans = ctx.getBeanDefinitionNames();
        for (String bean : beans) {
            try {
                AppRunner appRunner = (AppRunner) ctx.getBean(bean);
                appRunner.run(args);
            } catch (ClassCastException e) {
            }
        }
    }

}
