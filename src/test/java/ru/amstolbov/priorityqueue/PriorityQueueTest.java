package ru.amstolbov.priorityqueue;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    @Test
    public void whenHigherPriority() {
        PriorityQueue priorityQueue = new PriorityQueue();
        String nameOne = "One";
        priorityQueue.put(new Task("Two", 2));
        priorityQueue.put(new Task("Three", 3));
        priorityQueue.put(new Task(nameOne, 1));
        priorityQueue.put(new Task("Four", 4));
        var result = priorityQueue.take();
        assertThat(result.getDesc(), is(nameOne));
    }

}