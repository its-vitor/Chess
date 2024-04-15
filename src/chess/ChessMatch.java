package chess;

import boardgame.Board;

public class ChessMatch {
	private Board board;
	private ChessPiece[][] matchPieces;

	public ChessMatch() {
		this.board = new Board(8, 8);
		matchPieces = new ChessPiece[board.getRow()][board.getColumn()];
	}
	
	public ChessPiece[][] getPieces() {
		for (int i = 0; i < board.getRow(); i++) {
			for (int j = 0; j < board.getColumn(); j++) {
				matchPieces[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return matchPieces;
	}
}
