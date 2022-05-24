package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {//para criar uma pç precisa criar um board(tabuleiro)
		this.board = board;
		position = null; //a posição de uma peça recem criada será com valor nulo
	}

	protected Board getBoard() {
		return board;
	}	
}
