package com.fortone.turman.fortone;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by diaoqf on 2017/2/22.
 */
@Module
public class UtilsModule {

    public UtilsModule(){}

    @Provides
    Utils provideUtils(Context context) {
        return new Utils(context);
    }

}
