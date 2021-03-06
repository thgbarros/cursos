package br.com.treinaweb.primeiroprojeto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tela1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);
		getActionBar().setDisplayHomeAsUpEnabled(true);
						
		Button btn = (Button) findViewById(R.id.buttonProximo);
		btn.setOnClickListener(clickListener);
				
		
	}

	private OnClickListener clickListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			TextView tvResultado = (TextView) findViewById(R.id.textViewResposta);
			EditText txtNome = (EditText) findViewById(R.id.extTextNome);
			
			String msg = txtNome.getText().toString();
			//tvResultado.setText(msg);
			
			Bundle parametros = new Bundle();
			parametros.putString("nome", msg);
			
			Intent intencao = new Intent(Tela1.this, Tela2.class);
			intencao.putExtras(parametros);
			startActivity(intencao);
		}
	};
	
//	public void cliqueBotaoOK(View view) {
//		TextView tvResultado = (TextView) findViewById(R.id.textViewResposta);
//		EditText txtNome = (EditText) findViewById(R.id.extTextNome);
//		
//		String msg = "Nome: " + txtNome.getText().toString();
//		tvResultado.setText(msg);
//	}

}
