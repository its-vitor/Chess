package visual;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessPiece;
import chess.ChessPosition;

public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i<pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j<pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.print("  A B C D E F J H");
	}
	
	public static ChessPosition readChessPosition(Scanner sc) {
		try {
			String position = sc.nextLine();
			return new ChessPosition(position.charAt(0), Integer.parseInt(position.substring(1)));
		} catch (RuntimeException e) {
			throw new InputMismatchException("Posição de leitura inválida.");
		}
	}
	
	public static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
