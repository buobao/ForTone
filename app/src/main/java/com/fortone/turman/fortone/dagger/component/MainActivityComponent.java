package com.fortone.turman.fortone.dagger.component;

import com.fortone.turman.fortone.dagger.module.MainActivityModule;
import com.fortone.turman.fortone.presenter.MainActivityPresenter;
import com.fortone.turman.fortone.view.MainActivityView;
import com.fortone.turman.fortone.view.impl.MainActivity;

import dagger.Component;

/**
 * Created by diaoqf on 2017/2/23.
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity view);          //这里不支持接口
}
