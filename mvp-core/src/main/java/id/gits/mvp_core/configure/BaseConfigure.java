package id.gits.mvp_core.configure;

import android.app.Application;

/**
 * Created by gitsindonesia on 7/30/16.
 */
public class BaseConfigure extends Application {
    public static BaseConfigure newinstance = null;
    public BaseConfigure() {
        newinstance = new BaseConfigure();
    }
}
