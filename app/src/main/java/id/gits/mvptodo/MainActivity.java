package id.gits.mvptodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import id.gits.mvp_core.activity.BaseActivity;

public class MainActivity extends BaseActivity implements MainResponse {
    public MainRequest input;

    @Override
    protected void onStart() {
        super.onStart();
        MVPApplication.newInstance.configMain(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {

    }

    @Override
    public void onError(String error, Object object) {
        Log.e("this error",error);
    }

    @Override
    public void displayNameApps(String nameApps) {
        Log.d("this apps",nameApps);
    }
}
