package com.example.hackingedu;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fibonacci extends MainActivity implements OnClickListener{

	Button button2;
	EditText editText1;
	TextView text;
	
	 	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main2);
	    editText1 = (EditText) findViewById(R.id.editText1);	    
	    text = (TextView) findViewById(R.id.text);
	    button2 = (Button) findViewById(R.id.button2);
	    button2.setOnClickListener(this);
}
	
	public static int fib(int n) {
		
		if (n <= 0)
		      return 0;
		    if (n == 1)
		      return 1;
		    return fib(n - 1) + fib(n - 2);
	}

	public String butn_clk(int n){
	    
		StringBuilder sb = new StringBuilder(fib(0));
			for (int i = 1; i <= n; ++i) {
	        sb.append(" ");
	        sb.append(fib(i));
	    }
		
	    return sb.toString();
	}

	@Override
	public void onClick(View arg0) {
		
		Integer data = Integer.parseInt(editText1.getText().toString()); 
		String output = butn_clk(data);
		text.setText(output);
		
	}
			
}
