package com.javier.crowd.model;

import com.javier.crowd.utils.Constants;

import garin.artemiy.sqlitesimple.library.annotations.Column;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class Option {
    @Column(name = Constants._ID)
    private Integer id;
    @Column(name = Constants.TYPE)
    private String type;
    @Column(name = Constants.LABEL)
    private String label;
    @Column(name = Constants.QUESTION_ID)
    private Integer questionId;

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
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The label
     */
    public String getLabel() {
        return label;
    }

    /**
     *
     * @param label
     * The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

}
