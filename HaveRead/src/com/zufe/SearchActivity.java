/**
 * 
 */
package com.zufe;
/** 

* @author ����:����������ҩ 

* @version ����ʱ�䣺2020��6��12�� ����10:30:56 

*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author ����������ҩ
 *
 * @time 2020��6��12��
 */

public class SearchActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
	
	Button bt_return =(Button)findViewById(R.id.button_back);
	bt_return.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			finish();
		}
	});
	
	Button button_fenlei=(Button)findViewById(R.id.button_paihangbang);
	button_fenlei.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent itpaihangbang=new Intent(SearchActivity.this,SearchActivity.class);
			startActivity(itpaihangbang);
			
		}
	});
	
	Button button_renwen=(Button)findViewById(R.id.button3);
	button_renwen.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent itpaihangbang=new Intent(SearchActivity.this,renwensheke.class);
			startActivity(itpaihangbang);
			
		}
	});
	
	Button button_tuijian=(Button)findViewById(R.id.button_dongtai);
	button_tuijian.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent itpaihangbang=new Intent(SearchActivity.this,meirituijian.class);
			startActivity(itpaihangbang);
			
		}
	});
	}
}
