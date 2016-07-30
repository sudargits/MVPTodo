package id.gits.mvptodo;

import id.gits.mvp_core.model.BaseModel;

/**
 * Created by gitsindonesia on 7/30/16.
 */
public class MainModel extends BaseModel {

    public String getNameApps(boolean isResult){
        if (isResult) {
            return "MVP";
        }else {
            output.onError("NOT MVP",null);
            return "NOT MVP";
        }
    }
}
