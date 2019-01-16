package ru.amstolbov.priorityqueue;

import java.util.LinkedList;

/**
 * Очередь задач с приоритетом.
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     *Метод должен вставлять задачу в нужную позицию.
     * Нужная позиция определяется приоритетом задачи.
     * @param task задаче
     */
    public void put(Task task) {
        tasks.stream().takeWhile(el -> el.getPriority() > task.getPriority()).findFirst().ifPresentOrElse(el -> tasks.add(tasks.indexOf(el), task),
                                                                                                          () -> tasks.add(task));
    }

    public Task take() {
        return this.tasks.poll();
    }

}
