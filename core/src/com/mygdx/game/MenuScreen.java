package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;


public class MenuScreen implements Screen {
    Stage stage;
    Skin skin;

    Texture texture;
    SpriteBatch batch;

    MyGdxGame game;

    public MenuScreen(MyGdxGame game){

        this.game = game;
    }

    public void create() {
     
    }

    public void render(float arg0) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        batch.draw(texture, 0, 0);

        batch.end();


        stage.act();
        stage.draw();
    }
    @Override
    public void dispose() { }
    @Override
    public void resize(int arg0, int arg1) { }
    @Override
    public void pause() { }
    @Override
    public void resume() { }
    @Override
    public void show() {
        stage = new Stage();
        texture = new Texture(Gdx.files.internal("bg.jpg"));
        batch = new SpriteBatch();

        stage.addListener(new ClickListener(){
            @Override
            public boolean touchDown(InputEvent event, float x, float y,
                                     int pointer, int button) {

                game.setScreen(game.gameScreen);

                return true;
            }
        });

        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void hide(){ }
}
