package application;

import chess.ChessMatch;
import visual.UI;

public class Main {

	public static void main(String[] args) {
		ChessMatch match = new ChessMatch();
		UI.printBoard(match.getPieces());
	}
}
