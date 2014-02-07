package com.example.resourcesid;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		TextView msg_text = (TextView)findViewById(R.id.text);

        msg_text.setText(getText(R.string.msg));
        Resources res = getResources();
        int msg_color = res.getColor(R.color.textcolor);
        msg_text.setTextColor(msg_color);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
