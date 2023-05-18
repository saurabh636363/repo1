package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.CellBase;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class practice3 {

	public static void main(String[] args) throws IOException {

		File fi = new File("/Users/KA20463795/eclipse-workspace/guru99/src/main/java/pbl/excel/utilities/file1.xlsx");

		

		FileInputStream fis = new FileInputStream(fi);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheet = workbook.createSheet("Employee Data");

		// This data needs to be written (Object[])

		Map<String, Object[]> data = new TreeMap<String, Object[]>();

		XSSFSheet sheet1 = wb.getSheet("Sheet 1");

		int ro = sheet1.getLastRowNum();

		for (int i = 1; i < ro; i++) {

			data.put(Integer.toString(i), new Object[] { sheet1.getRow(i).getCell(0).toString() });

		}

		Set<String> keyset = data.keySet();

		int rownum = 0;

		for (String key : keyset)

		{

			Row row = sheet.createRow(rownum++);

			Object[] objArr = data.get(key);

			int cellnum = 0;

			for (Object obj : objArr)

			{

				Cell cell = (Cell) row.createCell(cellnum++);

				if (obj instanceof String)

					((CellBase) cell).setCellValue((String) obj);

				else if (obj instanceof Integer)

					((CellBase) cell).setCellValue((Integer) obj);

			}

		}

		try

		{

			

			FileOutputStream out = new FileOutputStream(new File("howtodoinjava_demo.xlsx"));

			workbook.write(out);

			out.close();

			System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");

		}

		catch (Exception e)

		{

			e.printStackTrace();

		}

	}

}
