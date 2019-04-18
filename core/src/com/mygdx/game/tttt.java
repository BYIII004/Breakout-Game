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
    MyGdxGame game; // Note it’s "MyGdxGame" not "Game"
    // constructor to keep a reference to the main Game class
    private SpriteBatch batch;
    private Skin skin;
    private Stage stage;
    private Texture texture;
    private Label label;


    public MenuScreen(MyGdxGame game){
        this.game = game;
    }
    public void create() {


        batch = new SpriteBatch();
        texture = new Texture(Gdx.files.internal("背景图.png"));
        skin = new Skin(Gdx.files.internal("gui/uiskin.json"));
        stage = new Stage(new StretchViewport(MyGdxGame.WORLD_WIDTH, MyGdxGame.WORLD_HEIGHT));

        label = new Label("B r e a k o u t", skin, "default");
        label.setPosition(Gdx.graphics.getWidth() /2 - 195f, Gdx.graphics.getHeight()/2 + 100f);
        label.setFontScale(2.5f);
        stage.addActor(label);

        texture = new Texture(Gdx.files.internal("背景图.png"));
        label = new Label("Help: Enter P to pause the game", skin, "default");
        label.setPosition(10, 20);
        label.setFontScale(1.5f);
        stage.addActor(label);


        TextButton playbutton = new TextButton("Play", skin, "default");
        playbutton.setWidth(150f);
        playbutton.setHeight(75f);
        playbutton.setPosition(Gdx.graphics.getWidth() /2 - 150f, Gdx.graphics.getHeight()/2 - 10f);
        stage.addActor(playbutton);
        playbutton.addListener(new ClickListener() {
            public void clicked(InputEvent event, float x, float y) {
                game.setScreen(new GameScreen(game));
            }
        });

        TextButton exitbutton = new TextButton("Exit", skin, "default");
        exitbutton.setWidth(150f);
        exitbutton.setHeight(75f);
        exitbutton.setPosition(Gdx.graphics.getWidth() /2 - 150f, Gdx.graphics.getHeight()/2 - 100f);
        stage.addActor(exitbutton);
        exitbutton.addListener(new ClickListener() {
            public void clicked(InputEvent event, float x, float y) {
                Gdx.app.exit();


