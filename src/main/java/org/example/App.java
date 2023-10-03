package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
//        HelloWorld hw = (HelloWorld)ac.getBean("myBean");
//        System.out.println(hw.getName());
//        Student sobj = (Student)ac.getBean("studentBean");
          Student sobj = ac.getBean("studentBean",Student.class);
        System.out.println(sobj);
        ((AbstractApplicationContext)ac).close();
    }
}
