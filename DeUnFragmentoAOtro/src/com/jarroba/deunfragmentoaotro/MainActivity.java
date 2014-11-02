package com.jarroba.deunfragmentoaotro;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

import com.jarroba.deunfragmentoaotro.EstaticoFragment.OnMiClickListener;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class MainActivity extends Activity implements OnMiClickListener {

	private boolean mPermutador = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		DinamicoFragmentA fragmentDinA = new DinamicoFragmentA();

		getFragmentManager().beginTransaction()
				.add(R.id.frameLayout$activity_main$contenedorFragmentsDinamicos, fragmentDinA)
				.commit();

//		fragment.setArguments(arguments);

	}

	@Override
	public void onClickCambiarFragmentDinamico() {
		Fragment fragmentElegido = null;

		if (mPermutador) {
			fragmentElegido = new DinamicoFragmentB();
		} else {
			fragmentElegido = new DinamicoFragmentA();
		}

		getFragmentManager().beginTransaction()
				.replace(R.id.frameLayout$activity_main$contenedorFragmentsDinamicos, fragmentElegido)
				.commit();

		mPermutador = !mPermutador;
	}
}