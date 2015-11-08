package com.javier.crowd.view;

import android.content.Context;

import com.javier.crowd.model.Task;

import java.util.List;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public interface TaskView {
    void returnData(List<Task> list);
    Context getContext();
}
