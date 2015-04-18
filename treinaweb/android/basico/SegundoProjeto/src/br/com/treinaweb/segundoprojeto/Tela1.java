package br.com.treinaweb.segundoprojeto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tela1 extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);
		
		Button btnSalvar = (Button) findViewById(R.id.buttonSalvar);
		btnSalvar.setOnClickListener(mOnClickButtonSave);
	}
	
	private View.OnClickListener mOnClickButtonSave = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			EditText editCurso = (EditText) findViewById(R.id.editTextCurso);
			String nome = editCurso.getText().toString();
			Curso curso = new Curso(nome);
			RegistryCursoStore.addCursos(curso);
			
			Toast.makeText(getBaseContext(), "Curso cadastrado com sucesso!", Toast.LENGTH_LONG).show();
			
			//Limpando o campo
			editCurso.setText("");
		}
	};
	
	
	
}
