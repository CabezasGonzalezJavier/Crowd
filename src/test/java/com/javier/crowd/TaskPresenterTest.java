package com.javier.crowd;

import com.javier.crowd.model.Task;
import com.javier.crowd.model.dao.OptionDAO;
import com.javier.crowd.model.dao.QuestionsDAO;
import com.javier.crowd.model.dao.TaskDAO;
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
    TaskDAO mTaskDAO;
    QuestionsDAO mQuestionDAO;
    OptionDAO mOptionDAO;

    @Before
    public void setup() {
        mTaskView = mock(TaskView.class);
        mTaskDAO = mock(TaskDAO.class);
        mQuestionDAO = mock(QuestionsDAO.class);
        mOptionDAO = mock(OptionDAO.class);
        mTaskPresenter = new TaskPresenterImpl(mTaskView);
    }

    @Test
    public void checkDataBase() {
        boolean exits = mTaskPresenter.exitsDB();
        assertTrue(exits);
    }

}
