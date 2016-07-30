package id.gits.mvptodo;

import id.gits.mvp_core.configure.BaseConfigure;

/**
 * Created by gitsindonesia on 7/30/16.
 */
public class MVPApplication extends BaseConfigure {

    public static MVPApplication newInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        newInstance = new MVPApplication();
    }

    public void configMain(MainActivity activity){
        MainModel model = new MainModel();
        MainPresent present = new MainPresent(model);
        activity.input = present;
        present.output = activity;
        model.output = activity;
    }

}
