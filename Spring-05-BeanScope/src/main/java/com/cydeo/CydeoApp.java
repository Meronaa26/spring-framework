package com.cydeo;

import com.cydeo.Config.ProjectConfig;
import com.cydeo.model.Comment;
import com.cydeo.services.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        Comment comment =new Comment();
        comment.setAuthor("Jhonsen");
        comment.setText("Spring Framework");

        ApplicationContext context= new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService cs1 =context.getBean(CommentService.class);
        CommentService cs2 =context.getBean(CommentService.class);
        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs1==cs2);


    }
}
