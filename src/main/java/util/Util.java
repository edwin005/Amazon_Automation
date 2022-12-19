package util;

import org.openqa.selenium.By;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Date;
import java.util.Random;

public class Util {

    private Util(){}
    private static Util utilInstance = null;

    public static Util getUtilInstance(){
        if(utilInstance == null){

            utilInstance = new Util();
        }

        return utilInstance;
    }

    By getXpathElement(String xpath){
        return By.xpath(xpath);
    }


    /**
     * @Author Edwin De Los Santos A.
     * Fecha de creación: 02/16/2022
     * Este método permite crear un archivo excel en formato xlsx.
     */
    public void createExcel() throws IOException {

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Nombre de la hoja");

        Row row = sheet.createRow(0);

        row.createCell(0).setCellValue("Productos");
        row.createCell(1).setCellValue(2.3);
        row.createCell(2).setCellValue(true);
        row.createCell(3).setCellValue(new Date());

        Cell cell = row.createCell(4);
        cell.setCellFormula(String.format("2-3", ""));

        Row rowTwo = sheet.createRow(1);

        rowTwo.createCell(0).setCellValue("Servicios");
        rowTwo.createCell(1).setCellValue(2.3);
        rowTwo.createCell(2).setCellValue(45.3);
        rowTwo.createCell(3).setCellValue(false);

        Cell cellTwo = rowTwo.createCell(4);

        //B y C son las columna, y el %d nos permite pasar el numero de las filas por parametro.
        cellTwo.setCellFormula(String.format("B%d + C%d", 2,2));

        FileOutputStream file = new FileOutputStream("Prueba.xlsx");
        workbook.write(file);
        file.close();
    }

    /**
     * @Author Edwin De Los Santos A.
     * Creation Date: 02/16/2022
     * This method allows us to read an excel file (Extension: xlsx).
     * @param filePath It's the location of the file.
     * @param sheetNumber It's the index of the page where the cell we want the information from is. Starts from 0.
     * @param rowIndex  It's the row where the cell we want the information from is. Starts from 0.
     * @param columnIndex It's the column where the cell we want the information from is. Starts from 0.
     */
    public String readExcel(String filePath, int sheetNumber, int rowIndex, int columnIndex){
        String value = "";
        double doubleValue;

        try {
            FileInputStream file = new FileInputStream(new File(filePath));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(sheetNumber);

            Row row = sheet.getRow(rowIndex);

            Cell cell = row.getCell(columnIndex);

            switch (cell.getCellType().toString()){
                case "STRING":
                    value = cell.getStringCellValue();
                    break;

                case "NUMERIC":
                    doubleValue = cell.getNumericCellValue();
                    value = Double.toString(doubleValue);
                    break;

                case "FORMULA":
                    value = cell.getCellFormula();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("FileNotFoundException occured: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException occured: " + e.getMessage());
        }finally {
            return value;
        }
    }

    /**
     * @Author Edwin De Los Santos A.
     * Fecha de creación: 02/16/2022
     * Este método devuelve un conjunto de caracteres al azar.
     */
    public String getRandomString(){
        String userName = "";
        Random random = new Random();
        for(int i = 0; i<12; i++){

            userName += (char) random.nextInt(26 + 'a');
        }

        return userName;
    }

}
