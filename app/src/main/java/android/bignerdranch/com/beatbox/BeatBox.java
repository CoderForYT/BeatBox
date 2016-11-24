package android.bignerdranch.com.beatbox;

import android.content.Context;
import android.content.res.AssetManager;

/**
 * Created by zkhk on 2016/11/24.
 */

public class BeatBox {

    private static final String TAG = "BeatBox";
    private static final String SOUNDS_FOLDER = "sample_sounds";
    private AssetManager mAssets;

    public BeatBox(Context context) {
        mAssets = context.getAssets();
    }
}
