package com.square.actors;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.physics.box2d.Body;
import com.square.figure2d.WallUserData;

import static com.square.utils.Resources.WALL_STATIC;

public class Wall extends GameActor {

    public Wall(Body body, OrthographicCamera camera) {
        super(body);
        this.camera = camera;

        texture = new Texture(WALL_STATIC);
    }

    @Override
    public WallUserData getUserData() {
        return (WallUserData) userData;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);

        batch.draw(
                texture,
                screenRectangle.x,
                screenRectangle.y,
                screenRectangle.width,
                screenRectangle.height);
    }
}