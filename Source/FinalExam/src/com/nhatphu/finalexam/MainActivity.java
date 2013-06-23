package com.nhatphu.finalexam;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {
	Button btnPlay ;
	MediaPlayer mediaPlayer = new MediaPlayer();
	TextView startGame;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listenning);
        //btnPlay = (Button)findViewById(R.id.btnPlay);
        //btnPlay.setOnClickListener(this);
//        mediaPlayer = MediaPlayer.create(this, R.raw.justgivemeareason);
//        startGame =(TextView)findViewById(R.id.start);
//        startGame.setOnClickListener(this);
//        //mediaPlayer.setLooping(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
//		int id = v.getId();
//		switch (id) {
//		case R.id.start:			
//			mediaPlayer.start();
//			break;
//
//		default:
//			break;
//		}
		
	}
    
}
