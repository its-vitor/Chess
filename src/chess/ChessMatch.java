package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.Rook;
import exceptions.ChessException;

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
	
	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition target) {
		Position source = sourcePosition.toPosition();
		validateSourcePosition(source);
		return (ChessPiece) makeMove(source, target.toPosition());
	}
	
	private Piece makeMove(Position source, Position position) {
		Piece p = board.removePiece(source);
		Piece capturedPiece = board.removePiece(position);
		board.placePiece(p, position);
		return capturedPiece;
	}

	private void validateSourcePosition(Position source) {
		if (!board.thereIsAPiece(source)) throw new ChessException("Não há peça nessa posição.");
		else if (!board.piece(source).isThereAnyPossibleMove()) throw new ChessException("Não há movimentos possíveis.");
	}

	private void placeNewPiece(char column, Integer row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('a', 8, new Rook(board, Color.WHITE));
	}
}
