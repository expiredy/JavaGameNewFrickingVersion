package com.mygdx.balls.layers;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.balls.constants.ViewConstants;

public class HeadUpDisplay {

    private final static Integer PadCellNumber = 10;

    public Stage gameStage;
    private Viewport gameVeiwport;

    private int timer = 0;

    Label playSessionTimerLabel;

    public HeadUpDisplay(SpriteBatch spriteBatch){

        gameVeiwport = new FitViewport(ViewConstants.VIRTUAL_WIDTH, ViewConstants.VIRTUAL_HEIGHT,
                new OrthographicCamera());

        gameStage = new Stage(gameVeiwport, spriteBatch);

        Table table = new Table();
        table.top();
        table.setFillParent(true);
        this.informativeHudInitialization();
        table.add(playSessionTimerLabel).expandX().padTop(PadCellNumber);
    }

    private void informativeHudInitialization(){
        playSessionTimerLabel = new Label(String.format("%03d", timer), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
    }

}
