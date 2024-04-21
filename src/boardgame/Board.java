package boardgame;

import exceptions.BoardException;

public class Board {
	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;
	
	public Board(Integer row, Integer column) {
		this.rows = row;
		this.columns = column;
		this.pieces = new Piece[row][column];
	}

	public Integer getRow() {
		return rows;
	}

	public void setRow(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumn() {
		return columns;
	}

	public void setColumn(Integer columns) {
		this.columns = columns;
	}
	
	public Piece piece(Integer row, Integer column) {
		if (!positionExists(row, column)) throw new BoardException("Posição não encontrada no tabuleiro.");
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) throw new BoardException("Posição não encontrada no tabuleiro.");
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) throw new BoardException("Já há uma peça adicionada nessa posição.");
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public boolean positionExists(Integer row, Integer column) {
		return column >= 0 && column < columns && row >= 0 && row < rows;
	}
	
	public boolean positionExists(Position position) {
		Integer column = position.getColumn();
		Integer row = position.getRow();
		
		return positionExists(row, column);
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) throw new BoardException("Posição não encontrada no tabuleiro.");
		return piece(position) != null;
	}
}
