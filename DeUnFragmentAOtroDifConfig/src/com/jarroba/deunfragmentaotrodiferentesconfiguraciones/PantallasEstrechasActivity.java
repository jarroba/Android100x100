package com.jarroba.deunfragmentaotrodiferentesconfiguraciones;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class PantallasEstrechasActivity extends Activity {

	public final static String KEY_FLAG_FRAGMENT_ENVIADO = "Clave atributo que recibe este fragment";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantallas_estrechas);

		if (savedInstanceState == null) {
			Bundle extras = getIntent().getExtras();
			int flagFragment = extras.getInt(KEY_FLAG_FRAGMENT_ENVIADO);

			Fragment fragmentElegido = null;
			switch (flagFragment) {
				case EstaticoFragment.FLAG_FRAGMENT_A: {
					fragmentElegido = new DinamicoFragmentA();
					break;
				}
				case EstaticoFragment.FLAG_FRAGMENT_B: {
					fragmentElegido = new DinamicoFragmentB();
					break;
				}
			}

			getFragmentManager().beginTransaction()
					.add(R.id.frameLayout$activity_pantallas_estrechas$contenedorFragmentsDinamicos, fragmentElegido)
					.commit();
		}
	}

}
