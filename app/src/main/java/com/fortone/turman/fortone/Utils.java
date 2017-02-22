package com.fortone.turman.fortone;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by diaoqf on 2017/2/22.
 */

public class Utils {

    private Context mContext;

    @Inject
    public Utils(Context context) {
        mContext = context;
    }

    public void showMsg(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
    }

}
