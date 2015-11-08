package com.javier.crowd;


import com.javier.crowd.model.Question;
import com.javier.crowd.presenter.QuestionPresenter;
import com.javier.crowd.presenter.QuestionPresenterImpl;
import com.javier.crowd.view.QuestionView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;

/**
 * Created by javiergonzalezcabezas on 8/11/15.
 */
public class QuestionPresenterTest {
    int mID;
    String mOption;
    Question mQuestion;
    QuestionPresenter mQuestionPresenter;
    QuestionView mQuestionView;

    @Before
    public void setup() {
        mID=1;
        mOption="";
        mQuestionView = mock(QuestionView.class);
        mQuestion = mock(Question.class);
        mQuestionPresenter = new QuestionPresenterImpl(mQuestionView);
    }

    @Test
    public void testGetDataQuestionPresenter() {
        mQuestionPresenter.getData(mID);
        assertNotNull(mID);
        assertEquals(mID,1);
    }

    @Test
    public void testSetOptionQuestionPresenter() {
        mQuestionPresenter.setOption(mOption, mQuestion);
        assertNotNull(mID);
        assertTrue(mOption.isEmpty());
    }
}
