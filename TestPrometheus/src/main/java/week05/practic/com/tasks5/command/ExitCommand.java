package week05.practic.com.tasks5.command;

/**
 * Created by TSV on 19.03.2017.
 */
public class ExitCommand implements Command{
    private final String EXIT = "Goodbye!";

    public void execute() {
        System.out.println(EXIT);
    }
}
