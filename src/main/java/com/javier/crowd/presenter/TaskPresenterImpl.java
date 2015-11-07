package com.javier.crowd.presenter;

import android.util.Log;

import com.javier.crowd.model.Task;
import com.javier.crowd.utils.Parser;
import com.javier.crowd.utils.Utils;
import com.javier.crowd.view.TaskView;

import java.util.List;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class TaskPresenterImpl implements TaskPresenter{
    private static final String TAG = "TaskPresenterImpl";

    private TaskView mTaskView;

    public TaskPresenterImpl(TaskView taskView) {
        this.mTaskView = taskView;
    }

    @Override
    public void importer() {
        String data = new String();
        data = Utils.readFromFile(mTaskView.getContext());
        List<Task> listTask = Parser.parserJSON(data);
        Log.d(TAG, listTask.get(1).getTitle());
        mTaskView.returnData(listTask.get(1).getTitle());
    }
}
