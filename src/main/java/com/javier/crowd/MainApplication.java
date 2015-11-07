package com.javier.crowd;

import android.app.Application;

import com.javier.crowd.model.Task;
import com.javier.crowd.utils.Constants;

import garin.artemiy.sqlitesimple.library.SQLiteSimple;
import garin.artemiy.sqlitesimple.library.util.SimpleDatabaseUtil;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (SimpleDatabaseUtil.isFirstApplicationStart(this)) {
            SQLiteSimple databaseSimple = new SQLiteSimple(this, Constants.DATABASE_NAME);
//            databaseSimple.rawQuery("CREATE  TABLE "main"."Sentence" ("_id" VARCHAR PRIMARY KEY NOT NULL , "sentence_origin" VARCHAR NOT NULL , "sentence_destination" VARCHAR NOT NULL , "language_origin" VARCHAR NOT NULL, "language_destination" VARCHAR NOT NULL )");
//            databaseSimple.create(Task.class);
//            databaseSimple.create(Question.class);
//            databaseSimple.create(Option.class);
        }
    }
}
