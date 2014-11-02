package com.jarroba.navegarhaciaarriba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class Videos extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.videos);

		Button bIrVideoA = (Button) findViewById(R.id.button$videos$videoA);
		bIrVideoA.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), VideoA.class);
				startActivity(intent);
			}
		});

	}

}
