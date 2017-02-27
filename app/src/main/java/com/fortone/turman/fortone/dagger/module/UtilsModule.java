package com.fortone.turman.fortone.dagger.module;

import com.fortone.turman.fortone.Utils;

import dagger.Module;
import dagger.Provides;

/**
 * Created by diaoqf on 2017/2/27.
 */
@Module
public class UtilsModule {

    @Provides
    Utils providerUtils(){
        return new Utils();
    }

}
