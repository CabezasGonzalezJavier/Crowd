package com.javier.crowd;

import com.javier.crowd.model.Task;
import com.javier.crowd.presenter.TaskPresenterImpl;
import com.javier.crowd.utils.Validator;
import com.javier.crowd.view.TaskView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

/**
 * Created by javiergonzalezcabezas on 8/11/15.
 */
public class ValidatorTest {
    String mData;

    @Before
    public void setup() {
        mData = "data";
    }
    @Test
    public void testParser() {
        Boolean valid = Validator.isJSONValid(mData);
        assertNotNull(mData);
        assertTrue(!mData.isEmpty());
        assertTrue(valid);

    }
    @Test
    public void testFailParser() {
        Boolean valid = Validator.isJSONValid(mData);
        assertNotNull(mData);
        assertTrue(!mData.isEmpty());
        assertTrue(!valid);

    }

}
