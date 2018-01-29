package week05.practic.com.tasks5.command;

/**
 * Created by TSV on 18.03.2017.
 */
public class DateCommand implements Command {
    private String DATE = "";

    public void execute() {

        System.out.println(DATE);
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }
}
