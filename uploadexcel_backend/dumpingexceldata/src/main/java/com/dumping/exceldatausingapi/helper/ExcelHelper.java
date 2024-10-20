package com.dumping.exceldatausingapi.helper;

import com.dumping.exceldatausingapi.entities.Product;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelHelper {

    // Checks if file format is excel or not
    public static boolean isExcelFormat(MultipartFile file) {
        String fileContentType = file.getContentType();

        if (fileContentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
            return true;
        } else {
            return false;
        }
    }

    // Converts Excel To List
    public static List<Product> convertExcelToList(InputStream ins) {
        List<Product> list = new ArrayList<>();
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(ins); // Pass the InputStream here
            XSSFSheet sheet = workbook.getSheet("data"); // Ensure the sheet name is correct

            int rowNumber = 0;
            Iterator<Row> iterator = sheet.iterator();

            while (iterator.hasNext()) {
                Row row = iterator.next();

                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Iterator<Cell> cells = row.iterator();
                int cid = 0;
                Product product = new Product();

                while (cells.hasNext()) {
                    Cell cell = cells.next();
                    switch (cid) {
                        case 0:
                            product.setProductId((int) cell.getNumericCellValue());
                            break;
                        case 1:
                            product.setProductName(cell.getStringCellValue());
                            break;
                        case 2:
                            product.setProductCategory(cell.getStringCellValue());
                            break;
                        case 3:
                            product.setProductPrice(cell.getNumericCellValue());
                            break;
                        case 4:
                            product.setProductStockQuantity((int) cell.getNumericCellValue());
                            break;
                        default:
                            break;
                    }
                    cid++;
                }
                list.add(product);
            }
            workbook.close(); // Always close the workbook after processing
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
