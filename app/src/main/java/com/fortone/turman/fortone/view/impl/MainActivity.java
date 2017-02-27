package com.fortone.turman.fortone.view.impl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.fortone.turman.fortone.R;
import com.fortone.turman.fortone.dagger.component.DaggerMainActivityComponent;
import com.fortone.turman.fortone.dagger.component.MainActivityComponent;
import com.fortone.turman.fortone.dagger.module.MainActivityModule;
import com.fortone.turman.fortone.presenter.MainActivityPresenter;
import com.fortone.turman.fortone.view.MainActivityView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    @BindView(R.id.text)
    TextView textView;

    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        MainActivityComponent component = DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule(this))
                .build();
        component.inject(this);

        textView.setOnClickListener(v->presenter.getState(1));
    }

    @Override
    public void showMsg(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
