package com.volk.views;

import com.badlogic.gdx.Screen;
import com.volk.Sweeper;

public class LoadingScreen implements Screen {

    private Sweeper game;

    public LoadingScreen(Sweeper sweeper) {
        Sweeper game = sweeper;
    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub

    }

    @Override
    public void hide() {
        // TODO Auto-generated method stub

    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub

    }

    @Override
    public void render(float delta) {
        game.changeScreen(Sweeper.MENU);
    }

    @Override
    public void resize(int width, int height) {
        // TODO Auto-generated method stub

    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub

    }

    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

}
