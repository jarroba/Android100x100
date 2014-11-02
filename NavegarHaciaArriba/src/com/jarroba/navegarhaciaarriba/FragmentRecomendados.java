package com.jarroba.navegarhaciaarriba;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class FragmentRecomendados extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.recomendados, container, false);

		Button bLibroA = (Button) rootView.findViewById(R.id.button$libros$libroA);
		bLibroA.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(), LibroA.class);
				startActivity(intent);
			}
		});

		Button bVideoA = (Button) rootView.findViewById(R.id.button$videos$videoA);
		bVideoA.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(), VideoA.class);
				startActivity(intent);
			}
		});

		return rootView;
	}

}
