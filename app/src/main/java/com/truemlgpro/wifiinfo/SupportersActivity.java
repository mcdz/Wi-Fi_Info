package com.truemlgpro.wifiinfo;

import android.app.*;
import android.os.*;
import androidx.appcompat.app.*;
import androidx.appcompat.widget.*;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import me.anwarshahriar.calligrapher.*;
import androidx.core.widget.*;
import android.view.*;
import android.widget.*;

public class SupportersActivity extends AppCompatActivity
{
	
	private Toolbar toolbar;
	private ScrollView scrollView;
	private TextView supporters_textview;
	private TextView anyx_text;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.supporters_activity);

		getWindow().addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

		toolbar = (Toolbar) findViewById(R.id.toolbar);
		scrollView = (ScrollView) findViewById(R.id.scrollView);
		supporters_textview = (TextView) findViewById(R.id.supporters_textview);
		anyx_text = (TextView) findViewById(R.id.anyx_text);
		
		Calligrapher calligrapher = new Calligrapher(this);
		calligrapher.setFont(this, "fonts/GoogleSans-Medium.ttf", true);

		setSupportActionBar(toolbar);
		final ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
		actionbar.setDisplayShowHomeEnabled(true);
		actionbar.setElevation(20);

		toolbar.setNavigationOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					// Back button pressed
					finish();
				}
			});
		
	}
}
