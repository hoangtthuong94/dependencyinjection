
package com.hoanghuong.springdependencyinjection;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        TextEditor editor = (TextEditor)context.getBean("textEditor");
        editor.spellCheck();
    }
}
