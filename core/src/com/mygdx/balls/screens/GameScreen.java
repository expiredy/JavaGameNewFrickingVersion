package com.mygdx.balls.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.balls.BallsGameClass;
import com.mygdx.balls.constants.ViewConstants;
import com.mygdx.balls.layers.HeadUpDisplay;

public class GameScreen implements Screen {

    private final BallsGameClass gameSession;
    private final OrthographicCamera gameCamera;
    private final Viewport gameVeiwport;
    private final HeadUpDisplay PlayerHud;

    public GameScreen(BallsGameClass gameSession){
        this.gameSession = gameSession;
//        this.sceneObjectsInitialization();
        this.gameCamera = new OrthographicCamera();
        this.gameVeiwport = new FitViewport(ViewConstants.VIRTUAL_WIDTH,
                ViewConstants.VIRTUAL_HEIGHT, gameCamera);
        PlayerHud = new HeadUpDisplay(gameSession.batch);
    }

//    private void sceneObjectsInitialization() {
//
//
//    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        gameSession.batch.setProjectionMatrix(PlayerHud.gameStage.getCamera().combined);
        PlayerHud.gameStage.draw();

//        gameSession.batch.begin();
//
//        gameSession.batch.end();
    }

    @Override
    public void resize(int width, int height) {
        gameVeiwport.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
