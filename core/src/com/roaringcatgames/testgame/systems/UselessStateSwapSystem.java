package com.roaringcatgames.testgame.systems;

import com.badlogic.ashley.core.ComponentMapper;
import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.Family;
import com.badlogic.ashley.systems.IteratingSystem;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.utils.Array;
import com.roaringcatgames.testgame.components.PuffinComponent;
import com.roaringcatgames.testgame.components.StateComponent;

/**
 * Created by barry on 12/9/15 @ 11:47 PM.
 */
public class UselessStateSwapSystem extends IteratingSystem {

    private ComponentMapper<StateComponent> sm;

    private Array<Entity> stateQueue;

    public UselessStateSwapSystem(){
        super(Family.all(StateComponent.class, PuffinComponent.class).get());
        sm = ComponentMapper.getFor(StateComponent.class);
        stateQueue = new Array<>();
    }

    @Override
    public void update(float deltaTime) {
        super.update(deltaTime);
        if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
            for(Entity entity:stateQueue) {
                StateComponent state = sm.get(entity);
                if (state.get() == "DEFAULT") {
                    state.set("RUNNING");
                } else {
                    state.set("DEFAULT");
                }
            }
        }
        stateQueue.clear();
    }

    @Override
    protected void processEntity(Entity entity, float deltaTime) {
        stateQueue.add(entity);
    }
}
