package com.jarroba.eventodefragmentaactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jarroba.eventodefragmentaactivity.MiFragment.OnMiClickListener;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class MainActivity extends Activity implements OnMiClickListener {

	private TextView texto;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		texto = (TextView) findViewById(R.id.textView$activity_main$texto);
	}

	@Override
	public void onClickEnMiBoton(View v) {
		texto.setText("Texto cambiado");
	}

}
