package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class MenuScreen implements Screen {
    MyGdxGame game;
    Texture texture;
    Music music;
    private SpriteBatch batch;
    private Skin skin;
    private Stage stage;

    public MenuScreen(MyGdxGame game){
        this.game = game;
    }
    public void create() {
        batch = new SpriteBatch();
        texture = new Texture(Gdx.files.internal("背景图.png"));
        skin = new Skin(Gdx.files.internal("gui/uiskin.json"));
        stage = new Stage();
        TextButton playbutton = new TextButton("PLAY", skin, "default");
        playbutton.setWidth(60f);
        playbutton.setHeight(40f);
        playbutton.setPosition(Gdx.graphics.getWidth() /2-30, Gdx.graphics.getHeight()/2 - 100);
        stage.addActor(playbutton);
        Gdx.input.setInputProcessor(stage);
        Gdx.app.log("MenuScreen: ","menuScreen create");
    }
    public void render(float f) {
        Gdx.app.log("MenuScreen: ","menuScreen render");
        Gdx.app.log("MenuScreen: ","About to call gameScreen");
        Gdx.app.log("MenuScreen: ","gameScreen started");
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        if (Gdx.input.isTouched()){
            game.setScreen(MyGdxGame.gameScreen);
        }
        stage.draw();
        batch.end();

    }
    @Override
    public void dispose() { }
    @Override
    public void resize(int width, int height) { }
    @Override
    public void pause() { }
    @Override
    public void resume() { }
    @Override
    public void show() {
        Gdx.app.log("MenuScreen: ","menuScreen show called");
        create();
    }
    @Override
    public void hide() {
        Gdx.app.log("MenuScreen: ","menuScreen hide called");
    }
}
