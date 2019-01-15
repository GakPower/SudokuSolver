import java.util.ArrayList;
import java.util.HashSet;

public class SudokuBoard {

	private ArrayList<SudokuArea> sudokuBoxes;
	private ArrayList<SudokuArea> sudokuRows;
	private ArrayList<SudokuArea> sudokuColumns;

	private HashSet<Field> fields = new HashSet<>();
	private HashSet<SudokuArea> sudokuAreas = new HashSet<>();

	public SudokuBoard(ArrayList<SudokuArea> sudokuBoxes, ArrayList<SudokuArea> sudokuRows, ArrayList<SudokuArea> sudokuColumns){
		this.sudokuBoxes = sudokuBoxes;
		this.sudokuRows = sudokuRows;
		this.sudokuColumns = sudokuColumns;

		this.sudokuBoxes.forEach(sudokuArea -> fields.addAll(sudokuArea.getFields()));
		this.sudokuRows.forEach(sudokuArea -> fields.addAll(sudokuArea.getFields()));
		this.sudokuColumns.forEach(sudokuArea -> fields.addAll(sudokuArea.getFields()));

		sudokuAreas.addAll(sudokuBoxes);
		sudokuAreas.addAll(sudokuRows);
		sudokuAreas.addAll(sudokuColumns);
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

	public ArrayList<Field> getFields(){
		return new ArrayList<>(fields);
	}

	public ArrayList<SudokuArea> getAreas(){
		return new ArrayList<>(sudokuAreas);
	}
}
