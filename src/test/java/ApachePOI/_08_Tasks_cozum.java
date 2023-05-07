package ApachePOI;
/**  Soru 1:
 *  yeni excel (altalta.xls)
 *  Çarpım tablosunu excele yazdırınız.
 *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 *  sıfırdan excel oluşturarak.
 *  her bir onluktan sonra 1 satır boşluk bırakarak alt alata
 */
/**  Soru 2:
 * yeni excel (yanyana.xls)
 *  Çarpım tablosunu excele yazdırınız.
 *  1 x 1 = 1 şeklinde işaretleri de yazdırınız.
 *  sıfırdan excel oluşturarak.
 *  her bir onluktan sonra 1 kolon boşluk bırakarak yan yana
 */
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
public class _08_Tasks_cozum {
    public static void main(String[] args) throws IOException {
    //1.soru altalta.xlsx

    XSSFWorkbook workbook=new XSSFWorkbook();
    XSSFSheet sheet=workbook.createSheet("Sayfa1");

        for (int i = 1; i < 11; i++) {
        for (int j = 1; j <11 ; j++) {
            Row yeniSatir=sheet.createRow(sheet.getPhysicalNumberOfRows());
            Cell yeniHucre1= yeniSatir.createCell(0);
            yeniHucre1.setCellValue(i);
            Cell yeniHucre2= yeniSatir.createCell(1);
            yeniHucre2.setCellValue(" * ");
            Cell yeniHucre3= yeniSatir.createCell(2);
            yeniHucre3.setCellValue(j);
            Cell yeniHucre4= yeniSatir.createCell(3);
            yeniHucre4.setCellValue(" = ");
            Cell yeniHucre5= yeniSatir.createCell(4);
            yeniHucre5.setCellValue(i*j);
        }
        Row yeniSatir=sheet.createRow(sheet.getPhysicalNumberOfRows());
    }
    String path="src/test/java/ApachePOI/resource/altalta.xlsx";
    FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

    //2. soru  yanyana.xlsx

    XSSFWorkbook workbook2=new XSSFWorkbook();
    XSSFSheet sheet2=workbook2.createSheet("Sayfa1");

    int a=0;
        for (int j = 1; j <11 ; j++) {

        Row yeniSatir=sheet2.createRow(sheet2.getPhysicalNumberOfRows());

        for (int i = 1; i <11; i++)
        {
            Cell yeniHucre1= yeniSatir.createCell(0+a);
            yeniHucre1.setCellValue(i);
            Cell yeniHucre2= yeniSatir.createCell(1+a);
            yeniHucre2.setCellValue(" * ");
            Cell yeniHucre3= yeniSatir.createCell(2+a);
            yeniHucre3.setCellValue(j);
            Cell yeniHucre4= yeniSatir.createCell(3+a);
            yeniHucre4.setCellValue(" = ");
            Cell yeniHucre5= yeniSatir.createCell(4+a);
            yeniHucre5.setCellValue(i*j);
            a+=6;
        }
        a=0;
    }

    String path2="src/test/java/ApachePOI/resource/yanyana.xlsx";
    FileOutputStream outputStream2=new FileOutputStream(path2);
        workbook2.write(outputStream2);
        workbook2.close();
        outputStream2.close();
}
}
