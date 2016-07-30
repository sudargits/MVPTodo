package id.gits.mvp_core.present;

import id.gits.mvp_core.model.BaseModel;

/**
 * Created by gitsindonesia on 7/30/16.
 */
public abstract class BasePresent<T extends BaseModel> {
    public T model;

    public BasePresent(T model) {
        this.model = model;
    }
}
