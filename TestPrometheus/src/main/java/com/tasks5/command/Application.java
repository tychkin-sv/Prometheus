package com.tasks5.command;
// Отличается именем пакета. Так надо было вставить в задании
public class Application {

enum commnds { help, date, now, echo, exit };

public static void main(String[] args){
    //YOUR CODE COMES HERE
    // possible commands
    HelpCommand helpCommand = new HelpCommand();
    EchoCommand echoCommand = new EchoCommand();
    DateCommand dateCommand = new DateCommand();
    ExitCommand exitCommand = new ExitCommand();
    ErrorCommand errorCommand = new ErrorCommand();

    // switcher of commands
    Switch sw = new Switch(helpCommand, echoCommand, dateCommand, exitCommand, errorCommand);

    //System.out.println(Arrays.toString(args));
    //System.out.println(args.length);
    //for (String s: args) {
    //    System.out.println(s);
    //}

if (args!=null) {
    switch (args.length) {
        case 0: // only error
            sw.error();
            break; // case 0
        case 1: // may be help, exit, echo, error
            if (args[0].equals(commnds.help.name())) {
                sw.help();
            } else if (args[0].equals(commnds.exit.name())) {
                sw.exit();
            } else if (args[0].equals(commnds.echo.name())) {
                sw.echo();
            } else {
                sw.error();
            }
            break; // case 1
        case 2: // may be date now, echo, error
            if (args[0].equals(commnds.date.name()) && args[1].equals(commnds.now.name())) {

                dateCommand.setDATE(String.valueOf(System.currentTimeMillis()));
                sw.date();
            } else if (args[0].equals(commnds.echo.name())) {
                echoCommand.addText(args[1]);
                sw.echo();
            } else {
                sw.error();
            }
            break; // case 2
        default: // may be ONLY! error
            //if (args[0].equals(commnds.echo.name())) {
            // add text to EchoCommand object
            //    for (int i = 1; i < args.length; i++) {
            //        echoCommand.addText(args[i]);
            //    }
            //    sw.echo();
            //} else {
                sw.error();
            //}
            break;// default
    }
}
else sw.error();
}
}