import javafx.collections.*;
import java.util.ArrayList;

public class SudokuArea {

	private ObservableSet<Field> areaFields;
	private GroupArea groupArea;

	public SudokuArea(ArrayList<Field> areaFields) {
		this.areaFields = FXCollections.observableSet();
		this.areaFields.addAll(areaFields);
	}

	public void setGroupArea(GroupArea groupArea){
		this.groupArea = groupArea;
	}

	public ObservableSet<Field> getFields(){
		return areaFields;
	}

}
