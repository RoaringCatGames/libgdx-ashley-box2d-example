package com.roaringcatgames.testgame.components;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.utils.ArrayMap;

/**
 * Created by barry on 12/8/15 @ 8:30 PM.
 */
public class AnimationComponent implements Component {
    public ArrayMap<String, Animation> animations = new ArrayMap<String, Animation>();

}
