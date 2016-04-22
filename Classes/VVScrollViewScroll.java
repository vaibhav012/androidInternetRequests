package com.example.vaibhav.tryfragment;

import android.os.CountDownTimer;
import android.widget.ScrollView;

public class VvScrollViewScroll{
	public void vvScrollViewScroll(final ScrollView scrollView, long totalTime, int interval, int heightPerInterval){
		final long totalScrollTime = totalTime; //total scroll time.
		final int scrollPeriod = interval; // every 20 ms scoll will happened. smaller values for smoother
		final int heightToScroll = heightPerInterval; // will be scrolled to 20 px every time. smaller values for smoother scrolling

		scrollView.post(new Runnable() {
			@Override
			public void run() {
				new CountDownTimer(totalScrollTime, scrollPeriod) {
					public void onTick(long millisUntilFinished) {
						scrollView.scrollBy(0, heightToScroll);
						}
					public void onFinish() {
					}
				}.start();
			}
		});
	}
}