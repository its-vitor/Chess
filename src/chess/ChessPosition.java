package chess;

import exceptions.ChessException;

public class ChessPosition {
	public char column;
	public Integer row;
	
	public ChessPosition(char column, Integer row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) throw new ChessException("Erro de instanciação.");
		this.column = column;
		this.row = row;
	}
}
