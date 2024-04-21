package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	private ChessPiece[][] matchPieces;

	public ChessMatch() {
		this.board = new Board(8, 8);
		matchPieces = new ChessPiece[board.getRow()][board.getColumn()];
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		for (int i = 0; i < board.getRow(); i++) {
			for (int j = 0; j < board.getColumn(); j++) {
				matchPieces[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return matchPieces;
	}
	
	private void placeNewPiece(char column, Integer row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('a', 8, new Rook(board, Color.WHITE));
	}
}
