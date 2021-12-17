package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Homework 3

        Worker worker1 = new Worker("Ellen", "manager");
        Worker worker2 = new Worker("Luka", "boss");
        Worker [] workers = {worker1, worker2};

        Task task1 = new Task("random", workers);
        Task task2 = new Task("clean" , workers);
        Task [] tasks = {task1, task2};

        Project project = new Project(1, tasks);

        System.out.println(project);


    }
}

class Project
{
    int ID;
    Task[] tasks;
    public Project (int ID, Task [] tasks)
    {
       this.ID = ID;
       this.tasks = tasks;

    }
    public String toString ()
    {
        return ID + Arrays.toString(tasks);
    }
}

class Task
{
    String name;
    Worker [] workers;
    public Task (String name, Worker [] workers)
    {
        this.name = name;
        this.workers = workers;
    }

    public String toString()
    {
        return name + Arrays.toString(workers);
    }

}

class Worker
{
    String name, type;
    public Worker (String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    public String toString()
    {
        return name + " "+ type;
    }
    

}
