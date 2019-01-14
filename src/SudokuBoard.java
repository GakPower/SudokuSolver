import java.util.ArrayList;

public class SudokuBoard {

	private ArrayList<SudokuArea> sudokuBoxes;
	private ArrayList<SudokuArea> sudokuRows;
	private ArrayList<SudokuArea> sudokuColumns;

	public SudokuBoard(ArrayList<SudokuArea> sudokuBoxes, ArrayList<SudokuArea> sudokuRows, ArrayList<SudokuArea> sudokuColumns){
		this.sudokuBoxes = sudokuBoxes;
		this.sudokuRows = sudokuRows;
		this.sudokuColumns = sudokuColumns;
	}

	public ArrayList<SudokuArea> getSudokuBoxes() {
		return sudokuBoxes;
	}

	public ArrayList<SudokuArea> getSudokuRows() {
		return sudokuRows;
	}

	public ArrayList<SudokuArea> getSudokuColumns() {
		return sudokuColumns;
	}
}
