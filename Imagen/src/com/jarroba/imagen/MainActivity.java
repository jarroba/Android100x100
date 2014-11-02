package com.jarroba.imagen;

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
		setContentView(R.layout.activity_main);

		int colorElegido = getResources().getColor(R.color.Azul);

		TextView tv = (TextView) findViewById(R.id.textView_a_colorear);
		tv.setTextColor(colorElegido);
	}

}