package com.roaringcatgames.testgame;

import com.badlogic.gdx.Screen;

import java.util.ArrayList;

/**
 * Created by barry on 12/8/15 @ 8:14 PM.
 */
public class ScreenDispatcher implements IScreenDispatcher {

    public ArrayList<Screen> screens;
    private boolean isCurrenScreenEnded = false;
    private int currentIndex = 0;

    ScreenDispatcher(){
        screens = new ArrayList<>();
    }

    public void AddScreen(Screen screen){
        screens.add(screen);
    }


    @Override
    public void endCurrentScreen() {
        isCurrenScreenEnded = true;
    }

    @Override
    public Screen getNextScreen() {
        if(isCurrenScreenEnded){
            isCurrenScreenEnded = false;
            //Do logic to pick the next screen
            currentIndex++;
        }

        if(screens.size() > currentIndex + 1){
            return screens.get(currentIndex);
        }else{
            return screens.get(0);
        }
    }
}
