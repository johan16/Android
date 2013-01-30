package cl.imc.codigo;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ImcActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Asignar layayr
		this.setContentView(R.layout.activity_imc);
		
		//mapear variables de XML
		Button btnCalcular = (Button) this.findViewById(R.id.btnCalcular);
		final EditText txtPeso = (EditText) this.findViewById(R.id.txtPeso);
		final EditText txtAltura = (EditText) this.findViewById(R.id.txtAltura);
		final TextView tvMensaje = (TextView) this.findViewById(R.id.tvMensaje);
		
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
	}

	protected void mostrarDialogo(String imc) {
		// TODO Auto-generated method stub
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Indicador IMC");
		builder.setMessage("Tu IMC es: " + imc);
		builder.show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_imc, menu);
		return true;
	}

}
