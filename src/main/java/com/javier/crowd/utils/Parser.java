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

    public static List<Task> parserJSON(String data) {
        List<Task> listTask = new ArrayList<>();
        JSONObject objectTask = null;
        try {
            JSONArray arrayJson = new JSONArray(data);
            for (int i = 0; i< arrayJson.length(); i++) {

                Task task = new Task();
                Integer idTask = arrayJson.getJSONObject(i).getInt(Constans.ID);
                String titleTask = arrayJson.getJSONObject(i).getString(Constans.TITLE);
                JSONArray arrayQuestions = arrayJson.getJSONObject(i).getJSONArray(Constans.QUESTIONS);
                List<Question> questions = new ArrayList<>();
                for (int j = 0; j< arrayQuestions.length(); j++) {

                    Question question = new Question();
                    Integer idQuestions = arrayQuestions.getJSONObject(j).getInt(Constans.ID);
                    String titleQuestions = arrayQuestions.getJSONObject(j).getString(Constans.TITLE);
                    String summaryQuestions = arrayQuestions.getJSONObject(j).getString(Constans.SUMMARY);
                    JSONArray arrayOptions = arrayQuestions.getJSONObject(j).getJSONArray(Constans.OPTIONS);
                    List<Option> options = new ArrayList<>();

                    for (int w = 0; w < arrayOptions.length(); w++) {

                        Option option = new Option();
                        Integer idOptions = arrayOptions.getJSONObject(w).getInt(Constans.ID);
                        String typeOptions = arrayOptions.getJSONObject(w).getString(Constans.TYPE);
                        String labelOptions = arrayOptions.getJSONObject(w).getString(Constans.LABEL);

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
                listTask.add(task);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listTask;
    }
}
