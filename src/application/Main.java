package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPosition;
import exceptions.ChessException;
import visual.UI;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch match = new ChessMatch();

		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(match.getPieces());
				
				System.out.println();
				System.out.print("Selecione a peça:");
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.println();
				System.out.print("Selecione a posição:");
				ChessPosition target = UI.readChessPosition(sc);
				
				match.performChessMove(source, target);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}
