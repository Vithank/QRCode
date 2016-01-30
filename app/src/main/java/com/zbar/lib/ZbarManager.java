package com.zbar.lib;

/**
 * 作者: 谢胜宝
 * 
 * 时间: 2016年1月16日 
 *
 * 版本: V_1.0.0
 *
 * 描述:zbar调用类
 */
public class ZbarManager {

	static {
		System.loadLibrary("zbar");
	}

	public native String decode(byte[] data, int width, int height, boolean isCrop, int x, int y, int cwidth, int cheight);
}
