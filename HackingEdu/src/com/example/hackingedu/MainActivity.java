package com.example.hackingedu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
 
public class MainActivity extends Activity {
	 
	//	Declaring TextViews
	EditText editText1;
	
	//	Variables to Store EditText Values
	String  value1;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText1 = (EditText) findViewById(R.id.editText1);
		}	
	
	public void btn_clk(View v)
	{
				
		try {
            int value1 = Integer.parseInt(editText1.getText().toString());
            
            if (value1 > 99) {
            	Toast.makeText(getApplicationContext(), "Invalid Entry Dude", Toast.LENGTH_LONG).show();
                                
            } else if (value1 <= 99 || value1 >=0) {
            	
            	//Code of transition from one activity to another
            	Intent intent = new Intent(getApplicationContext(), Fibonacci.class);
                startActivity(intent); 
                Toast.makeText(getApplicationContext(), "Welcome Dude", Toast.LENGTH_LONG).show();
            }
        } 
		
		catch (NumberFormatException ex) {
        	}
	}
}