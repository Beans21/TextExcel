package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	
	private int row;
	private int column;
	
    @Override
    public int getRow()
    {
    	return row;
    }

    @Override
    public int getCol()
    {
        return column;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	row= Integer.parseInt(cellName.substring(1))-1;
        String letters= "ABCDEFGHIJKL";
        String letter= cellName.substring(0,1);
        for (int i=0; i<12; i++) {
        	String substring= letters.substring(i, i+1);
        	if (letter.equals(substring)) {
        		column= i;
        	}
        }
    }

}
