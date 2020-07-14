/**
 * 
 */
package com.zufe;
/** 

* @author 作者:拔牙不打麻药 

* @version 创建时间：2020年6月10日 下午8:42:40 

*/

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;

/**
 * @author 拔牙不打麻药
 *
 * @time 2020年6月10日
 */

public class Register extends Activity {
	private EditText etUserName;
	private EditText etUserPass;
	private static final String[] hobbies= {"少儿图书","文学小说","人文社科","生活育儿","青春动漫"};
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        this.etUserName=(EditText)this.findViewById(R.id.editText1);
        this.etUserPass=(EditText)this.findViewById(R.id.editText2);
        
        Spinner sp= (Spinner)this.findViewById(R.id.spinner1);
        //返回
        Button btback=(Button)this.findViewById(R.id.button2);
        btback.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
			
		});
        //注册跳转
        Button btReg=(Button)this.findViewById(R.id.button1);
btReg.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase("/data/data/com.zufe/hr.db", null);
				String userName=etUserName.getText().toString().trim();
				String userPass=etUserPass.getText().toString().trim();
				String sql="insert into user(uname,upwd) values('"+userName+"','"+userPass+"')";
				db.execSQL(sql);
				db.close();
				finish();
			}
			
		});
            //方式一
      //      ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.citys,android.R.layout.simple_spinner_dropdown_item);
            //方式二
            ArrayAdapter<String> adapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item, hobbies);
          //设置spinner的下拉列表显示样式
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sp.setAdapter(adapter);
            sp.setPrompt("请选择类别：");
            sp.setSelection(0,true);
            sp.setOnItemSelectedListener(new OnItemSelectedListener() {
    			
    			public void onNothingSelected(AdapterView<?> arg0) {
    				// TODO Auto-generated method stub
    				
    			}
    			
    			public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
    				// TODO Auto-generated method stub
//    			//tv.setText("你选择的城市为："+arg0.getItemAtPosition(arg2.toString()));
    				//设置显示当前选择的项
    				arg0.setVisibility(View.VISIBLE);
    			}
    		});
            
        }
    }

