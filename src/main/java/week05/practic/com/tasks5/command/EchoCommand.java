package week05.practic.com.tasks5.command;

public class EchoCommand implements Command {
    private final String ECHO = "";
    private String text = "";

    public void execute() {
        System.out.println(this.text);
    }

    // add text to output
    public void addText(String word){
        if (this.text.equals("")) {this.text = word;}
        else {this.text = this.text + " " + word;};
    }
}
