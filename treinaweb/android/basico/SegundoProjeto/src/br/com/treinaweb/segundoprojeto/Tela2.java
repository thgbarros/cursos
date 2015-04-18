package br.com.treinaweb.segundoprojeto;

import android.app.Activity;
import android.os.Bundle;

public class Tela2 extends Activity implements OnListCourseSelectedListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela2);
	}

	@Override
	public void onCourseSelected(long id) {
		// TODO Auto-generated method stub
		
		DetailFragment detailFragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detail_course_fragment);
		
		if (detailFragment != null)
			detailFragment.load((int) id);
		
	}
	
}
