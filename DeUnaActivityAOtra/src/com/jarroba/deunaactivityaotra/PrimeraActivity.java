package com.jarroba.deunaactivityaotra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class PrimeraActivity extends Activity {

	public final static String CLAVE_EXTRA_PASAR = PrimeraActivity.class.getName() + "-claveDelDatoAPasarALaOtraActivity";

	private EditText et;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_primera);

		et = (EditText) findViewById(R.id.editText$activity_primera$textoPasar);

		Button bt = (Button) findViewById(R.id.button$activity_primera$botonIniciarActivity);
		bt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String textoAPasar = et.getText().toString();

				Intent intencion = new Intent(getApplicationContext(), SegundaActivity.class);
				intencion.putExtra(CLAVE_EXTRA_PASAR, textoAPasar);
				startActivity(intencion);
			}
		});
	}
}
