package com.mcom.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String springConfig = "**/*-config.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(springConfig);
        
        ctx.getBean(AnotherBean.class);
        
        ctx.close();
    }
}

