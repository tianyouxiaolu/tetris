package com.example.orthogonalcameratest;

import android.util.Log;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

public class Game implements ApplicationListener {
	private Texture texture;
	private Label label;
	private float mStateTime;
	private float mCurrentTime;
	private SpriteBatch spriteBatch;

	@Override
	public void create() {
		// TODO Auto-generated method stub
		LabelStyle labelStyle = new LabelStyle();
		labelStyle.fontColor=new Color(1,0.5f,1,1);
		label = new Label("-", labelStyle);
		
		spriteBatch = new SpriteBatch();

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		mStateTime += Gdx.graphics.getDeltaTime();
		Gdx.gl20.glClearColor(1, 1, 1, 1);
		Gdx.gl20.glClear(GL10.GL_COLOR_BUFFER_BIT);
		spriteBatch.begin();
		
		label.draw(spriteBatch, 1);
		spriteBatch.end();

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
