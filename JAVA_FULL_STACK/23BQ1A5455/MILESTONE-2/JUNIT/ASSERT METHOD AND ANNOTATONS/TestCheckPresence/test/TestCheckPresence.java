package com.wipro.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresence() {

        DailyTasks task = new DailyTasks();

        assertTrue(task.checkPresence("Hello World", "World"));

        assertFalse(task.checkPresence("Hello World", "Java"));
    }

}