package com.fortone.turman.fortone;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by diaoqf on 2017/2/27.
 */

public class Utils {
    public void show(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}
