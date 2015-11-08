package com.javier.crowd.presenter;

import com.javier.crowd.model.Question;

/**
 * Created by javiergonzalezcabezas on 8/11/15.
 */
public interface QuestionPresenter {
    void getData(int id);
    void setOption(String option,Question question);

}
