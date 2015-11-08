package com.javier.crowd;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.javier.crowd.model.Task;
import com.javier.crowd.presenter.TaskPresenterImpl;
import com.javier.crowd.view.TaskView;
import com.javier.crowd.view.adapter.TaskAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements TaskView{


    ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.activity_main_list_view);

        TaskPresenterImpl taskPresenter = new TaskPresenterImpl(this);
        taskPresenter.importer();

    }

    @Override
    public void returnData(List<Task> list) {
        TaskAdapter adapter = new TaskAdapter(this, list);
        mListView.setAdapter(adapter);
    }

    @Override
    public Context getContext() {
        return this;
    }
}
