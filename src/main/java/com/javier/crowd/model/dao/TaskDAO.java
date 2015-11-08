package com.javier.crowd.model.dao;

import android.content.Context;

import com.javier.crowd.model.Task;
import com.javier.crowd.utils.Constants;

import garin.artemiy.sqlitesimple.library.SQLiteSimpleDAO;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class TaskDAO extends SQLiteSimpleDAO<Task> {
    public TaskDAO(Context context) {
        super(Task.class, context, Constants.DATABASE_NAME);
    }
}
