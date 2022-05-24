package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {//para criar uma p� precisa criar um board(tabuleiro)
		this.board = board;
		position = null; //a posi��o de uma pe�a recem criada ser� com valor nulo
	}

	protected Board getBoard() {
		return board;
	}	
}
