/**
 * 
 */
package com.zufe;
/** 

* @author ����:����������ҩ 

* @version ����ʱ�䣺2020��6��15�� ����2:26:28 

*/

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author ����������ҩ
 *
 * @time 2020��6��15��
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
