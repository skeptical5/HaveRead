/**
 * 
 */
package com.zufe;
/** 

* @author 作者:拔牙不打麻药 

* @version 创建时间：2020年6月15日 上午2:26:28 

*/

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author 拔牙不打麻药
 *
 * @time 2020年6月15日
 */

public class pizhu extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pizhu);
	
	Button bt_return =(Button)findViewById(R.id.button_back);
	bt_return.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			finish();
		}
	});
	}
	
}
