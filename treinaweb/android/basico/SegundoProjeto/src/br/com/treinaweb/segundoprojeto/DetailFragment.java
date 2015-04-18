package br.com.treinaweb.segundoprojeto;

import java.util.List;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragment_course_detail, container, false);
		return view;
	}
	
	public void load(int id){
		TextView tViewNome = (TextView) getView().findViewById(R.id.textViewCurso);
		
		List<Curso> cursos = RegistryCursoStore.getCursos();
		Curso curso = cursos.get(id);
		
		tViewNome.setText(curso.getNome());
	}
	
}
