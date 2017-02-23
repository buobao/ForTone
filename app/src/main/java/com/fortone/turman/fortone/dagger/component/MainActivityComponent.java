package com.fortone.turman.fortone.dagger.component;

import com.fortone.turman.fortone.dagger.module.MainActivityModule;
import com.fortone.turman.fortone.view.MainActivityView;

import dagger.Component;

/**
 * Created by diaoqf on 2017/2/23.
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivityView view);
}
