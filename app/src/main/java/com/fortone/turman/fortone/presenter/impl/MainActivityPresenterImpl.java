package com.fortone.turman.fortone.presenter.impl;

import com.fortone.turman.fortone.presenter.MainActivityPresenter;
import com.fortone.turman.fortone.view.MainActivityView;
import com.fortone.turman.fortone.model.UserModel;
import com.fortone.turman.fortone.model.impl.UserModelImpl;

import javax.inject.Inject;

/**
 * Created by diaoqf on 2017/2/23.
 */

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityView view;
    private UserModel model;

    @Inject
    public MainActivityPresenterImpl(MainActivityView view) {
        this.view = view;
        this.model = new UserModelImpl();
    }

    @Override
    public void getState(int type) {
        String state = model.getState(type);
        view.showMsg(state);
    }
}
