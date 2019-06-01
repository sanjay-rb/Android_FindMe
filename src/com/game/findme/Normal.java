package com.game.findme;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Normal extends Activity {
	
	EditText in;
	Button bc;
	int r, i;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_normal);
		
		in = (EditText) findViewById(R.id.in);
		bc = (Button) findViewById(R.id.bc);
		r = (int) (Math.random()*100+1);

		
		bc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				i=Integer.parseInt(in.getText().toString());
				
				if(in.getText().length()==0)
				{
					in.setError("Please enter the value");
				}
				
				
				if(r==i)
				{
					in.setText("");
					in.setHint("You are success");
					r = (int) (Math.random()*100+1);
				}
				else if(r<i)
				{
					in.setText("");
					in.setHint("Too large");
				}
				else if(r>i)
				{
					in.setText("");
					in.setHint("Too small");
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.normal, menu);
		return true;
	}

}
