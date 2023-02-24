package chess;

import boardgame.Board;
import boardgame.Pieces;
import boardgame.Position;

public abstract class ChessPiece extends Pieces{
	
	
	private Color color;
	private int moveCount;
	

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	public void incresaMoveCount() {
		moveCount ++;
	}
	public void decreaseMoveCount() {
		moveCount--;
	}

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	protected boolean isThereOpponentPiece (Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

	
}
