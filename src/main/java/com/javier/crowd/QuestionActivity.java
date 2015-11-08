package com.javier.crowd;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.javier.crowd.model.Question;
import com.javier.crowd.model.Task;
import com.javier.crowd.presenter.QuestionPresenter;
import com.javier.crowd.presenter.QuestionPresenterImpl;
import com.javier.crowd.view.QuestionView;
import com.javier.crowd.view.TaskView;

import java.util.List;

public class QuestionActivity extends AppCompatActivity implements QuestionView {

    private TextView mTitle;
    private TextView mSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        mTitle = (TextView) findViewById(R.id.activity_question_title);
        mSummary = (TextView) findViewById(R.id.activity_question_summary);


        QuestionPresenterImpl questionPresenter = new QuestionPresenterImpl(this);
        questionPresenter.getData();

    }


    @Override
    public void returnData(List<Question> list) {

    }

    @Override
    public Context getContext() {
        return this;
    }
}
