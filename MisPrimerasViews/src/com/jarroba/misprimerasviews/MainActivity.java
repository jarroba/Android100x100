package com.jarroba.misprimerasviews;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fichero_disenio_ejemplo);

		TextView miTexto = (TextView) findViewById(R.id.textView_idDelTextViewParaUtilizarEnJava);

		miTexto.setText(R.string.el_texto_cambiado_desde_java);

		int colorElegido = getResources().getColor(android.R.color.holo_green_light);
		miTexto.setBackgroundColor(colorElegido);

		miTexto.setRotation(45.0f);
	}
}