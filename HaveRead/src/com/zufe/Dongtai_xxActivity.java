/**
 * 
 */
package com.zufe;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RemoteViews.ActionException;

/** 

* @author ����:����������ҩ 

* @version ����ʱ�䣺2020��6��14�� ����8:56:49 

*/

/**
 * @author ����������ҩ
 *
 * @time 2020��6��14��
 */

public class Dongtai_xxActivity extends Activity{
	String str1="����";
	String str2="�ѵ���";
			
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dongtai_xiangxi);
		
		Button bt_return =(Button)findViewById(R.id.button_back);
		bt_return.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		final Button bt_nice =(Button)findViewById(R.id.button1_nice);
		final ImageView iv=(ImageView)findViewById(R.id.imageView2);
		bt_nice.setText(str1);
		bt_nice.setTag(false);
		bt_nice.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				boolean flag=(Boolean) bt_nice.getTag();
				if (!flag) {
					bt_nice.setText(str2);
					bt_nice.setTag(true);
					iv.setImageDrawable(getResources().getDrawable(R.drawable.nice));
					bt_nice.setTextColor(Color.parseColor("#e65357"));
				}
				else {
					bt_nice.setText(str1);
					bt_nice.setTag(false);
					iv.setImageDrawable(getResources().getDrawable(R.drawable.unnice));
					bt_nice.setTextColor(Color.parseColor("#000000"));
				}
			}
		});
	}
}
