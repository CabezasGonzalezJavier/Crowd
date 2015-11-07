package com.javier.crowd.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by javiergonzalezcabezas on 7/11/15.
 */
public class Utils {
    static final String TASK = "Utils";

    public static void writeToFile(String data, Activity activity) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                    activity.openFileOutput(Constans.NAME_FILE_TASK, Context.MODE_PRIVATE));
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        } catch (IOException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("File write failed: ");
            stringBuilder.append(e.toString());
            Log.e(TASK, stringBuilder.toString());
        }
    }

    public static String readFromFile(Activity activity) {

        String ret = "";

        try {
            InputStream inputStream = activity.openFileInput(Constans.NAME_FILE_TASK);

            if (inputStream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(
                        inputStream);
                BufferedReader bufferedReader = new BufferedReader(
                        inputStreamReader);
                String receiveString = "";
                StringBuilder stringBuilder = new StringBuilder();

                while ((receiveString = bufferedReader.readLine()) != null) {
                    stringBuilder.append(receiveString);
                }

                inputStream.close();
                ret = stringBuilder.toString();
            }
        } catch (FileNotFoundException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("File not found: ");
            stringBuilder.append(e.toString());
            Log.e(TASK, stringBuilder.toString());
        } catch (IOException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not read file: ");
            stringBuilder.append(e.toString());
            Log.e(TASK,  stringBuilder.toString());
        }
        return ret;
    }
}
