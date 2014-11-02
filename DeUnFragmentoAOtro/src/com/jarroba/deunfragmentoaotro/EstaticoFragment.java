package com.jarroba.deunfragmentoaotro;

import android.app.Activity;
import android.app.Fragment;
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
public class EstaticoFragment extends Fragment {

	public interface OnMiClickListener {
		public void onClickCambiarFragmentDinamico();
	}

	private static OnMiClickListener mListnerVacio = new OnMiClickListener() {
		@Override
		public void onClickCambiarFragmentDinamico() {
		}
	};

	private OnMiClickListener mListener = mListnerVacio;

	public EstaticoFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_estatico, container, false);

		Button boton = (Button) rootView.findViewById(R.id.button$fragment_estatico$cambiarFragmentsDinamicos);
		boton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mListener.onClickCambiarFragmentDinamico();
			}
		});

		return rootView;
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);

		try {
			mListener = (OnMiClickListener) activity;
		} catch (ClassCastException e) {
			throw new IllegalStateException("La clase " + activity.toString() + " debe implementar de la interfaz " + OnMiClickListener.class.getName() + " del Fragment al que quiere escuchar");
		}
	}

	@Override
	public void onDetach() {
		super.onDetach();
		mListener = mListnerVacio;
	}

}