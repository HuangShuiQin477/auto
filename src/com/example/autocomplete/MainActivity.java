package com.example.autocomplete;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv;
	private AutoCompleteTextView act;
	private ArrayAdapter<String> arr_adapt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		act = (AutoCompleteTextView) findViewById(R.id.act);
		tv = (TextView) findViewById(R.id.textView1);
		String[] text = new String[] { "car车", "cat猫", "changed改变", "city城市", "choice选择"};
		arr_adapt = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, text);
		act.setAdapter(arr_adapt);
		act.setThreshold(1);

	}

}