/**
 * 
 */
package com.zufe;
/** 

* @author ����:����������ҩ 

* @version ����ʱ�䣺2020��6��14�� ����7:09:44 

*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author ����������ҩ
 *
 * @time 2020��6��14��
 */

public class DongtaiActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dongtai);
		
		Button bt_return =(Button)findViewById(R.id.button_back);
		bt_return.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		Button button_xiangxi=(Button)findViewById(R.id.button_xiangxi);
		button_xiangxi.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent itpaihangbang=new Intent(DongtaiActivity.this,Dongtai_xxActivity.class);
				startActivity(itpaihangbang);
				
			}
		});
	}
}
