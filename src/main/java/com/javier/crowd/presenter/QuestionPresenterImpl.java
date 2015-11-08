package com.javier.crowd.presenter;

import com.javier.crowd.view.QuestionView;

/**
 * Created by javiergonzalezcabezas on 8/11/15.
 */
public class QuestionPresenterImpl implements QuestionPresenter {

    private QuestionView mQuestionView;

    public QuestionPresenterImpl(QuestionView mQuestionView) {
        this.mQuestionView = mQuestionView;
    }

    @Override
    public void getData() {

    }
}
