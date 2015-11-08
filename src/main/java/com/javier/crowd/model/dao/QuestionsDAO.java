package com.javier.crowd.model.dao;

import android.content.Context;

import com.javier.crowd.model.Question;
import com.javier.crowd.utils.Constants;

import garin.artemiy.sqlitesimple.library.SQLiteSimpleDAO;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class QuestionsDAO extends SQLiteSimpleDAO<Question> {
    public QuestionsDAO(Context context) {
        super(Question.class, context, Constants.DATABASE_NAME);
    }
}
