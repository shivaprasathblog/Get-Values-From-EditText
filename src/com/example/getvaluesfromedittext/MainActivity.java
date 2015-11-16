package com.example.getvaluesfromedittext;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity 

{
	//STEP 1: Declare the edittext ,Textview and button as et ,tv and  b
	EditText et;
    	TextView tv;
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//STEP 2: Refer the edittext,textview and button from xml
		et=(EditText)findViewById(R.id.editText1);
		tv=(TextView)findViewById(R.id.textView1);
		b=(Button)findViewById(R.id.button1);
		
		//STEP 3: Set the listener and create the object for the listener (button-b)
		b.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				
				//STEP 4:Receving the value got from edittext in String "str"
				String str=et.getText().toString();
				//STEP 5: Set the message to be displayed in edit text on button click
				tv.setText(str);
				
			}
		});
	}

	

}
