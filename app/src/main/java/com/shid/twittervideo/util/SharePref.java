package com.shid.twittervideo.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SharePref {

    private SharedPreferences mySharePref;

    public SharePref(Context context) {
        mySharePref = context.getSharedPreferences("filename", Context.MODE_PRIVATE);
    }

    public void setNightMode(Boolean state) {
        SharedPreferences.Editor editor = mySharePref.edit();
        editor.putBoolean("NightMode", state);
        editor.apply();
    }

    public Boolean loadNightMode() {
        Boolean state = mySharePref.getBoolean("NightMode", false);
        return state;
    }
}
