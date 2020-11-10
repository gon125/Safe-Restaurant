package com.moappohjo.saferestaurant.ui.helper;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

public class Utils {
    public static String getJsonFromAssets(Context context, final String fileName) {
        String jsonString;
        try {
            InputStream is = context.getAssets().open(fileName);

            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();

            jsonString = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return jsonString;
    }
}
