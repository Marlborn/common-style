package dev.majes.base.mvp;

import android.os.Bundle;
import android.view.View;

import dev.majes.base.rxbus.IRxMsg;

/**
 * @author majes
 * @date 12/11/17.
 */

public interface IView<P> {
    void bindUI(View rootView);

    void initData(Bundle savedInstanceState);

    int getLayoutId();
    
    boolean useRxBus();

    void onRxBusMsg(IRxMsg iRxMsg);

    P getP();
}