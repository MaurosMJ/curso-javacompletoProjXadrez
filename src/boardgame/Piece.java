package boardgame;

public class Piece {

	protected Position position;
	private Piece piece[][]; 
	private Board board;

	public Piece (Board board) {
		this.board = board;
		this.position = null;
	}
	
	public Piece[][] possibleMoves (){
		return this.piece;
	}
	
	public boolean isThereAnyPossibleMove() {
		return true;
	}
	
	public boolean possibleMove (Position position) {
		return true;
	}

	protected Board getBoard() {
		return board;
	}
	
}
