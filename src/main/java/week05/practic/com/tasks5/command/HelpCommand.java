package week05.practic.com.tasks5.command;

/**
 * Created by TSV on 19.03.2017.
 */
public class HelpCommand implements Command {
    private final String HELP = "Help executed";
    public void execute() {
        System.out.println(HELP);
    }
}
