package com.javier.crowd.presenter;

import android.app.Activity;

import com.javier.crowd.utils.Utils;
import com.javier.crowd.view.TaskView;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class TaskPresenterImpl implements TaskPresenter{

    private TaskView mTaskView;

    public TaskPresenterImpl(TaskView taskView) {
        this.mTaskView = taskView;
    }

    @Override
    public void importer() {
        String data = new String();
        data = Utils.readFromFile(mTaskView.getContext());
        mTaskView.returnData(data);
    }
}
