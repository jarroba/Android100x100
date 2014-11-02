package com.jarroba.navegarhaciaarriba;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class LibroA extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.libro_a);

//		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home:
				navigateUpTo(getParentActivityIntent());
//				Activity activityPadre = getParent();
//				navigateUpToFromChild(this, getParentActivityIntent());

//				startActivity(getParentActivityIntent());

//				navigateUpTo(getParentActivityIntent());
//				NavUtils.navigateUpFromSameTask(this);

				Intent upIntent = getParentActivityIntent()
						.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(upIntent);
				finish();

				return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
