package com.zbar.decode;

import android.app.Activity;
import android.content.DialogInterface;
/**
 * 作者: 谢胜宝
 * 
 * 时间: 2016年1月16日 
 *
 * 版本: V_1.0.0
 *
 * 描述:
 */
public final class FinishListener
implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener, Runnable {

private final Activity activityToFinish;

public FinishListener(Activity activityToFinish) {
this.activityToFinish = activityToFinish;
}

public void onCancel(DialogInterface dialogInterface) {
run();
}

public void onClick(DialogInterface dialogInterface, int i) {
run();
}

public void run() {
activityToFinish.finish();
}

}

