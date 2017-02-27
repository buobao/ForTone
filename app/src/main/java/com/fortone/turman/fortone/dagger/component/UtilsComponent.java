package com.fortone.turman.fortone.dagger.component;

import com.fortone.turman.fortone.Utils;
import com.fortone.turman.fortone.dagger.module.UtilsModule;
import com.fortone.turman.fortone.view.MainActivityView;

import dagger.Component;

/**
 * Created by diaoqf on 2017/2/27.
 */
@Component(modules = UtilsModule.class)
public interface UtilsComponent {
    void inject(MainActivityView view);

    Utils provideUtils();
}
