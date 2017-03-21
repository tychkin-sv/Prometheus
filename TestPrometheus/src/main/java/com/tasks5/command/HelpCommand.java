package com.tasks5.command;

public class HelpCommand implements Command {
    private final String HELP = "Help executed";
    public void execute() {
        System.out.println(HELP);
    }
}
