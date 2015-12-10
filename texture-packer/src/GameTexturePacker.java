
import com.badlogic.gdx.tools.texturepacker.TexturePacker.Settings;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class GameTexturePacker {
    //private static final String INPUT_DIR = Gdx.files.internal("assets/data/animations").toString();
    private static final String INPUT_DIR = "animations/";
    private static final String OUTPUT_DIR = "../android/assets/animations/";
    private static final String PACK_FILE = "animations";

    private static final String LOADING_INPUT_DIR = "loading/";
    private static final String LOADING_OUTPUT_DIR = "../android/assets/animations/";
    private static final String LOADING_PACK_FILE = "loading";

    private static final String SPRITES_INPUT_DIR = "sprites/";
    private static final String SPRITES_OUTPUT_DIR = "../android/assets/sprites/";
    private static final String SPRITES_PACK_FILE = "sprites";

    private static final float[] HUNDRED_PERCENT = new float[] {1f};
    private static final float[] FIFTY_PERCENT = new float[] {0.5f};

    public static void main(String[] args){
        // create the packing's settings
        Settings settings = new Settings();

        // adjust the padding settings
        settings.scale = HUNDRED_PERCENT;//FIFTY_PERCENT;
        settings.paddingX = 2;
        settings.paddingY = 2;
        settings.edgePadding = false;
        settings.maxWidth = 2048;//4096;
        settings.maxHeight = 2048;//4096;

        // pack the images
        settings.combineSubdirectories = true;
        TexturePacker.process(settings, INPUT_DIR, OUTPUT_DIR, PACK_FILE);

        settings.combineSubdirectories = true;
        TexturePacker.process(settings, SPRITES_INPUT_DIR, SPRITES_OUTPUT_DIR, SPRITES_PACK_FILE);

        settings.combineSubdirectories = false;
        //settings.scale = HUNDRED_PERCENT;
        TexturePacker.process(settings, LOADING_INPUT_DIR, LOADING_OUTPUT_DIR, LOADING_PACK_FILE);
    }
}


