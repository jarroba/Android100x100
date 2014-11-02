package com.jarroba.strings;

import android.app.Activity;
import android.os.Bundle;
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

		//-------------------String Normal----------------------
		Button botonGuardar = (Button) findViewById(R.id.button$activity_main$PulsarParaGuardar);
		String textoDelBoton = getString(R.string.boton_guardar);
		botonGuardar.setText(textoDelBoton);
		//-------------------String Normal----------------------

		String misStrings = "{";

		//-------------------String Array-----------------------
		String[] arrayStringPajaros = getResources().getStringArray(R.array.stringarray_pajaros);
		for (String pajaro : arrayStringPajaros) {
			misStrings += "\n" + pajaro + ",";
		}
		//-------------------String Array-----------------------

		misStrings += "\n}\n";

		//-------------------Quantity Strings-------------------
		for (int i = 0; i < 4; i++) {
			String stringCantidad = getResources().getQuantityString(R.plurals.plurals_numero_de_pajaros, i, i);
			misStrings += "\n" + i + ": " + stringCantidad;
		}
		//-------------------Quantity Strings-------------------

		TextView tvMostrarStrings = (TextView) findViewById(R.id.textView$activity_main$MostarStrings);
		tvMostrarStrings.setText(misStrings);
	}
}