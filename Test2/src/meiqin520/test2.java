package meiqin520;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			try {

				/**
				 * ������������,����Excel�����ͼƬ�Լ������������͵Ķ�ȡ
				 **/
				InputStream is = new FileInputStream("C:\\Users\\yes\\Desktop\\����� 1.xls");

				Workbook book = Workbook
						.getWorkbook(new File("C:\\Users\\yes\\Desktop\\����� 1.xls"));
				book.getNumberOfSheets();
				// ��õ�һ�����������
				Sheet sheet = book.getSheet(0);
				int Rows = sheet.getRows();
				int Cols = sheet.getColumns();
				System.out.println("��ǰ�����������:" + sheet.getName());
				System.out.println("������:" + Rows);
				System.out.println("������:" + Cols);
				for (int i = 0; i < Cols; ++i) {
					for (int j = 0; j < Rows; ++j) {
						// getCell(Col,Row)��õ�Ԫ���ֵ
						System.out
								.print((sheet.getCell(i, j)).getContents() + "\t");
					}
					System.out.print("\n");
				}
				// �õ���һ�е�һ�еĵ�Ԫ��
				Cell cell1 = sheet.getCell(0, 0);
				String result = cell1.getContents();
				System.out.println(result);
				book.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}


