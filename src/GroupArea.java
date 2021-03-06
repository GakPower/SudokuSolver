import com.jfoenix.controls.JFXTextField;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;
import javafx.collections.SetChangeListener;

import java.util.*;

public class GroupArea {
	private SudokuArea sudokuBox;
	private SudokuArea sudokuRow;
	private SudokuArea sudokuColumn;

	private ObservableSet<Field> fields = FXCollections.observableSet();

	private ObservableSet<Integer> freeNumbers = FXCollections.observableSet();


	private static ArrayList<GroupArea> groupAreas = new ArrayList<>();

	public GroupArea(SudokuArea sudokuBox, SudokuArea sudokuRow, SudokuArea sudokuColumn){
		this.sudokuBox = sudokuBox;
		this.sudokuRow = sudokuRow;
		this.sudokuColumn = sudokuColumn;

		this.sudokuBox.setGroupArea(this);
		this.sudokuRow.setGroupArea(this);
		this.sudokuColumn.setGroupArea(this);

		fields.addAll(sudokuBox.getFields());
		fields.addAll(sudokuRow.getFields());
		fields.addAll(sudokuColumn.getFields());

		groupAreas.add(this);

		freeNumbers.add(1);
		freeNumbers.add(2);
		freeNumbers.add(3);
		freeNumbers.add(4);
		freeNumbers.add(5);
		freeNumbers.add(6);
		freeNumbers.add(7);
		freeNumbers.add(8);
		freeNumbers.add(9);
	}

	public ArrayList<Field> getFields(){
		return new ArrayList<>(fields);
	}

	public void updateFreeNumbers(){
		for (Field field : getFields()) {
			field.updatePossibleNumbers();
		}
	}

	public static ArrayList<GroupArea> getGroupsAreas(){
		return groupAreas;
	}
}
