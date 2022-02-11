package com.sachin.LearningApp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("Configuration.xml");
    	Login f=ac.getBean("login",Login.class);
        f.setVisible(true);
        
    }
}
