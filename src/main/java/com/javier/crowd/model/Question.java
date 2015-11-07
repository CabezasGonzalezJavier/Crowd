package com.javier.crowd.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class Question {


    private Integer id;

    private String title;

    private String summary;

    private List<Option> options = new ArrayList<Option>();


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getSummary() {
        return summary;
    }


    public void setSummary(String summary) {
        this.summary = summary;
    }


    public List<Option> getOptions() {
        return options;
    }


    public void setOptions(List<Option> options) {
        this.options = options;
    }

}