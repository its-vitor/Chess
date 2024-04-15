package boardgame;

public class Board {
	private Integer row;
	private Integer column;
	private Piece[][] pieces;
	
	public Board(Integer row, Integer column, Piece[][] pieces) {
		this.row = row;
		this.column = column;
		this.pieces = new Piece[row][column];
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
}
