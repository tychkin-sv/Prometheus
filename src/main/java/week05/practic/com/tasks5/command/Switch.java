package week05.practic.com.tasks5.command;

/**
 * Created by TSV on 19.03.2017.
 */
public class Switch {
    private Command helpCommand;
    private Command echoCommand;
    private Command dateCommand;
    private Command exitCommand;
    private Command errorCommand;

    public Switch(Command helpCommand, Command echoCommand, Command dateCommand, Command exitCommand, Command errorCommand) {
        this.helpCommand = helpCommand;
        this.echoCommand = echoCommand;
        this.dateCommand = dateCommand;
        this.exitCommand = exitCommand;
        this.errorCommand = errorCommand;
    }

    public void setEchoCommand(Command echoCommand) {
        this.echoCommand = echoCommand;
    }

    public void help(){this.helpCommand.execute();}
    public void echo(){this.echoCommand.execute();}
    public void date(){this.dateCommand.execute();}
    public void exit(){this.exitCommand.execute();}
    public void error(){this.errorCommand.execute();}
}
