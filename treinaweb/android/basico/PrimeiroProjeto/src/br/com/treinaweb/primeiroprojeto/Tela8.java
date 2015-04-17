package br.com.treinaweb.primeiroprojeto;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Tela8 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela8);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_tela1, menu);
		return true;	
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		final TextView txResposta = (TextView) findViewById(R.id.textViewResposta);
		String msg = "";
		switch (item.getItemId()) {
		case R.id.menu_archive:
			msg = "Selecionada a opção arquivo";
			
//			AlertDialog.Builder mBox = new AlertDialog.Builder(this);
//			mBox.setMessage(msg);
//			mBox.setTitle("Arquivo");
//			mBox.setIcon(R.drawable.ic_menu_archive);
//			mBox.setNeutralButton("OK", new DialogInterface.OnClickListener() {
//				
//				@Override
//				public void onClick(DialogInterface dialog, int which) {
//					txResposta.setText("Botão OK Clicado");
//					
//				}
//			});
//			
//			mBox.show();
			
			Context context = getApplicationContext();
			int duracao = Toast.LENGTH_LONG;
			Toast toast = Toast.makeText(context, msg, duracao);
			toast.show();
			
			break;						
		case android.R.id.home:
			msg = "Selecionada o ícone da aplicação";
			

		default:
			break;
		}
		
		txResposta.setText(msg);
		return true;
	}
	

	
	
	
}
