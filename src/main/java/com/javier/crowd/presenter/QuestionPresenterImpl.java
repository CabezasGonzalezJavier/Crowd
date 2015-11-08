package com.javier.crowd.presenter;

import com.javier.crowd.model.Question;
import com.javier.crowd.model.dao.QuestionsDAO;
import com.javier.crowd.utils.Constants;
import com.javier.crowd.view.QuestionView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javiergonzalezcabezas on 8/11/15.
 */
public class QuestionPresenterImpl implements QuestionPresenter {

    private QuestionView mQuestionView;
    private QuestionsDAO mQuestionsDAO;

    public QuestionPresenterImpl(QuestionView mQuestionView) {
        this.mQuestionView = mQuestionView;
    }

    @Override
    public void getData(int id) {

        mQuestionsDAO = new QuestionsDAO(mQuestionView.getContext());
        List<Question> list = new ArrayList<Question>();
        Question question = new Question();


        question =mQuestionsDAO.readWhere(Constants.TASK_ID, String.valueOf(id));
        list.add(question);
        mQuestionView.returnData(list);
    }

    @Override
    public void setOption(String option, Question question) {
        mQuestionsDAO.update(Constants.SET_OPTION, option, question);
    }

}
