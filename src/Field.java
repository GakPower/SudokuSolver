import com.jfoenix.controls.JFXTextField;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;
import java.util.ArrayList;

public class Field {
	private JFXTextField textField;
	private GroupArea sudokuGroupArea;

	private ObservableSet<Integer> possipleNumbers = FXCollections.observableSet();

	private SimpleIntegerProperty numberProperty = new SimpleIntegerProperty(0);

	private boolean initialField = false;

	public Field(JFXTextField textField) {
		this.textField = textField;

		possipleNumbers.add(1);
		possipleNumbers.add(2);
		possipleNumbers.add(3);
		possipleNumbers.add(4);
		possipleNumbers.add(5);
		possipleNumbers.add(6);
		possipleNumbers.add(7);
		possipleNumbers.add(8);
		possipleNumbers.add(9);

		setUpListener();
		numberPropertyListener();

	}


	private void setUpListener(){
		this.textField.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.length() > 0 && (newValue.charAt(newValue.length() - 1) + "").matches("[1-9]")) {
				int number = Integer.valueOf(newValue.charAt(newValue.length() - 1) + "");
				if (numberExistsOnRelatedField(number)){
					for (Field field: getFieldWithNumber(number)){
						field.numberProperty.set(0);
						field.getField().setText(0+"");
					}
				}
				this.numberProperty.set(number);
				this.getField().setText(number+"");
			} else {
				textField.setText(textField.getText().replaceAll("[^1-9]", ""));
			}
		});
	}

	private boolean numberExistsOnRelatedField(int number){
		for (Field field: sudokuGroupArea.getFields()){
			if (field != this && field.getNumber() == number){
				return true;
			}
		}
		return false;
	}

	private ArrayList<Field> getFieldWithNumber(int number){
		ArrayList<Field> fields = new ArrayList<>();
		for (Field field: sudokuGroupArea.getFields()){
			if (field != this && field.getNumber() == number){
				fields.add(field);
			}
		}
		return fields;
	}

	private void numberPropertyListener(){
		numberProperty.addListener((observable, oldValue, newValue) -> {
			updatePossibleNumbers();
			this.getSudokuGroupArea().updateFreeNumbers();
		});
	}

	public ArrayList<Integer> getPossipleNumbersList(){
		return new ArrayList<>(possipleNumbers);
	}

	public JFXTextField getField() {
		return textField;
	}
	public Integer getNumber(){
		return numberProperty.get();
	}

	public void addAreas(GroupArea groupArea){
		this.sudokuGroupArea = groupArea;
	}

	public GroupArea getSudokuGroupArea() {
		return sudokuGroupArea;
	}

	public void updatePossibleNumbers(){
		this.resetPossibleNumbers();
		for (Field field : this.getSudokuGroupArea().getFields()) {
			possipleNumbers.remove(field.numberProperty.get());
		}
	}
	private void resetPossibleNumbers(){
		possipleNumbers.clear();
		for (int i = 1; i < 10; i++){
			possipleNumbers.add(i);
		}
	}

	public boolean isInitialField(){
		return initialField;
	}
	public void setAsInitialField(){
		initialField = true;
	}

	//================= Solving Strategies ==================
	public static void solveNakedSingles(SudokuBoard sudokuBoard){
		new Thread(()-> {
			for (Field field : sudokuBoard.getFields()) {
				if (!field.isInitialField() && field.getPossipleNumbersList().size() == 1) {
					field.getField().setText(field.getPossipleNumbersList().get(0) + "");
				}
			}
		}).start();
	}

	public static void solveHiddenSingles(SudokuBoard sudokuBoard){
		new Thread(()->{
			for (SudokuArea sudokuArea: sudokuBoard.getAreas()){
				for (Field field: sudokuArea.getFields()){
					for (Integer integer: field.getPossipleNumbersList()){
						boolean single = true;
						for (Field field1: sudokuArea.getFields()){
							if (!field.isInitialField() && !field1.isInitialField() && field != field1 && field1.getPossipleNumbersList().contains(integer)){
								single = false;
							}
						}
						if (single){
							field.getField().setText(integer+"");
						}
					}
				}
			}
		}).start();
	}
	//================= Solving Strategies ==================
}
