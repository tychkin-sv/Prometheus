package com.tasks5.command;

public class ExitCommand implements Command {
    private final String EXIT = "Goodbye!";

    public void execute() {
        System.out.println(EXIT);
    }
}
