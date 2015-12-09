package com.roaringcatgames.testgame.components;

import com.badlogic.ashley.core.Component;

/**
 * Created by barry on 12/8/15 @ 8:30 PM.
 */
public class StateComponent implements Component {
    private String state = "DEFAULT";
    public float time = 0.0f;
    public boolean isLooping = false;

    public void set(String newState){
        state = newState;
        time = 0.0f;
    }

    public String get(){
        return state;
    }
}