package com.open.inputmethod.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.view.Display;
import android.view.WindowManager;

/**
 * 
 * @author hailong.qiu 356752238@qq.com
 *
 */
public class MeasureHelper {

	private static MeasureHelper mInstance = new MeasureHelper();

	private MeasureHelper() {
	}

	public static MeasureHelper getInstance() {
		return mInstance;
	}

	private int mScreenWidth;
	private int mScreenHeight;
	
	/*
	 * 获取屏幕的高度和宽度.
	 */
	public void onConfigurationChanged(Configuration config, Context context) {
		WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
		Display d = wm.getDefaultDisplay();
		mScreenWidth = d.getWidth();
	}

	/*
	 * 软键盘的宽度.
	 */
	public int getScreenWidth() {
		return mScreenWidth;
	}
	
	public void setSkbHeight(int height) {
		this.mScreenHeight = height;
	}
	
	/*
	 * 软键盘的高度.
	 */
	public int getSkbHeight() {
		return mScreenHeight;
	}

}
