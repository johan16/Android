package cl.imc.codigo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultadoActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Asignar layout
		this.setContentView(R.layout.layout_resultado);
		Button btnVolver = (Button) this.findViewById(R.id.btnVolver);
		
		btnVolver.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				volverInicio();
			}
		});
	}

	protected void volverInicio() {
		// TODO Auto-generated method stub
		Intent i = new Intent(this, ImcActivity.class);
		this.startActivity(i);
		
	}
}
