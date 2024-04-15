package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChassPiece extends Piece {
	private Color color;

	public ChassPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

}
