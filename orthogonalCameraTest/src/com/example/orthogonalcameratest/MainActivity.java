package com.example.orthogonalcameratest;

import com.badlogic.gdx.backends.android.AndroidApplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends AndroidApplication {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initialize(new Game(), true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
