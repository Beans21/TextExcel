package textExcel;

public class EmptyCell implements Cell {

	public String abbreviatedCellText() {
		String emptyString= "          ";
		return emptyString;
	}
	
	public String fullCellText() {
		return "";
	}
}
