package com.example.stickyhabits;

import java.io.File;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Database.setContext(this);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	/** Called when the user clicks the Sign Up button */
	public void signUp(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, SignUp.class);
	    startActivity(intent);
	}
	
	/** Called when the user clicks the Sign In button */
	public void signIn(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, SignIn.class);
	    startActivity(intent);
	}

}
