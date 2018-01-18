package example.com.logutil;

import android.util.Log;

/**
 * Created by mnwani on 1/17/18.
 */

public class LogDebug {
    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
