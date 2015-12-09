package com.roaringcatgames.testgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BrownieBouncer extends Game {
	private SpriteBatch batch;

	private IScreenDispatcher screenDispatcher;
	
	@Override
	public void create () {

		batch = new SpriteBatch();
		screenDispatcher = new ScreenDispatcher();
        Screen splashScreen = new SplashScreen(batch, screenDispatcher);
        ((ScreenDispatcher)screenDispatcher).AddScreen(splashScreen);

		setScreen(splashScreen);

		batch = new SpriteBatch();

	}

	@Override
	public void render () {
        float r = 0/255f;
        float g = 24f/255f;
        float b = 72f/255f;
        Gdx.gl.glClearColor(r, g, b, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		Screen nextScreen = screenDispatcher.getNextScreen();
		if(nextScreen != getScreen()){
			setScreen(nextScreen);
		}

		super.render();
	}
}
