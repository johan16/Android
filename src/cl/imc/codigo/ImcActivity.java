package cl.imc.codigo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
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
		EditText txtPeso = (EditText) this.findViewById(R.id.txtPeso);
		EditText txtAltura = (EditText) this.findViewById(R.id.txtAltura);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_imc, menu);
		return true;
	}

}
