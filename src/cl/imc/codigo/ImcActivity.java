package cl.imc.codigo;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ImcActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Asignar layout
		this.setContentView(R.layout.activity_imc);
		
		//mapear variables de XML
		Button btnCalcular = (Button) this.findViewById(R.id.btnCalcular);
		final EditText txtPeso = (EditText) this.findViewById(R.id.txtPeso);
		final EditText txtAltura = (EditText) this.findViewById(R.id.txtAltura);
		Button btnResultado = (Button) this.findViewById(R.id.btnResultado);
		//Asignar el lisener al boton
		btnCalcular.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String sAltura = txtAltura.getText().toString();
				String sPeso = txtPeso.getText().toString();
				
				double peso = Double.parseDouble(sPeso);
				double altura = Double.parseDouble(sAltura);
				
				double imc = Imc.calcularImc(peso, altura);
				String sImc = String.valueOf(imc);
				
				//Desplegar mensaje
				mostrarDialogo(sImc);
				//tvMensaje.setText("Tu IMC es: " + imc);
			}
		});
		//Asignar lisener al boton resulddo
		btnResultado.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				lanzarResultado();
			}
		});
	}

	protected void lanzarResultado() {
		// TODO Auto-generated method stub
		Intent i = new Intent(this, ResultadoActivity.class);
		this.startActivity(i);
		
	}

	protected void mostrarDialogo(String imc) {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Indicador IMC");
		builder	.setMessage("Tu IMC es: " + imc)
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						lanzarResultado();
					}
				})
				.setNegativeButton("No", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						
					}
				}).create().show();
		
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_imc, menu);
		return true;
	}

}
