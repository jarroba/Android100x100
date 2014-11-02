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
public class VideoA extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video_a);

//		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			case android.R.id.home:
//				Intent upIntent = getParentActivityIntent();
//				NavUtils.getParentActivityIntent(this);
//				navigateUpTo(getParentActivityIntent());

//				startActivity(getParentActivityIntent());
//				startActivity(getParentActivityIntent());

//				navigateUpToFromChild(this, getParentActivityIntent());

//				NavUtils.navigateUpFromSameTask(this);

//				Intent upIntent = getParentActivityIntent()
//				.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);

				Intent upIntent = getParentActivityIntent()
						.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(upIntent);
				finish();

				return true;
		}

//		switch (item.getItemId()) {
//			case android.R.id.home:
//				Intent upIntent = NavUtils.getParentActivityIntent(this);
//				if (shouldUpRecreateTask(upIntent)) {
//					// This activity is NOT part of this app's task, so create a new task
//					// when navigating up, with a synthesized back stack.
//					TaskStackBuilder.create(this)
//							// Add all of this activity's parents to the back stack
//							.addNextIntentWithParentStack(upIntent)
//							// Navigate up to the closest parent
//							.startActivities();
//				} else {
//					// This activity is part of this app's task, so simply
//					// navigate up to the logical parent activity.
//					navigateUpTo(upIntent);
//				}
//				return true;
//		}

		return super.onOptionsItemSelected(item);
	}

}
