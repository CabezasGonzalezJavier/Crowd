package com.javier.crowd;

import com.javier.crowd.model.Task;
import com.javier.crowd.presenter.TaskPresenterImpl;
import com.javier.crowd.utils.Parser;
import com.javier.crowd.utils.Validator;
import com.javier.crowd.view.TaskView;

import org.json.JSONArray;
import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


/**
 * Created by javiergonzalezcabezas on 8/11/15.
 */
public class ParserTest {
    String mData;
    Task mTask;
    JSONArray mJSONArray;
    @Before
    public void setup() {
        mData = "[\n" +
                "    {\n" +
                "        \"id\": 1,\n" +
                "        \"title\": \"This is a task\",\n" +
                "        \"questions\": [\n" +
                "            {\n" +
                "                \"id\": 1,\n" +
                "                \"title\": \"question title here\",\n" +
                "                \"summary\": \"question summary here\",\n" +
                "                \"options\": [\n" +
                "                    {\n" +
                "                        \"id\": 1,\n" +
                "                        \"type\": \"text\",\n" +
                "                        \"label\": \"option label here\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            },\n" +
                "                  {\n" +
                "                \"id\": 2,\n" +
                "                \"title\": \"question title here\",\n" +
                "                \"summary\": \"question summary here\",\n" +
                "                \"options\": [\n" +
                "                    {\n" +
                "                        \"id\": 2,\n" +
                "                        \"type\": \"text\",\n" +
                "                        \"label\": \"option label here\"\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        ],\n" +
                "        \"hidden\": false" +
                "  }\n" +
                "]";
        mTask  = Mockito.mock(Task.class);

    }
    @Test
    public void testParserNull() {
        Validator.isJSONValid(mData);
        assertNotNull(mData);
    }

    @Test
    public void testParserDataIsEmpty() {
        Validator.isJSONValid(mData);
        assertTrue(mData.isEmpty());
    }

    @Test
    public void testParserNotNull() {
        List<Task> list = Parser.parserJSON(mData);
        assertNotNull(list);
    }

    @Test
    public void testPaserNotEmpty() {
        List<Task> list = Parser.parserJSON(mData);
        assertTrue(list.size()>0);
    }

}
