package jiayou_excel;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class excel {
public static void main(String args[]){
    File f=new File("D:"+File.separator+"test2.xls");
//�������Լ����ģ�λ��E:\dataAnalysis�ļ����е�test.xls
    try {
        Workbook book=Workbook.getWorkbook(f);//
        Sheet sheet=book.getSheet(0);   //��õ�һ�����������
        for(int i=0;i<sheet.getRows();i++){
            for(int j=0;j<sheet.getColumns();j++){
                Cell cell=sheet.getCell(j, i);  //��õ�Ԫ��
                System.out.print(cell.getContents()+" "); 
            }
            System.out.print("\n");
        }
    } catch (BiffException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
