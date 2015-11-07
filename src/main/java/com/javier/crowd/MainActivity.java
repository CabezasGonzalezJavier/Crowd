package com.javier.crowd;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.javier.crowd.presenter.TaskPresenterImpl;
import com.javier.crowd.view.TaskView;

public class MainActivity extends AppCompatActivity implements TaskView{

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.hell);

        TaskPresenterImpl taskPresenter = new TaskPresenterImpl(this);
        taskPresenter.importer();

    }

    @Override
    public void returnData(String data) {
        mTextView.setText(data);
    }

    @Override
    public Context getContext() {
        return this;
    }
}
