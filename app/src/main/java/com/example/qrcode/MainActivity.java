package com.example.qrcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

import com.zbar.lib.CaptureActivity;
import com.zbar.lib.R;

/**
 * 作者: 谢胜宝
 * 
 * 时间: 2016年1月16日 
 *
 * 版本: V_1.0.0
 *
 * 描述:
 */
public class MainActivity extends Activity {
    private Button btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//去除标题栏
		setContentView(R.layout.activity_main);
		
		btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this, CaptureActivity.class);
				startActivity(intent);
			}
		});
		
	}
}
