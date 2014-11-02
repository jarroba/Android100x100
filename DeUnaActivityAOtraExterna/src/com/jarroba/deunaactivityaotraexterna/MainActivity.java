package com.jarroba.deunaactivityaotraexterna;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class MainActivity extends Activity {

	private ImageView imageViewFotografia;

	private static final int REQUESTCODE_CAPTURA_DE_IMAGEN = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imageViewFotografia = (ImageView) findViewById(R.id.imageView$activity_main$ponerAquiFoto);
		final Intent miIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		//Comprobamos que exista alguna Activity que pueda controlar esta petición
		if (miIntent.resolveActivity(getPackageManager()) != null) {
			Button botonHacerFoto = (Button) findViewById(R.id.button$activity_main$hacerFoto);
			botonHacerFoto.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					startActivityForResult(miIntent, REQUESTCODE_CAPTURA_DE_IMAGEN);
				}
			});
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
		if (resultCode == Activity.RESULT_OK) {
			switch (requestCode) {
				case REQUESTCODE_CAPTURA_DE_IMAGEN: {
					Bundle extras = intent.getExtras();
					Bitmap imagenBitmap = (Bitmap) extras.get("data");
					imageViewFotografia.setImageBitmap(imagenBitmap);
					break;
				}
			}
		}
		super.onActivityResult(requestCode, resultCode, intent);
	}

}
