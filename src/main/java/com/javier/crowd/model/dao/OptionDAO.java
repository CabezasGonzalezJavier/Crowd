package com.javier.crowd.model.dao;

import android.content.Context;

import com.javier.crowd.model.Option;
import com.javier.crowd.utils.Constants;

import garin.artemiy.sqlitesimple.library.SQLiteSimpleDAO;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class OptionDAO extends SQLiteSimpleDAO<Option> {
    public OptionDAO( Context context) {
        super(Option.class, context, Constants.DATABASE_NAME);
    }
}
