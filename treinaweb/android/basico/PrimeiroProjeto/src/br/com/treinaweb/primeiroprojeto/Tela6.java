package br.com.treinaweb.primeiroprojeto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Tela6 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela6);
		
		String[] cursos = getResources().getStringArray(R.array.cursos);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_gallery_item, cursos);
		
		ListView list = (ListView) findViewById(R.id.listViewCursos);
		list.setAdapter(adapter);
		
		list.setOnItemClickListener(itemClickListener);
	}
	
	private OnItemClickListener itemClickListener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
			TextView resposta = (TextView) findViewById(R.id.textViewResposta);
			String curso = ((TextView) view).getText().toString();
			
			resposta.setText("Reposta: "+ curso);
			
		}
	};

	
	
}
