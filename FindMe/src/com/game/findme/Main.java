package com.game.findme;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main extends Activity {
	
	
	Button e, n, h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e= (Button) findViewById(R.id.e);
        n= (Button) findViewById(R.id.normal);
        h= (Button) findViewById(R.id.h);
        
        e.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent ein = new Intent(Main.this, Easy.class);
				Main.this.startActivity(ein);
				
			}
		});
        
        n.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent nin = new Intent(Main.this, Normal.class);
				Main.this.startActivity(nin);
				
			}
		});
 
        h.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				
				Intent hin = new Intent(Main.this, Hard.class);
				Main.this.startActivity(hin);
				
			}
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
