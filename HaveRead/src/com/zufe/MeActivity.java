/**
 * 
 */
package com.zufe;
/** 

* @author ����:����������ҩ 

* @version ����ʱ�䣺2020��6��12�� ����10:38:41 

*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author ����������ҩ
 *
 * @time 2020��6��12��
 */

public class MeActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.me);
	
	Button bt_return =(Button)findViewById(R.id.button_back);
	bt_return.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			finish();
		}
	});
	
	TextView tv3=(TextView)findViewById(R.id.textView3);
	tv3.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent itpaihangbang=new Intent(MeActivity.this,meirituijian.class);
			startActivity(itpaihangbang);
			
		}
	});
	
	TextView tv6=(TextView)findViewById(R.id.textView6);
	tv6.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent itpaihangbang=new Intent(MeActivity.this,BaogaoActvity.class);
			startActivity(itpaihangbang);
			
		}
	});
	}
	
}
