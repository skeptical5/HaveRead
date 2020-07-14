/**
 * 
 */
package com.zufe;
/** 

* @author ����:����������ҩ 

* @version ����ʱ�䣺2020��6��13�� ����10:58:44 

*/

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

/**
 * @author ����������ҩ
 *
 * @time 2020��6��13��
 */

public class FrameTableActivity extends TabActivity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		final TabHost tabHost =this.getTabHost();
		Intent itNormal=new Intent(this,normalActivity.class);
		Intent itCommunity=new Intent(this,CommunityActivity.class);
		Intent itSearch=new Intent(this,SearchActivity.class);
		Intent itMe=new Intent(this,MeActivity.class);
		tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator(null,getResources().getDrawable(R.drawable.normal)).setContent(itNormal));
		tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator(null,getResources().getDrawable(R.drawable.community)).setContent(itCommunity));
		tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator(null,getResources().getDrawable(R.drawable.search)).setContent(itSearch));
		tabHost.addTab(tabHost.newTabSpec("tab4").setIndicator(null,getResources().getDrawable(R.drawable.me)).setContent(itMe));
		
		TabWidget tabWidget=tabHost.getTabWidget();//����������ɫ 
		for(int i=0;i<tabWidget.getChildCount();i++){            
			TextView tv=(TextView)tabWidget.getChildAt(i).findViewById(android.R.id.title);            
			ImageView iv=(ImageView)tabWidget.getChildAt(i).findViewById(android.R.id.icon);            
			iv.setPadding(0, 2, 0, 0);    
			tv.setPadding(0, 0, 0, -5);          
			tv.setTextColor(Color.WHITE); 
			tv.setTextSize(10);
			
			View vvv = tabHost.getTabWidget().getChildAt(i);
			if (tabHost.getCurrentTab() == i) {
			//ѡ�к�ı���
			vvv.setBackgroundDrawable(getResources().getDrawable(R.color.whitesmoke));
			} else {
			//��ѡ��ı���
			vvv.setBackgroundDrawable(getResources().getDrawable(R.color.white));
			}
			}
	}
}
