package com.hck.player.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import cn.waps.AppConnect;
import cn.waps.UpdatePointsNotifier;

import com.hck.myplayer.R;
import com.hck.player.date.Date;
import com.hck.player.date.LocalDate;
import com.hck.player.utils.SharedPreference;
import com.wole56.sdk.APP;

public class LodingActivity extends Activity  {
	private ImageView imageView; // ��ʾlodingҳ��ͼƬ
	private Animation animation; // ���䶯��
    private View view;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loding);
		init();
		new SharedPreference(this); // ��ʼ�������ڱ���һЩ��Ϣ
		boolean b = SharedPreference.getIsFirst(); // ���û��Ƿ��ǵ�һ��ʹ��
		if (b) { // ˵����һ�ν���
			SharedPreference.saveIsFirst(); // �������ݣ������и�firstkey����������Ϊfalse���������ǵ�һ�ν���Ӧ����
			SharedPreference.saveTime(System.currentTimeMillis(), this); // �����û�ʹ��ʱ���ʱ�䣬���ں��浯����ǽ�����(���û�ʹ��һ��ʱ��󣬲ŵ�)
		}
		 initAd(); //��ʼ�����
		imageView = (ImageView) findViewById(R.id.img);
		animation = AnimationUtils.loadAnimation(this, R.anim.loding);
		imageView.setAnimation(animation);
		animation.setAnimationListener(new AnimationListener() {
			@Override
			public void onAnimationStart(Animation animation) {

			}

			@Override
			public void onAnimationRepeat(Animation animation) {

			}
			@Override
			public void onAnimationEnd(Animation animation) {
				
			}
		});
	}

	Handler handler = new Handler() {
		public void handleMessage(android.os.Message msg) {
			view.setVisibility(View.GONE);
           startMainActivity();
		};
	};
	private void init() {
		view=findViewById(R.id.pb);
		new Thread() {
			@Override
			public void run() {
				super.run();
				APP.init(getApplicationContext(), LocalDate.app_id,
						LocalDate.app_key).toString();
				handler.sendEmptyMessage(0);
			}
		}.start();
	}

	private void initAd() {
		AppConnect.getInstance(this);// ��ʼ����棬���չ��ƽ̨�����ĵ������˵��
		AppConnect.getInstance(this).initPopAd(this);
	}

	private void startMainActivity() {
		startActivity(new Intent(LodingActivity.this, MainActivity.class)); // ��intent������������
		this.finish();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		AppConnect.getInstance(this).close(); // �Ӵ�����
	}

	
}
