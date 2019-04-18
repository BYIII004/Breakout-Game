package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

public class MyGdxGame extends Game {
	MenuScreen menuScreen;
	GameScreen gameScreen;
	Music music;

	@Override
	public void create() {
		music = Gdx.audio.newMusic(Gdx.files.internal("bgm.mp3"));
		music.play();
		music.setLooping(true);
		music.setVolume(1);


		menuScreen = new MenuScreen(this);
		gameScreen = new GameScreen(this);
		this.setScreen(menuScreen);
	}

	@Override

	public void render() {
		super.render();
	}

}