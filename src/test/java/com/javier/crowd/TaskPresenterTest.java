package com.javier.crowd;

import com.javier.crowd.presenter.TaskPresenter;
import com.javier.crowd.presenter.TaskPresenterImpl;
import com.javier.crowd.utils.Utils;
import com.javier.crowd.view.TaskView;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class TaskPresenterTest {

    TaskPresenter mTaskPresenter;
    TaskView mTaskView;

    @Before
    public void setup() {
        mTaskPresenter = new TaskPresenterImpl(mTaskView);
    }

    @Test
    public void dataNull() {
        String data = new String();
        data = Utils.readFromFile(mTaskView.getContext());
        assertNotNull(data);
        assertTrue(data.toString() != null);
        assertTrue(data.toString().equals("Hello"));
    }
}
