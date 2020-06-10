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
import android.content.*;
import android.net.*;

import androidx.drawerlayout.widget.DrawerLayout;

public class DiscordServersActivity extends AppCompatActivity
{

	private Toolbar toolbar;
	private DrawerLayout mDrawerLayout;
	private Button true_mlg_pro_button;
	private Button andrew_button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.discord_servers_activity);
		
		getWindow().addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
		toolbar = (Toolbar) findViewById(R.id.toolbar);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		true_mlg_pro_button = (Button) findViewById(R.id.true_mlg_pro_button);
		andrew_button = (Button) findViewById(R.id.torneix_button);
		
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
	
	public void official_onClick(View v) {
		String url = "https://discord.gg/qxE2DFr";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	public void andrew_onClick(View v) {
		String url = "https://discord.gg/c5GF2Ux";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
}
