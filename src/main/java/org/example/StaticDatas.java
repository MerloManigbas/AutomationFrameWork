package org.example;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class StaticDatas {
    //Single Input Field
    public static String FirstSampleMessage = "Sample Message";
    public static String ActualMessage = "Your Message: Sample Message";


    //Two Input Fields
    public static int aValue = 3;
    public static int bValue = 4;
    public static String TotalOutput = "Total a + b = 7";
    public static int total = aValue + bValue;
    public static String totalvalue = Integer.toString(total);

    //Single Checkbox Demo
    public static String SuccessMessage = "Success - Check box is checked";


    //Multiple Checkbox Demo
    public static String UncheckAll = "Uncheck All";
    public static String CheckAll = "Check All";

    //Radio Button Demo
    public static String RadioVerification = "Radio button 'Male' is checked";

    //Select List Demo
    public static String Dayselect = "Sunday";
    public static String OptionCount = "options count is: ";

    //Multi Select List Demo
    public static String Stateselect = "Texas";


    //Multi Select List Demo
    public static String Valuesare = "The values are: ";

    //Input form with validations
        static FileInputStream fis;

    static {
        try {
            fis = new FileInputStream("/Users/johnmanigbas/Desktop/MainProj 2/src/main/java/org/example/ExcelData/SampleData.xlsx");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static XSSFWorkbook workbook;
    static {
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static XSSFSheet SHEET = workbook.getSheet("testdata");
        public static String Fnameexcel = SHEET.getRow(1).getCell(1).getStringCellValue();
        public static String Lnameexcel = SHEET.getRow(2).getCell(1).getStringCellValue();
        public static String emailexcel = SHEET.getRow(3).getCell(2).getStringCellValue();
        public static String Phoneexcel = SHEET.getRow(4).getCell(1).getStringCellValue();
        public static String Addressexcel = SHEET.getRow(5).getCell(1).getStringCellValue();
        public static String Cityexcel = SHEET.getRow(6).getCell(1).getStringCellValue();
        public static String Stateexcel = SHEET.getRow(7).getCell(1).getStringCellValue();
        public static String Zipexcel = SHEET.getRow(8).getCell(1).getRawValue();
        public static String Webexcel = SHEET.getRow(9).getCell(1).getStringCellValue();
        public static String Pdescexcel = SHEET.getRow(10).getCell(1).getStringCellValue();

    // Ajax Form Submit with Loading icon
    public static String Success = "Form submited Successfully";

    // Single Select - Search and Select country
    public static String DropdownCountry = "Denmark";
    public static String [] DropdownState = {"Sample","Arizona","California","Florida"};
    public static String DropdownTerritories = "Puerto Rico";
    public static String ProgLang = "Python";

    //Bootstrap Date Pickers Example
    public static String ExpectedDay = "15";
    public static String ExpectedMonth = "August";
    public static String ExpectedYearString = "2020";
    public static String firstCharacters = ExpectedMonth.substring(0, 3);
    public static String TotalDate = ExpectedMonth + " " + ExpectedYearString;

    //Date Range Example :
    public static String ExpectedEndDay = "21";
    public static String ExpectedEndMonth = "Jul";
    public static String ExpectedEndYear = "2023";
    public static String EndfirstCharacters = ExpectedEndMonth.substring(0, 3);
    public static String TotalEndDate2 = ExpectedEndMonth + " " + ExpectedEndYear;

    //Table data search
    public static String searchintable="Wireframe";
    public static String Comp = "Complete";
    public static String DisplayAllData = "Display all data";
    public static String DisplaySearchedData = "Display first searched data";

    //Table with Pagination Example
    public static String activePage = "Active Page: ";

    //Table data search
    public static String UserName = "Markino";

    //Bootstrap Download
    public static String Percenttotal = "100%";

    //Drag and Drop sliders
    public static int startload = 70;
    public static int endload = 40;

    //Window Handles
    public static String WindowHandleString = "window handle ";
    public static String WindowHandleString2 = "window handle 2";
    public static String WindowHandleString3 = "window handle 3";

    //JavaScripts Alert
    public static String My2ndName = "Merlo";

    //JavaScripts Alert
    public static String DualListBoxName = "Alice";

    //Data List Filter
    public static String DatalistName = "Brenda";

    //Window Pop up
    public static String ParentTitleString = "Selenium Easy - Window Popup Modal Demo";
    public static String FBTitleString = "Selenium Easy | Hyderabad";
    public static String XTitleString = "X";
    public static String FBValidation = "Successfully switch to Facebook";
    public static String XValidation = "Successfully switch to X";
    public static String ParentValidation = "Successfully switch to parent";

    public StaticDatas() throws IOException {



    }
}