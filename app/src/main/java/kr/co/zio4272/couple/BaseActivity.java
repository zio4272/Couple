package kr.co.zio4272.couple;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by the on 2017-11-03.
 */

public abstract class BaseActivity extends AppCompatActivity {

    Context mContext = this;

    public abstract void setupEvent();

    public abstract void setValues();

    public abstract void bindView();


}
