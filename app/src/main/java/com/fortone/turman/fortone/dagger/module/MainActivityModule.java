package com.fortone.turman.fortone.dagger.module;

import com.fortone.turman.fortone.presenter.MainActivityPresenter;
import com.fortone.turman.fortone.presenter.impl.MainActivityPresenterImpl;
import com.fortone.turman.fortone.view.MainActivityView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by diaoqf on 2017/2/23.
 */
@Module
public class MainActivityModule {
    private MainActivityView mView;

    public MainActivityModule(MainActivityView view) {
        mView = view;
    }

    @Provides
    MainActivityPresenter provideUserModel() {
        return new MainActivityPresenterImpl(mView);
    }
}
