package com.zufe;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class HaveReadActivity extends Activity {
	private Drawable drawable;
	public static final String SP_INFO="hr_data";
	public static final String USERID="UserId";
	public static final String USERPASS="UserPass";
	private EditText etUid;
	private EditText etPwd;
	private String uidStr;
	private String upwdStr;
	private CheckBox cb;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button buttoncreate=(Button)this.findViewById(R.id.buttoncreate);
        cb=(CheckBox)this.findViewById(R.id.checkBox1);
        etUid =(EditText)this.findViewById(R.id.etname);
        etPwd=(EditText)this.findViewById(R.id.etpassword);
        checkIfRemember();
        
        Button btnLogin =(Button)this.findViewById(R.id.btlog);
        btnLogin.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String userName=etUid.getText().toString().trim();
				String userPass=etPwd.getText().toString().trim();
				SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase("/data/data/com.zufe/hr.db", null);
				Cursor qc=db.query("user",null,"uname=? and upwd=?",new String[]{userName,userPass},null,null,null);
				
				if(qc.getCount()>0) {
					Intent it=new Intent(HaveReadActivity.this,FrameTableActivity.class);
					startActivity(it);
					qc.close();
					db.close();
				}
				
			}
		});
        
        //创建数据库
        buttoncreate.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SQLiteDatabase db=SQLiteDatabase.openOrCreateDatabase("/data/data/com.zufe/hr.db",null);
				String sql="create table user(uid integer primary key autoincrement,uname text,upwd text)";
				db.execSQL(sql);
				db.close();
			}
		});
        Button btReg=(Button)this.findViewById(R.id.buttonregister);
        btReg.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(HaveReadActivity.this,Register.class);
				startActivity(it);
			}
		});
        
        
    }
    
    
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		if(cb.isChecked()) {
			uidStr=etUid.getText().toString().trim();
			upwdStr=etPwd.getText().toString().trim();
			rememberMe(uidStr, upwdStr);
		}
	}


	private void checkIfRemember() {
		// TODO Auto-generated method stub
		SharedPreferences sp=getSharedPreferences(SP_INFO, MODE_PRIVATE);
    	uidStr =sp.getString(USERID, null);
    	upwdStr=sp.getString(USERPASS, null);
    	if(uidStr!=null && upwdStr!=null) {
    		etUid.setText(uidStr);
    		etPwd.setText(upwdStr);
    		cb.setChecked(true);
    	}
	}
	
	/**
	 * @param uidStr2
	 * @param upwdStr2
	 */
	private void rememberMe(String uid, String pwd) {
		// TODO Auto-generated method stub
		SharedPreferences sp=getSharedPreferences(SP_INFO, MODE_PRIVATE);
    	SharedPreferences.Editor editor=sp.edit();
    	editor.putString(USERID, uid);
    	editor.putString(USERPASS, pwd);
    	editor.commit();
	}

}