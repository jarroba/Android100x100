package com.jarroba.deunaactivityaotra;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class SegundaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);

		Bundle bundle = getIntent().getExtras();
		String textoRecibido = bundle.getString(PrimeraActivity.CLAVE_EXTRA_PASAR, "texto por si la clave no tiene asignado un valor");

		TextView tvDatoRecibido = (TextView) findViewById(R.id.textView$activity_segunda$textoPasado);
		tvDatoRecibido.setText(textoRecibido);
	}
}
