/**
 * 
 */
package com.zufe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/** 

* @author 作者:拔牙不打麻药 

* @version 创建时间：2020年6月15日 上午1:01:40 

*/

/**
 * @author 拔牙不打麻药
 *
 * @time 2020年6月15日
 */

public class meirituijian extends Activity{

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meirituijian);
	
	Button bt_return =(Button)findViewById(R.id.button_back);
	bt_return.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			finish();
		}
	});
	
	Button button_meirituijian=(Button)findViewById(R.id.button_dongtai);
	button_meirituijian.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent itpaihangbang=new Intent(meirituijian.this,meirituijian.class);
			startActivity(itpaihangbang);
			
		}
	});
	Button button_fenlei=(Button)findViewById(R.id.button_paihangbang);
	button_fenlei.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent itpaihangbang=new Intent(meirituijian.this,SearchActivity.class);
			startActivity(itpaihangbang);
			
		}
	});
	
	Button button_tuijian=(Button)findViewById(R.id.button_dongtai);
	button_tuijian.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent itpaihangbang=new Intent(meirituijian.this,meirituijian.class);
			startActivity(itpaihangbang);
			
		}
	});
//textView1
	TextView tv1=(TextView)findViewById(R.id.textView1);
	tv1.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent itpaihangbang=new Intent(meirituijian.this,santi.class);
			startActivity(itpaihangbang);
			
		}
	});
	}
}
