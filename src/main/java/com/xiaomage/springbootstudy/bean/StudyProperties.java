package com.xiaomage.springbootstudy.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xiaomage
 * @date 2019/5/3 - 21:31
 */
@Component
public class StudyProperties {

    @Value("${com.xiaomage.study.name}")
    private  String name;

    @Value("${com.xiaomage.study.title}")
    private  String title;

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
