package com.javier.crowd;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.javier.crowd.model.Question;
import com.javier.crowd.presenter.QuestionPresenterImpl;
import com.javier.crowd.utils.Constants;
import com.javier.crowd.view.QuestionView;

import java.util.List;

public class QuestionActivity extends AppCompatActivity implements QuestionView, View.OnClickListener {

    private TextView mTitle;
    private TextView mSummary;
    private EditText mEditText;
    private List<Question> mList;
    private int mPosition =0;
    private QuestionPresenterImpl mQuestionPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        mTitle = (TextView) findViewById(R.id.activity_question_title);
        mSummary = (TextView) findViewById(R.id.activity_question_summary);
        mEditText = (EditText) findViewById(R.id.activity_question_edit_text);
        Button nextButton = (Button) findViewById(R.id.activity_question_button);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        int id = extras.getInt(Constants.ID_TASK_INTENT);

        mQuestionPresenter = new QuestionPresenterImpl(this);
        mQuestionPresenter.getData(id);

        nextButton.setOnClickListener(this);

    }


    @Override
    public void returnData(List<Question> list) {
        mList = list;
        fillData();
    }

    @Override
    public Context getContext() {
        return this;
    }

    /**
     * this method was created for animation between activities
     */
    public void cameback()
    {
        finish();
        overridePendingTransition(R.anim.right, R.anim.left);
    }

    @Override
    public void onBackPressed()
    {
        cameback();
    }

    @Override
    public void onClick(View v) {
        if (mPosition+1>mList.size()){
            cameback();
        } else {
            fillData();
        }
    }

    public void fillData() {
        mTitle.setText(mList.get(mPosition).getTitle());
        mSummary.setText(mList.get(mPosition).getSummary());
        mQuestionPresenter.setOption(mEditText.getText().toString(), mList.get(mPosition));
        mPosition ++;
    }
}
