package com.jarroba.eventos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class MainActivity extends Activity {

	private Button bt;
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tv = (TextView) findViewById(R.id.textView$activity_main$coloreame);
		bt = (Button) findViewById(R.id.button$activity_main$pulsame);

		bt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Button btDentro = (Button) v;
				btDentro.setText("Pulsado y color cambiado");
				btDentro.setEnabled(false);
				int color = getResources().getColor(android.R.color.holo_red_light);
				tv.setTextColor(color);
				tv.setText("Color cambiado");
			}
		});
	}

}
