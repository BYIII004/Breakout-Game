package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;


public class GameScreen implements Screen{

    MyGdxGame game;

    SpriteBatch batch;
    Texture texture;

    Stage stage;
    Sprite sprite;

    Texture Bricks;
    TextureRegion blueB;
    TextureRegion greenB;
    TextureRegion redB;
    TextureRegion purpleB;
    TextureRegion board;
    TextureRegion ball;


    public GameScreen(MyGdxGame game){
        this.game = game;
    }

    public void create(){
        Bricks = new Texture(Gdx.files.internal("breakout_pieces.png"));
        blueB = new TextureRegion(Bricks, 8,8,32,16);
        greenB = new TextureRegion(Bricks, 8,28,32,16);
        redB = new TextureRegion(Bricks, 8,48,32,16);
        purpleB = new TextureRegion(Bricks, 8,68,32,16);
        board = new TextureRegion(Bricks, 48,4,64,16);
        ball = new TextureRegion(Bricks, 48,32,8,8);
        batch = new SpriteBatch();

        sprite = new Sprite();

        sprite.setRegion(board);//select board
        sprite.setSize(64, 18);//set size
        sprite.setPosition(468, 50);//set position

        sprite.setRegion(ball);//select board
        sprite.setSize(8, 88);//set size
        sprite.setPosition(496, 66);//set position

        sprite.setRegion(ball);//select board
        sprite.setSize(32, 16);//set size
        for (int i = 0; i < 20; i++) {
            
        }
        sprite.setPosition(496, 66);//set position
    }

    public void render(float arg0){
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        batch.draw(texture,0,0);

        batch.end();


        stage.act();
        stage.draw();
    }

    @Override
    public void dispose(){ }
    @Override
    public void resize(int arg0, int arg1) { }
    @Override
    public void pause() { }
    @Override
    public void resume() { }
    @Override
    public void show(){
       stage = new Stage();

        texture = new Texture(Gdx.files.internal("pg.jpg"));
       //batch.draw(texture, 10, 10);
        batch = new SpriteBatch();

        stage.addListener(new InputListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y,
                                     int pointer, int button) {

                game.setScreen(game.menuScreen);
                return true;
            }
        });

        Gdx.input.setInputProcessor(stage);
    }
    @Override
    public void hide(){}


}
