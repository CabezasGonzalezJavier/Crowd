package com.javier.crowd;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.javier.crowd.model.Task;
import com.javier.crowd.presenter.TaskPresenterImpl;
import com.javier.crowd.utils.Constants;
import com.javier.crowd.view.TaskView;
import com.javier.crowd.view.adapter.TaskAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements TaskView, AdapterView.OnItemClickListener{


    ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.activity_main_list_view);

        TaskPresenterImpl taskPresenter = new TaskPresenterImpl(this);
        taskPresenter.importer();


        mListView.setOnItemClickListener(this);

    }

    @Override
    public void returnData(List<Task> list) {

        TaskAdapter adapter = new TaskAdapter(this, list);
        mListView.setAdapter(adapter);
    }

    @Override
    public void inValidJSON() {
        Toast.makeText(this,R.string.activity_main_no_json, Toast.LENGTH_LONG).show();
    }

    @Override
    public Context getContext() {
        return this;
    }


    public void goToActivity(int position) {
        Intent intent = new Intent(this, QuestionActivity.class);
        intent.putExtra(Constants.ID_TASK_INTENT, position);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        goToActivity(position+1);
    }
}
