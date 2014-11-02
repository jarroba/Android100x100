package com.jarroba.eventodefragmentafragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class FragmentInferior extends Fragment {

	private TextView textoCambiar;

	public FragmentInferior() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_inferior, container, false);

		textoCambiar = (TextView) rootView.findViewById(R.id.textView$fragment_inferior$textoCambiarFragmentInferior);

		return rootView;
	}

	public void comunicarmeConElFragment() {
		textoCambiar.setText("Texto cambiado");
	}

}