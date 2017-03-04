package com.fortone.turman.fortone.view.impl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.fortone.turman.fortone.R;
import com.fortone.turman.fortone.Utils;
import com.fortone.turman.fortone.dagger.component.DaggerMainActivityComponent;
import com.fortone.turman.fortone.dagger.component.DaggerUtilsComponent;
import com.fortone.turman.fortone.dagger.component.UtilsComponent;
import com.fortone.turman.fortone.dagger.module.MainActivityModule;
import com.fortone.turman.fortone.dagger.module.UtilsModule;
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
        //打标记后的代码
        DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule(this))
                .build().inject(this);

//        UtilsComponent component = DaggerUtilsComponent.builder().utilsModule(new UtilsModule()).build();
//        component.inject(this);
//        utils = component.provideUtils();

        textView.setOnClickListener(v->{
            presenter.getState(1);
//            utils.show(this, "hello");
        });
    }

    @Override
    public void showMsg(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
}
