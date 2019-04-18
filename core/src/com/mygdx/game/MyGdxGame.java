package com.mygdx.game;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;

public class MyGdxGame extends Game implements ApplicationListener {

	public static MenuScreen menuScreen;
	public static GameScreen gameScreen;
	Music music;
	@Override
	public void create() {
		music = Gdx.audio.newMusic(Gdx.files.internal("bgm.mp3"));
		music.setLooping(true);
		music.setVolume(1);
		music.play();
		Gdx.app.log("MyGdxGame: "," create");
		menuScreen = new MenuScreen(this);
		gameScreen = new GameScreen(this);
		Gdx.app.log("MyGdxGame: ","about to change screen to menuScreen");
// Change screens to the menu
		setScreen(menuScreen);
		Gdx.app.log("MyGdxGame: ","changed screen to menuScreen");
	}
	@Override
	public void dispose() {super.dispose();}
	@Override

	public void render() {super.render();}
	@Override
	public void resize(int width, int height) { super.resize(width, height);}
	@Override
	public void pause() {
		super.pause();
	}
	@Override
	public void resume() {
		super.resume();
	}
}