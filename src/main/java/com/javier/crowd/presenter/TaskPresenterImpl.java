package com.javier.crowd.presenter;

import android.util.Log;

import com.javier.crowd.dao.TaskDAO;
import com.javier.crowd.model.Task;
import com.javier.crowd.utils.Parser;
import com.javier.crowd.utils.Utils;
import com.javier.crowd.view.TaskView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class TaskPresenterImpl implements TaskPresenter{
    private static final String TAG = "TaskPresenterImpl";

    private TaskView mTaskView;
    private TaskDAO mTaskDAO;
    private static List<Task> mTaskList;

    public TaskPresenterImpl(TaskView taskView) {
        this.mTaskView = taskView;
    }

    @Override
    public void importer() {
        mTaskDAO = new TaskDAO(mTaskView.getContext());
        String data = new String();
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
                "]",mTaskView.getContext());

        data = Utils.readFromFile(mTaskView.getContext());
        List<Task> listTask = Parser.parserJSON(data);
        insertDataBase(listTask);
        getData();

        mTaskView.returnData(listTask.get(0).getTitle());
    }

    public boolean exitsDB(){
        int task = mTaskDAO.getCount();

        return task > 0;
    }

    public void insertDataBase(List<Task> listTask){
        mTaskDAO.createAll(listTask);
    }

    public void getData() {
        if(exitsDB()){
            mTaskList=mTaskDAO.readAllAsc();
            Log.d(TAG, mTaskList.get(4).getTitle());
        }
    }

}
