package week03.practic.task_03;

public class Fibonacci {
    public long getNumber(int position) {
        //PUT YOUR CODE HERE
        if (position > 2) {
            return getNumber(position - 1) + getNumber(position - 2);
        } else if ((position == 2)) return 1;
        else if ((position == 1)) return 1;
        else return -1;
        //PUT YOUR CODE HERE
    }
}