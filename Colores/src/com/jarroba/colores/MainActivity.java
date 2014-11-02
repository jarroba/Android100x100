package com.jarroba.colores;

import android.app.Activity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.Button;
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
		setContentView(R.layout.activity_main);

		// Coloreamos el texto con un color de los nuestros
		int colorMio = getResources().getColor(R.color.Morado_ligeramente_transparente);

		TextView tv = (TextView) findViewById(R.id.textView$activity_main$texto);
		tv.setTextColor(colorMio);

		// Coloreamos el texto con un color de la API de Android
		int colorDeLaApiDeAndroid = getResources().getColor(android.R.color.holo_blue_dark);

		Button btn = (Button) findViewById(R.id.button$activity_main$boton);
		btn.setTextColor(colorDeLaApiDeAndroid);

		// Colorearemos cada letra de un texto con el array
		int[] coloresSemaforo = getResources().getIntArray(R.array.ColoresSemaforo);

		Spannable textoColoreado = new SpannableString("Texto que tendrá cada letra coloreada");
		for (int i = 0; i < textoColoreado.length(); i++) {
			Log.v("test", i + " % 3 = " + (i % 3));
			int colorElegido = coloresSemaforo[i % 3];
			textoColoreado.setSpan(new ForegroundColorSpan(colorElegido), i, i + 1, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
		}

		TextView tvColores = (TextView) findViewById(R.id.textView$activity_main$textoLetrasColoreadas);
		tvColores.setText(textoColoreado);
	}

}