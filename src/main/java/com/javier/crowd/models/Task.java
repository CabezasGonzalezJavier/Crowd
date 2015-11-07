package com.javier.crowd.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class Task {
    private Integer id;
    private String title;
    private List<Question> questions = new ArrayList<Question>();
    private Boolean hidden;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The questions
     */
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     *
     * @param questions
     * The questions
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    /**
     *
     * @return
     * The hidden
     */
    public Boolean getHidden() {
        return hidden;
    }

    /**
     *
     * @param hidden
     * The hidden
     */
    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

}
