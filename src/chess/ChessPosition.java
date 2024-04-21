package chess;

import boardgame.Position;
import exceptions.ChessException;

public class ChessPosition {
	public char column;
	public Integer row;
	
	public ChessPosition(char column, Integer row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) throw new ChessException("Erro de instanciação.");
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public Integer getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getRow()), position.getColumn());
	}
}
