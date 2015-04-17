package com.example.actionbartabs;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		Tab tabA = actionBar.newTab()
					.setText("TAB A")
					.setTabListener(new MyTabListener(new TabA(), "tabA"));
		
		Tab tabB = actionBar.newTab()
				.setText("TAB B")
				.setTabListener(new MyTabListener(new TabB(), "tabB"));
		
		actionBar.addTab(tabA); 
		actionBar.addTab(tabB);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		if (savedInstanceState.containsKey("TABS_SAVE")){
			getActionBar().setSelectedNavigationItem(savedInstanceState.getInt("TABS_SAVE"));
		}
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		outState.putInt("TABS_SAVE", getActionBar().getSelectedNavigationIndex());
	}
		
	
	public static class MyTabListener implements TabListener {

		private Fragment fragment;
		private String tag;
				
		
		public MyTabListener(Fragment fragment, String tag) {
			this.fragment = fragment;
			this.tag = tag;
		}

		@Override
		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			ft.add(android.R.id.content, fragment, tag);
		}

		@Override
		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			ft.remove(fragment);
		}

		@Override
		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
