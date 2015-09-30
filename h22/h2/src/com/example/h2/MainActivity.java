package com.example.h2;

import java.io.FileInputStream;
import java.io.InputStream;

import jxl.Sheet;
import jxl.Workbook;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button button1=null;Button button2=null;Button button3=null;Button button4=null;Button button5=null;Button button6=null;
	Button button7=null;Button button8=null;Button button9=null;Button button10=null;Button button11=null;Button button12=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1=(Button)findViewById(R.id.bn1);button1.setMovementMethod(ScrollingMovementMethod.getInstance());
		button2=(Button)findViewById(R.id.bn2);button2.setMovementMethod(ScrollingMovementMethod.getInstance());
		button3=(Button)findViewById(R.id.bn3);button3.setMovementMethod(ScrollingMovementMethod.getInstance());
		button4=(Button)findViewById(R.id.bn4);button4.setMovementMethod(ScrollingMovementMethod.getInstance());
		button5=(Button)findViewById(R.id.bn5);button5.setMovementMethod(ScrollingMovementMethod.getInstance());
		button6=(Button)findViewById(R.id.bn6);button6.setMovementMethod(ScrollingMovementMethod.getInstance());
		button7=(Button)findViewById(R.id.bn7);button7.setMovementMethod(ScrollingMovementMethod.getInstance());
		button8=(Button)findViewById(R.id.bn8);button8.setMovementMethod(ScrollingMovementMethod.getInstance());
		button9=(Button)findViewById(R.id.bn9);button9.setMovementMethod(ScrollingMovementMethod.getInstance());
	
		
		readExcel();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void readExcel() {
		  try {
		   /**
		    * 后续考虑问题,比如Excel里面的图片以及其他数据类型的读取
		    **/
		   InputStream is = new FileInputStream("C:\\Users\\yes\\Desktop\\����� 1.xls");
		   
		   Workbook book = Workbook.getWorkbook(is);
		   
		   int num = book.getNumberOfSheets();
		   
		   // 获得第一个工作表对象
		   Sheet sheet = book.getSheet(0);
		   int Rows = sheet.getRows();
		   int Cols = sheet.getColumns();
		   button1.setText(sheet.getCell(3, 1).getContents());
		   button2.setText(sheet.getCell(3, 2).getContents());
		   button3.setText(sheet.getCell(3, 3).getContents());
		   button4.setText(sheet.getCell(3, 4).getContents());
		   button5.setText(sheet.getCell(3, 5).getContents());
		   button6.setText(sheet.getCell(3, 6).getContents());
		   button7.setText(sheet.getCell(3, 7).getContents());
		   button8.setText(sheet.getCell(3, 8).getContents());
		   button9.setText(sheet.getCell(3, 9).getContents());
		  
		  
		   
		   book.close();
		  } catch (Exception e) {
		   System.out.println(e);
		  }
		}
	class clicklistener implements View.OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			setContentView(R.layout.check);
		}
		
	}

}
