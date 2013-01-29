package cl.imc.codigo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ImcActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_imc);
		//Asignar layayr
		this.setContentView(R.layout.activity_imc);
		
		//mapear variables de XML
		Button btnCalcular = (Button) this.findViewById(R.id.btnCalcular);
		final EditText txtPeso = (EditText) this.findViewById(R.id.txtPeso);
		final EditText txtAltura = (EditText) this.findViewById(R.id.txtAltura);
		
		//Asignar el lisener al boton
		btnCalcular.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String sAltura = txtAltura.getText().toString();
				String sPeso = txtPeso.getText().toString();
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_imc, menu);
		return true;
	}

}
