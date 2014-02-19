package com.example.blackjackgame;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class GamePlayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_play);

		ImageView[] dealerCardsImageView = new ImageView[5];
		dealerCardsImageView[0] = (ImageView) findViewById(R.id.dealercard1);
		dealerCardsImageView[1] = (ImageView) findViewById(R.id.dealercard2);
		dealerCardsImageView[2] = (ImageView) findViewById(R.id.dealercard3);
		dealerCardsImageView[3] = (ImageView) findViewById(R.id.dealercard4);
		dealerCardsImageView[4] = (ImageView) findViewById(R.id.dealercard5);

		for (int i = 0; i < dealerCardsImageView.length; i++) {
			String stringValue = "findViewById(R.id.dealercard" + (i + 1)
					+ ");";
			Method method;
			try {
				method = Class.forName("GamePlayActivity").getMethod(
						stringValue, String.class);
				dealerCardsImageView[i] = (ImageView) method.invoke(
						savedInstanceState, stringValue);
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// SET CARD IMAGES TO ImageViews
		for (int i = 0; i < dealerCardsImageView.length; i++) {
			String stringValue = "dealerCardsImageView[" + i + "]"
					+ ".setImageResource(R.drawable.c" + (i + 1);

			Class c;
			try {
				c = Class.forName("GamePlayActivity");
				Method method = c.getDeclaredMethod("setImageResource",
						Integer.class);
				method.invoke(this, stringValue);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game_play, menu);
		return true;
	}

}
