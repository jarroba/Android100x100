package com.jarroba.deunfragmentaotrodiferentesconfiguraciones;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jarroba.deunfragmentaotrodiferentesconfiguraciones.EstaticoFragment.OnMiClickListener;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class MainActivity extends Activity implements OnMiClickListener {

	private boolean mDosFragmentos = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		View frameLayoutContenedor = findViewById(R.id.frameLayout$activity_main$contenedorFragmentsDinamicos);

		mDosFragmentos = frameLayoutContenedor != null && frameLayoutContenedor.getVisibility() == View.VISIBLE;

		if (mDosFragmentos) {
			this.onClickCambiarFragmentDinamico(EstaticoFragment.FLAG_FRAGMENT_A);
		}

	}

	@Override
	public void onClickCambiarFragmentDinamico(int flagFragment) {

		if (mDosFragmentos) {
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
					.replace(R.id.frameLayout$activity_main$contenedorFragmentsDinamicos, fragmentElegido)
					.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
					.commit();
		} else {
			Intent intent = new Intent();
			intent.setClass(this, PantallasEstrechasActivity.class);
			intent.putExtra(PantallasEstrechasActivity.KEY_FLAG_FRAGMENT_ENVIADO, flagFragment);
			startActivity(intent);
		}

	}
}