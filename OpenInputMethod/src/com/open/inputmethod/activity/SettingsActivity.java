package com.open.inputmethod.activity;

import com.open.inputmethod.R;

import android.app.Activity;
import android.os.Bundle;

/**
 * 输入法设置界面.
 * 
 * @author hailong.qiu 356752238@qq.com
 *
 */
public class SettingsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		finish();
	}

}
