package com.tasks5.command;

public class ErrorCommand implements Command {
    private final String ERROR = "Error";
    public void execute() {
        System.out.println(ERROR);
    }
}
