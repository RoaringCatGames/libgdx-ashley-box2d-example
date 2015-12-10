package com.roaringcatgames.testgame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BrownieBouncer extends Game {
	private SpriteBatch batch;

	private ScreenDispatcher screenDispatcher;

    public AssetManager am;

	@Override
	public void create () {
        am = Assets.load();
		batch = new SpriteBatch();
		screenDispatcher = new ScreenDispatcher();
        Screen splashScreen = new SplashScreen(batch, screenDispatcher);
        Screen gameScreen = new GameScreen(batch, screenDispatcher);
        screenDispatcher.AddScreen(splashScreen);
        screenDispatcher.AddScreen(gameScreen);
		setScreen(splashScreen);
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
