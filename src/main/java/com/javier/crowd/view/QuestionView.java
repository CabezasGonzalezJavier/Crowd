package com.javier.crowd.view;

import android.content.Context;

import com.javier.crowd.model.Question;

import java.util.List;

/**
 * Created by javiergonzalezcabezas on 8/11/15.
 */
public interface QuestionView {
    void returnData(List<Question> list);
    Context getContext();
}
