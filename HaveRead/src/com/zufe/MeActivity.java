/**
 * 
 */
package com.zufe;
/** 

* @author 作者:拔牙不打麻药 

* @version 创建时间：2020年6月12日 下午10:38:41 

*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author 拔牙不打麻药
 *
 * @time 2020年6月12日
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
