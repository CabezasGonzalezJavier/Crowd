package com.javier.crowd.model;

import com.javier.crowd.utils.Constants;

import java.util.ArrayList;
import java.util.List;

import garin.artemiy.sqlitesimple.library.annotations.Column;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class Question {

    @Column(name = Constants._ID)
    private Integer id;
    @Column(name = Constants.TITLE)
    private String title;
    @Column(name = Constants.SUMMARY)
    private String summary;
    private List<Option> options = new ArrayList<Option>();
    @Column(name = Constants.TASK_ID)
    private String taskId;
    @Column(name = Constants.SET_OPTION)
    private String setOption;

    public String getSetOption() {
        return setOption;
    }

    public void setSetOption(String setOption) {
        this.setOption = setOption;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

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