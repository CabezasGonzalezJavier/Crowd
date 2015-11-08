package com.javier.crowd.presenter;

import android.util.Log;

import com.javier.crowd.model.dao.OptionDAO;
import com.javier.crowd.model.dao.QuestionsDAO;
import com.javier.crowd.model.dao.TaskDAO;
import com.javier.crowd.model.Option;
import com.javier.crowd.model.Question;
import com.javier.crowd.model.Task;
import com.javier.crowd.utils.Parser;
import com.javier.crowd.utils.Utils;
import com.javier.crowd.utils.Validator;
import com.javier.crowd.view.TaskView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class TaskPresenterImpl implements TaskPresenter{
    private static final String TAG = "TaskPresenterImpl";

    private TaskView mTaskView;
    private TaskDAO mTaskDAO;
    private QuestionsDAO mQuestionsDAO;
    private OptionDAO mOptionDAO;

    private static List<Task> mTaskList;
    private static List<Question> mQuestionList;
    private static List<Option> mOptionList;

    public TaskPresenterImpl(TaskView taskView) {
        this.mTaskView = taskView;
    }

    @Override
    public void importer() {
        mTaskDAO = new TaskDAO(mTaskView.getContext());
        mQuestionsDAO = new QuestionsDAO(mTaskView.getContext());
        mOptionDAO = new OptionDAO(mTaskView.getContext());
        String data = new String();

        data = Utils.readFromFile(mTaskView.getContext());
        if (Validator.isJSONValid(data)){
            List<Task> listTask = Parser.parserJSON(data);
            insertDataBase(listTask);
            getData();

            mTaskView.returnData(listTask);
        } else {
            mTaskView.inValidJSON();
        }
    }

    @Override
    public boolean exitsDB(){
        int task = mTaskDAO.getCount();
        int question = mQuestionsDAO.getCount();
        int option = mOptionDAO.getCount();

        return option > 0 && question > 0 && task > 0;
    }

    public void insertDataBase(List<Task> listTask){
        if(!exitsDB()) {
            mTaskDAO.createAll(listTask);
            List<Question> questions = new ArrayList<>();
            List<Option> options = new ArrayList<>();
            for (int i = 0; i < listTask.size(); i++) {

                listTask.get(i).getQuestions();

                for (int j = 0; j < listTask.get(i).getQuestions().size(); j++) {
                    Question question = listTask.get(i).getQuestions().get(j);
                    question.setTaskId(String.valueOf(i + 1));
                    questions.add(question);

                    for (int w = 0; w < listTask.get(i).getQuestions().get(j).getOptions().size(); w++) {
                        Option option = listTask.get(i).getQuestions().get(j).getOptions().get(w);
                        option.setQuestionId(j + 1);
                        options.add(option);
                    }


                }

            }
            mQuestionsDAO.createAll(questions);
            mOptionDAO.createAll(options);
        }
    }

    public void getData() {
        if(exitsDB()){
            mTaskList=mTaskDAO.readAllAsc();
            mQuestionList = mQuestionsDAO.readAllAsc();
            mOptionList = mOptionDAO.readAllAsc();
            Log.d(TAG, mTaskList.get(4).getTitle());
            Log.d(TAG, mQuestionList.get(2).getSummary());
            Log.d(TAG, mOptionList.get(3).getType());
        }
    }

}
