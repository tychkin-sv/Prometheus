package week04.com.demo.tictactoe;

public class Board {
    private final int ROW = 3;
	private final int COLUMN = 3;

    // board
	private ActionFigure[][] arr = new ActionFigure[ROW][COLUMN];

	public boolean hasMoreSpace() {
		return false;
	}

	public void print() {
for (int i = 0; i<ROW; i++) {
	for (int j = 0; j < COLUMN; j++)
		if (arr[i][j] != null ) {
		System.out.print( arr[i][j] );
		} else System.out.print( arr[i][j].toString() );

        }
		System.out.println("!");
	}


}
