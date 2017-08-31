package fengxue.setting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by fengxue on 01/08/2017.
 */

public class ScreenReceiver extends BroadcastReceiver {
    private static final String TAG = "ScreenReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.d(TAG, "Receive the broadcast message");

        if (action.equals(Intent.ACTION_SCREEN_ON)) {
            Log.d(TAG, "Receive the screen on message");
            Intent mIntent = new Intent(context, FullscreenActivity.class);
            mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(mIntent);
        }
    }
}