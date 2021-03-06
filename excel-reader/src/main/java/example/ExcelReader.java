package example;

import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	List<String> readRows(Integer numberOfRows, File excelFile){
		List content = new ArrayList<ArrayList<String>>();
    List line = new ArrayList<String>();
    try{
      FileInputStream fileInputStream = new FileInputStream(excelFile);
      Workbook workbook = new XSSFWorkbook(fileInputStream);
      Sheet sheet = workbook.getSheetAt(0);

      for (Row row : sheet) {
        line = new ArrayList<String>();
        for (Cell cell : row) {
          if (cell.getCellTypeEnum() == CellType.STRING) {
            line.add(cell.getStringCellValue());
          } else if (cell.getCellTypeEnum() == CellType.NUMERIC) {
            line.add(String.valueOf(cell.getNumericCellValue()));
          }
        }
        content.add(line);
      }
    } catch(FileNotFoundException fne){
      throw new ExcelException(fne.getMessage(), fne);
    } catch(IOException ioe){
      throw new ExcelException(ioe.getMessage(), ioe);
    }

    return content;
  }

}
