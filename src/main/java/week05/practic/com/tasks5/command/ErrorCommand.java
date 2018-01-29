package week05.practic.com.tasks5.command;

/**
 * Created by TSV on 19.03.2017.
 */
public class ErrorCommand implements Command {
    private final String ERROR = "Error";
    public void execute() {
        System.out.println(ERROR);
    }
}
