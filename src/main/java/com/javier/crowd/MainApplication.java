package com.javier.crowd;

import android.app.Application;

import com.javier.crowd.model.Task;
import com.javier.crowd.utils.Constants;
import com.javier.crowd.utils.Utils;

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
            Utils.writeToFile("[\n" +
                    "    {\n" +
                    "        \"id\": 1,\n" +
                    "        \"title\": \"This is a task\",\n" +
                    "        \"questions\": [\n" +
                    "            {\n" +
                    "                \"id\": 1,\n" +
                    "                \"title\": \"question title here\",\n" +
                    "                \"summary\": \"question summary here\",\n" +
                    "                \"options\": [\n" +
                    "                    {\n" +
                    "                        \"id\": 1,\n" +
                    "                        \"type\": \"text\",\n" +
                    "                        \"label\": \"option label here\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "                  {\n" +
                    "                \"id\": 2,\n" +
                    "                \"title\": \"question title here\",\n" +
                    "                \"summary\": \"question summary here\",\n" +
                    "                \"options\": [\n" +
                    "                    {\n" +
                    "                        \"id\": 2,\n" +
                    "                        \"type\": \"text\",\n" +
                    "                        \"label\": \"option label here\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"hidden\": false\n" +
                    "    },\n" +
                    "        {\n" +
                    "        \"id\": 2,\n" +
                    "        \"title\": \"This is a task\",\n" +
                    "        \"questions\": [\n" +
                    "            {\n" +
                    "                \"id\": 3,\n" +
                    "                \"title\": \"question title here\",\n" +
                    "                \"summary\": \"question summary here\",\n" +
                    "                \"options\": [\n" +
                    "                    {\n" +
                    "                        \"id\": 3,\n" +
                    "                        \"type\": \"text\",\n" +
                    "                        \"label\": \"option label here\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"hidden\": false\n" +
                    "    },\n" +
                    "        {\n" +
                    "        \"id\": 3,\n" +
                    "        \"title\": \"This is a task\",\n" +
                    "        \"questions\": [\n" +
                    "            {\n" +
                    "                \"id\": 4,\n" +
                    "                \"title\": \"question title here\",\n" +
                    "                \"summary\": \"question summary here\",\n" +
                    "                \"options\": [\n" +
                    "                    {\n" +
                    "                        \"id\": 4,\n" +
                    "                        \"type\": \"text\",\n" +
                    "                        \"label\": \"option label here\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"hidden\": false\n" +
                    "    },\n" +
                    "        {\n" +
                    "        \"id\": 4,\n" +
                    "        \"title\": \"This is a task\",\n" +
                    "        \"questions\": [\n" +
                    "            {\n" +
                    "                \"id\": 5,\n" +
                    "                \"title\": \"question title here\",\n" +
                    "                \"summary\": \"question summary here\",\n" +
                    "                \"options\": [\n" +
                    "                    {\n" +
                    "                        \"id\": 5,\n" +
                    "                        \"type\": \"text\",\n" +
                    "                        \"label\": \"option label here\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "                 {\n" +
                    "                \"id\": 6,\n" +
                    "                \"title\": \"question title here\",\n" +
                    "                \"summary\": \"question summary here\",\n" +
                    "                \"options\": [\n" +
                    "                    {\n" +
                    "                        \"id\": 6,\n" +
                    "                        \"type\": \"text\",\n" +
                    "                        \"label\": \"option label here\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "                 {\n" +
                    "                \"id\": 7,\n" +
                    "                \"title\": \"question title here\",\n" +
                    "                \"summary\": \"question summary here\",\n" +
                    "                \"options\": [\n" +
                    "                    {\n" +
                    "                        \"id\": 7,\n" +
                    "                        \"type\": \"text\",\n" +
                    "                        \"label\": \"option label here\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"hidden\": false\n" +
                    "    },\n" +
                    "     {\n" +
                    "        \"id\": 5,\n" +
                    "        \"title\": \"This is a task\",\n" +
                    "        \"questions\": [\n" +
                    "            {\n" +
                    "                \"id\": 8,\n" +
                    "                \"title\": \"question title here\",\n" +
                    "                \"summary\": \"question summary here\",\n" +
                    "                \"options\": [\n" +
                    "                    {\n" +
                    "                        \"id\": 8,\n" +
                    "                        \"type\": \"text\",\n" +
                    "                        \"label\": \"option label here\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "                 {\n" +
                    "                \"id\": 9,\n" +
                    "                \"title\": \"question title here\",\n" +
                    "                \"summary\": \"question summary here\",\n" +
                    "                \"options\": [\n" +
                    "                    {\n" +
                    "                        \"id\": 9,\n" +
                    "                        \"type\": \"text\",\n" +
                    "                        \"label\": \"option label here\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            },\n" +
                    "                 {\n" +
                    "                \"id\": 10,\n" +
                    "                \"title\": \"question title here\",\n" +
                    "                \"summary\": \"question summary here\",\n" +
                    "                \"options\": [\n" +
                    "                    {\n" +
                    "                        \"id\": 10,\n" +
                    "                        \"type\": \"text\",\n" +
                    "                        \"label\": \"option label here\"\n" +
                    "                    }\n" +
                    "                ]\n" +
                    "            }\n" +
                    "        ],\n" +
                    "        \"hidden\": false\n" +
                    "    }\n" +
                    "]",getApplicationContext());

        }
    }
}
