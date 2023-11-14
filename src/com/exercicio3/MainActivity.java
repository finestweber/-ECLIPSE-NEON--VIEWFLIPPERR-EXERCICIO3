package com.exercicio3;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends Activity {

	ViewFlipper v_flipper;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		int images[] = {R.drawable.image1,R.drawable.image2,R.drawable.image3};
		v_flipper = (ViewFlipper) findViewById(R.id.v_flipper);
		for(int image : images){
			flipperImages(image);
		}
	}

	private void flipperImages(int image) {
		// TODO Auto-generated method stub
		ImageView imageView = (ImageView) new ImageView(this);
		imageView.setBackgroundResource(image);
		
		v_flipper.addView(imageView);
		v_flipper.setFlipInterval(4000);// 4segundos
		v_flipper.setAutoStart(true);
		// animação
		//v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
		v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
	}
	
}
