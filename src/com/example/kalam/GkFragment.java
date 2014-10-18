package com.example.kalam;

import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.LinearLayout;

public class GkFragment extends Fragment

{

	LinearLayout linearchart;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_gk,
				container, false);
		// return super.onCreateView(inflater, container, savedInstanceState);
		linearchart = (LinearLayout) rootview.findViewById(R.id.linearChart);
		drawChart(5);
		
		return rootview;
	}

	public void drawChart(int count) {
		System.out.println(count);
		for (int k = 1; k <= count; k++) {
			View view = new View(getActivity());
			view.setBackgroundColor(Color.parseColor("#ff6233"));
			view.setLayoutParams(new LinearLayout.LayoutParams(30, 100));
			LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) view
					.getLayoutParams();
			params.setMargins(10, 0, 0, 0);
			// substitute parameters for left,top, right, bottom
			// view.setLayoutParams(params); linearChart.addView(view); } }
		}
	}

}
