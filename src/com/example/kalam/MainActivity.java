package com.example.kalam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	ListView lv;
	String List[] = {"EnglishFragment","GkFragment","MathFragment"};
	Button btn;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		//lv =(ListView) findViewById(android.R.id.list);
		btn =(Button) findViewById(R.id.btn);
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,com.example.kalam.adapter.FragmentAdapter.class);
				startActivity(i);
			}
		});
		
		
		
		
		
		//SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(), List, R.id.list_item, from, to);
		
		//setListAdapter(new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,List));
		
		
		
	}
	
	

	/*@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String cheese = List[position];
		
		try {
			Class ourClass = Class.forName("com.example.kalam.adapter" + cheese);
			Intent i = new Intent(MainActivity.this,ourClass);
			startActivity(i);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
