package br.com.treinaweb.primeiroprojeto;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Tela8 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela8);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_tela1, menu);
		return true;	
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		TextView txResposta = (TextView) findViewById(R.id.textViewResposta);
		String msg = "";
		switch (item.getItemId()) {
		case R.id.menu_archive:
			msg = "Selecionada a opção arquivo";
			break;

		default:
			break;
		}
		
		txResposta.setText(msg);
		return true;
	}
	

	
	
	
}