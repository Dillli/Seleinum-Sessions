package WebDriverSessions;



public class ExcelOperations {

	public static void main(String[] args) {

		//get test data from excel:
		excel.utility.Xls_Reader reader = new excel.utility.Xls_Reader("/Users/naveenkhunteta/Documents/workspace/MorningSessions/src/com/testdata/HalfEbayTestData.xlsx");
		
		
		if(!reader.isSheetExist("HomePage")){
			reader.addSheet("HomePage");
		}
		
		int colCount = reader.getColumnCount("RegTestData");
		System.out.println("Total cols present in RegTestData sheet:====" + colCount);
		System.out.println(reader.getCellRowNum("RegTestData", "firstname", "Tom"));
	}

}
