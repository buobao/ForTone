package com.fortone.turman.fortone.model.impl;

import com.fortone.turman.fortone.model.UserModel;

/**
 * Created by diaoqf on 2017/2/23.
 */

public class UserModelImpl implements UserModel {
    @Override
    public String getState(int type) {
        return type > 0 ? "working":"offline" ;
    }
}
