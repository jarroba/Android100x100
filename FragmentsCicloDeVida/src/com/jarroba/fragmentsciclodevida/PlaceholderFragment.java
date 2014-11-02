package com.jarroba.fragmentsciclodevida;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class PlaceholderFragment extends Fragment {

	private final String LOG_TAG = "test";

	public PlaceholderFragment() {
	}

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		Log.v(LOG_TAG, "onAttach");
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(LOG_TAG, "onCreate");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_main, container, false);
		Log.v(LOG_TAG, "onCreateView");
		/*
		 * Aquí podemos seleccionar las Views contenidas en el Layout para trabajar con ellas, por ejemplo con:
		 * TipoView miView = (TipoView) rootView.findViewById(R.id.miViewXML);
		 */
		return rootView;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.v(LOG_TAG, "onActivityCreated");
	}

	@Override
	public void onViewStateRestored(Bundle savedInstanceState) {
		super.onViewStateRestored(savedInstanceState);
		Log.v(LOG_TAG, "onViewStateRestored");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.v(LOG_TAG, "onStart");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.v(LOG_TAG, "onResume");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.v(LOG_TAG, "onPause");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.v(LOG_TAG, "onStop");
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.v(LOG_TAG, "onDestroyView");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.v(LOG_TAG, "onDestroy");
	}

	@Override
	public void onDetach() {
		super.onDetach();
		Log.v(LOG_TAG, "onDetach");
	}

}