package boardgame;

public class Board {
	
	private int row;
	private int columns;
	private Pieces[][] pieces;
	
	public Board(int row, int columns) {
		super();
		this.row = row;
		this.columns = columns;
		pieces = new Pieces [row][columns];
		
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
	public Pieces piece (int row, int columns) {
		return pieces [row][columns];
		
	}
	public Pieces piece (Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}
