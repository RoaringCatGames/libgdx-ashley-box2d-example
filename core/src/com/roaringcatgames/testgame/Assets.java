package com.roaringcatgames.testgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

/**
 * Created by barry on 12/9/15 @ 11:17 PM.
 */
public class Assets {

    public static AssetManager am;

    public static AssetManager load(){

        loadSplash();

        am = new AssetManager();
        am.load(ANI_ATLAS, TEXTURE_ATLAS);
//        am.load(SPRITE_ATLAS, TEXTURE_ATLAS);
//        am.load(FONT, BITMAP_FONT);

        return am;
    }

    public static Array<TextureAtlas.AtlasRegion> getPuffinArray(){
        return am.get(ANI_ATLAS, TEXTURE_ATLAS).findRegions("puffin/puffin");
    }
    public static Array<TextureAtlas.AtlasRegion> getPuffinRunArray(){
        return am.get(ANI_ATLAS, TEXTURE_ATLAS).findRegions("puffin/runnin");
    }

    private static void loadSplash(){
        splashScreen = new TextureRegion(new Texture("badlogic.jpg"));
    }

    private static Class<TextureAtlas> TEXTURE_ATLAS = TextureAtlas.class;
    private static Class<Music> MUSIC = Music.class;
    private static Class<BitmapFont> BITMAP_FONT = BitmapFont.class;
    private static Class<Sound> SOUND = Sound.class;

    private static final String FONT = "fonts/courier-new-bold-32.fnt";
    private static final String ANI_ATLAS = "animations/animations.atlas";
    private static final String SPRITE_ATLAS = "sprites/sprites.atlas";


    public static TextureRegion splashScreen;
}
