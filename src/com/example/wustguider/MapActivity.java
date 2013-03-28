package com.example.wustguider;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class MapActivity extends Activity {
	private  Button queryButton;
	private  Button releaseButton;
	private TextView showItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		queryButton=(Button)findViewById(R.id.button1);
		releaseButton=(Button)findViewById(R.id.button2);
		showItem=(TextView)findViewById(R.id.textView1);
		
		queryButton.setGravity(Gravity.LEFT);
		releaseButton.setGravity(Gravity.RIGHT);
		showItem.setGravity(Gravity.CENTER);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_map, menu);
		return true;
	}

}
