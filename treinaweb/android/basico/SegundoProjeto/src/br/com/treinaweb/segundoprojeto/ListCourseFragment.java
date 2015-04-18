package br.com.treinaweb.segundoprojeto;

import java.util.List;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListCourseFragment extends Fragment {

	private OnListCourseSelectedListener mCallback;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {		
		View view = inflater.inflate(R.layout.fragment_course_list, container, false);		
		return view;
	}
	
	@Override
	public void onStart() {	
		super.onStart();
		List<Curso> cursos = RegistryCursoStore.getCursos();
		ArrayAdapter<Curso> mAdapter = new ArrayAdapter<Curso>(getActivity(), android.R.layout.simple_gallery_item, cursos);
		
		ListView list = (ListView) getView().findViewById(R.id.listViewCursos);
		list.setAdapter(mAdapter);
		
		list.setOnItemClickListener(mItemClickListener);
	}
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		
		try{
			mCallback = (OnListCourseSelectedListener) activity;
		}catch(ClassCastException e){
			throw new ClassCastException(activity.toString() + 
					" deve implementar OnListCourseSelectedListener");
		}
		
	}
	
	private OnItemClickListener mItemClickListener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,	long id) {
			// TODO Auto-generated method stub
			mCallback.onCourseSelected(id);
		}
		
		
	};
	
}
