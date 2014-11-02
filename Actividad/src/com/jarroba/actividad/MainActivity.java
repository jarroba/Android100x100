package com.jarroba.actividad;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class MainActivity extends Activity {

	private static final String TAG = "test";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.v(TAG, "Create");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.v(TAG, "Start");
	}

	@Override
	public void onRestart() {
		super.onRestart();
		Log.v(TAG, "Restart");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.v(TAG, "Resume");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.v(TAG, "Pause");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.v(TAG, "Stop");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.v(TAG, "Destroy");
	}

}