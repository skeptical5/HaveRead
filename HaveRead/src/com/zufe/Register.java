/**
 * 
 */
package com.zufe;
/** 

* @author ����:����������ҩ 

* @version ����ʱ�䣺2020��6��10�� ����8:42:40 

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
 * @author ����������ҩ
 *
 * @time 2020��6��10��
 */

public class Register extends Activity {
	private EditText etUserName;
	private EditText etUserPass;
	private static final String[] hobbies= {"�ٶ�ͼ��","��ѧС˵","�������","��������","�ഺ����"};
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        this.etUserName=(EditText)this.findViewById(R.id.editText1);
        this.etUserPass=(EditText)this.findViewById(R.id.editText2);
        
        Spinner sp= (Spinner)this.findViewById(R.id.spinner1);
        //����
        Button btback=(Button)this.findViewById(R.id.button2);
        btback.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
			
		});
        //ע����ת
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
            //��ʽһ
      //      ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.citys,android.R.layout.simple_spinner_dropdown_item);
            //��ʽ��
            ArrayAdapter<String> adapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item, hobbies);
          //����spinner�������б���ʾ��ʽ
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sp.setAdapter(adapter);
            sp.setPrompt("��ѡ�����");
            sp.setSelection(0,true);
            sp.setOnItemSelectedListener(new OnItemSelectedListener() {
    			
    			public void onNothingSelected(AdapterView<?> arg0) {
    				// TODO Auto-generated method stub
    				
    			}
    			
    			public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
    				// TODO Auto-generated method stub
//    			//tv.setText("��ѡ��ĳ���Ϊ��"+arg0.getItemAtPosition(arg2.toString()));
    				//������ʾ��ǰѡ�����
    				arg0.setVisibility(View.VISIBLE);
    			}
    		});
            
        }
    }

