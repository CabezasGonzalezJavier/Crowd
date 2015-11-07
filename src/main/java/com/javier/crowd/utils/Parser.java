package com.javier.crowd.utils;

import com.javier.crowd.model.Option;
import com.javier.crowd.model.Question;
import com.javier.crowd.model.Task;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class Parser {


    public Parser() {

    }

    public static List<Task> parserJSON(String data) {
        List<Task> listTask = new ArrayList<>();
        JSONObject objectTask = null;
        try {
            JSONArray arrayJson = new JSONArray(data);
            for (int i = 0; i< arrayJson.length(); i++) {

                Task task = new Task();
                Integer idTask = arrayJson.getJSONObject(i).getInt(Constants.ID);
                String titleTask = arrayJson.getJSONObject(i).getString(Constants.TITLE);
                Boolean hiddenTask = arrayJson.getJSONObject(i).getBoolean(Constants.HIDDEN);
                JSONArray arrayQuestions = arrayJson.getJSONObject(i).getJSONArray(Constants.QUESTIONS);
                List<Question> questions = new ArrayList<>();
                for (int j = 0; j< arrayQuestions.length(); j++) {

                    Question question = new Question();
                    Integer idQuestions = arrayQuestions.getJSONObject(j).getInt(Constants.ID);
                    String titleQuestions = arrayQuestions.getJSONObject(j).getString(Constants.TITLE);
                    String summaryQuestions = arrayQuestions.getJSONObject(j).getString(Constants.SUMMARY);
                    JSONArray arrayOptions = arrayQuestions.getJSONObject(j).getJSONArray(Constants.OPTIONS);
                    List<Option> options = new ArrayList<>();

                    for (int w = 0; w < arrayOptions.length(); w++) {

                        Option option = new Option();
                        Integer idOptions = arrayOptions.getJSONObject(w).getInt(Constants.ID);
                        String typeOptions = arrayOptions.getJSONObject(w).getString(Constants.TYPE);
                        String labelOptions = arrayOptions.getJSONObject(w).getString(Constants.LABEL);

                        option.setId(idOptions);
                        option.setType(typeOptions);
                        option.setLabel(labelOptions);
                        options.add(option);
                    }
                    question.setId(idQuestions);
                    question.setTitle(titleQuestions);
                    question.setSummary(summaryQuestions);
                    question.setOptions(options);
                    questions.add(question);
                }
                task.setId(idTask);
                task.setTitle(titleTask);
                task.setQuestions(questions);
                task.setHidden(hiddenTask);
                listTask.add(task);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return listTask;
    }

}
