package com.danikula.videocache;

import android.util.Log;

public class LOG {

    private static int enableLevel;  //0 - not enabled, 1 - debug, 2 - info, 3 - warn, 4 - error

    public static void setEnableLevel(int level) {
        enableLevel = level;
    }

    public static void debug(String tag, String msg) {
        if (enableLevel < 1)
            return;
        Log.d(tag, msg);
    }

    public static void debug(String tag, String msg, Throwable t) {
        if (enableLevel < 1)
            return;
        Log.d(tag, msg, t);
    }

    public static void info(String tag, String msg) {
        if (enableLevel < 2)
            return;
        Log.i(tag, msg);
    }

    public static void info(String tag, String msg, Throwable t) {
        if (enableLevel < 2)
            return;
        Log.i(tag, msg, t);
    }

    public static void warn(String tag, String msg) {
        if (enableLevel < 3)
            return;
        Log.w(tag, msg);
    }

    public static void warn(String tag, String msg, Throwable t) {
        if (enableLevel < 3)
            return;
        Log.w(tag, msg, t);
    }

    public static void error(String tag, String msg) {
        if (enableLevel < 4)
            return;
        Log.e(tag, msg);
    }

    public static void error(String tag, String msg, Throwable t) {
        if (enableLevel < 4)
            return;
        Log.e(tag, msg, t);
    }

}
