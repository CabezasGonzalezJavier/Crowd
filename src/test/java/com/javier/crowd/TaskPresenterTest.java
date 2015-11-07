package com.javier.crowd;

import com.javier.crowd.presenter.TaskPresenter;
import com.javier.crowd.presenter.TaskPresenterImpl;
import com.javier.crowd.utils.Utils;
import com.javier.crowd.view.TaskView;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class TaskPresenterTest {

    TaskPresenter mTaskPresenter;
    TaskView mTaskView;

    @Before
    public void setup() {
        mTaskView = mock(TaskView.class);
        mTaskPresenter = new TaskPresenterImpl(mTaskView);
    }

    @Test
    public void dataNull() {
        String data = new String();
        data = "Hello";
        assertNotNull(data);
        assertTrue(data.toString().equals("Hello"));
    }

    @Test
    public void assertTask() {

    }
}
