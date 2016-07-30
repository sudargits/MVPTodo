package id.gits.mvptodo;

import id.gits.mvp_core.present.BasePresent;
import id.gits.mvp_core.request.BaseRequest;
import id.gits.mvp_core.response.BaseResponse;

/**
 * Created by gitsindonesia on 7/30/16.
 */

interface MainRequest extends BaseRequest{
    void doPrintNameApps(boolean isMVP);
}
interface MainResponse extends BaseResponse{
    void displayNameApps(String nameApps);
}
public class MainPresent extends BasePresent<MainModel> implements MainRequest{
    public MainResponse output;

    public MainPresent(MainModel model) {
        super(model);
    }

    @Override
    public void doSomething(Object object) {

    }

    /**
     * TODO As a <type of process>, I want <some process> so that <some return process>.
     * @param isMVP
     */
    @Override
    public void doPrintNameApps(boolean isMVP) {
        output.displayNameApps(model.getNameApps(isMVP));
    }
}
