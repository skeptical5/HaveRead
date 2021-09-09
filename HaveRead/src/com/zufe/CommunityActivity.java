/**
 * 
 */
package com.zufe;
/** 

* @author 作者:拔牙不打麻药 

* @version 创建时间：2020年6月12日 下午10:30:00 

*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author 拔牙不打麻药
 *
 * @time 2020年6月12日
 */

public class CommunityActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.community);
		
		Button bt_paihangbang=(Button)findViewById(R.id.button_paihangbang);
		bt_paihangbang.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent itpaihangbang=new Intent(CommunityActivity.this,CommunityActivity.class);
				startActivity(itpaihangbang);
				
			}
		});
		Button bt_return =(Button)findViewById(R.id.button_back);
		bt_return.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		
		Button bt_dongtai=(Button)findViewById(R.id.button_dongtai);
		bt_dongtai.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent itpaihangbang=new Intent(CommunityActivity.this,DongtaiActivity.class);
				startActivity(itpaihangbang);
				
			}
		});
	}
}
