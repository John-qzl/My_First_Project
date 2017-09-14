package com.example.picpopupwindow;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.button).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				showPopwindow();
			}
		});

	}

	private void showPopwindow() {
		View parent = ((ViewGroup) this.findViewById(android.R.id.content)).getChildAt(0);
		View popView = View.inflate(this, R.layout.camera_pop_menu, null);

		Button btnCamera = (Button) popView.findViewById(R.id.btn_camera_pop_camera);
		Button btnAlbum = (Button) popView.findViewById(R.id.btn_camera_pop_album);
		Button btnCancel = (Button) popView.findViewById(R.id.btn_camera_pop_cancel);

		int width = getResources().getDisplayMetrics().widthPixels;
		int height = getResources().getDisplayMetrics().heightPixels;

		final PopupWindow popWindow = new PopupWindow(popView,width,height);
		popWindow.setAnimationStyle(R.style.AnimBottom);
		popWindow.setFocusable(true);
		popWindow.setOutsideTouchable(false);// ����������������ʧ

		OnClickListener listener = new OnClickListener() {
			public void onClick(View v) {
				switch (v.getId()) {
				case R.id.btn_camera_pop_camera:
					
					break;
				case R.id.btn_camera_pop_album:
					
					break;
				case R.id.btn_camera_pop_cancel:
					
					break;
				}
				popWindow.dismiss();
			}
		};

		btnCamera.setOnClickListener(listener);
		btnAlbum.setOnClickListener(listener);
		btnCancel.setOnClickListener(listener);

		ColorDrawable dw = new ColorDrawable(0x30000000);
		popWindow.setBackgroundDrawable(dw);
		popWindow.showAtLocation(parent, Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
	}

}
