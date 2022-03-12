package test_proj;

public class board {
	Pices[][] board;
	String rowIndex = " a b c d e f g h";
	String[] colIndex = {"8", "7", "6", "5", "4", "3", "2", "1"};
	
	board() {
		this.board = new Pices[8][8];
		setBoard();
		
	}
	
	public void restartBoard() {
		for(int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				
			}
		}
	}
	
	public void setBoard() {
		board[1][0] = new Pawn();
		board[1][1] = new Pawn();
	}
	
	public void printBoard() {
		for (int i = 0; i < 8; i++) {
			if (i == 0 || i == 8) System.out.println(rowIndex);
			for (int j = 0; j < 8; j++) {
				if (j == 0 || j == 8) System.out.print(colIndex[i]);
				if (board[i][j] == null) {
					System.out.print("  "); 	
				}
				else System.out.print(" " + board[i][j].pieceDisplay());
			}
			System.out.println();
		}
	}
}
