/**
 * 
 */
package com.zufe;
/** 

* @author ����:����������ҩ 

* @version ����ʱ�䣺2020��6��12�� ����9:12:31 

*/

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Gallery.LayoutParams;

/**
 * @author ����������ҩ
 *
 * @time 2020��6��12��
 */

public class normalActivity extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.normal);
		ListView lvPublish=(ListView)this.findViewById(R.id.listView1);
		BaseAdapter adapter=new BaseAdapter() {
		String[] maintext=getResources().getStringArray(R.array.normal_maintext);
		String[] subtext=getResources().getStringArray(R.array.normal_subtext);
		String[] imgIds=getResources().getStringArray(R.array.normal_icons);
		
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			LinearLayout layout=new LinearLayout(normalActivity.this);
			layout.setOrientation(LinearLayout.HORIZONTAL);
			layout.setGravity(Gravity.LEFT);
			ImageView iv=new ImageView(normalActivity.this);
			iv.setAdjustViewBounds(true);
			iv.setPadding(20, 20, 10, 10);
			iv.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(imgIds[position], "drawable", getPackageName())));
			layout.addView(iv);
			TextView tv=new TextView(normalActivity.this);
			tv.setPadding(10, 20, 0, 0);
			tv.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT));
			tv.setTextAppearance(normalActivity.this, R.style.text);
			tv.setText(maintext[position]);
			layout.addView(tv);
			
			TextView tv1=new TextView(normalActivity.this);
			tv1.setPadding(0, 0, 20, 0);
			tv1.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
			tv1.setGravity(Gravity.RIGHT);
			tv1.setTextAppearance(normalActivity.this, R.style.smalltext);
			tv1.setText(subtext[position]);
			layout.addView(tv1);
			return layout;
		}
		
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public int getCount() {
			// TODO Auto-generated method stub
			
			return maintext.length;
		}
	};
	lvPublish.setAdapter(adapter);
	Button bt=(Button)findViewById(R.id.button1);
bt.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent it=new Intent(normalActivity.this,pizhu.class);
			startActivity(it);
		}

	});
	}
}
