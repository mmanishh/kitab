package com.example.kalam.adapter;


import com.example.kalam.EnglishFragment;
import com.example.kalam.GkFragment;
import com.example.kalam.R;

import android.app.FragmentManager;
import com.example.kalam.*;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

public class FragmentAdapter extends FragmentActivity {
	
	private ViewPager mPager;

     //The pager adapter, which provides the pages to the view pager widget.
     
    private PagerAdapter mPagerAdapter;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		
		setContentView(R.layout.activity_screen_slide);
		mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){

			@Override
			public void onPageSelected(int position) {
				// TODO Auto-generated method stub
				//super.onPageSelected(position);
				invalidateOptionsMenu();
				
				
				
			}
        	
        	
        	
        	
        	
        	
        	
        });
			
			
        
	}
	
	private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter{

		public ScreenSlidePagerAdapter(android.support.v4.app.FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Fragment getItem(int arg0) {
			// TODO Auto-generated method stub
			switch(arg0){
			case 0:
				return new EnglishFragment();
				
			case 1 :
				return new GkFragment();
			}
			return null;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 2;
		}

		

		
		
		
		
	}
	
    
    
    
    
    

}
