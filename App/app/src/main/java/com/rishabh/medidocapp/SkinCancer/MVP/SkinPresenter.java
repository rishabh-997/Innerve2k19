package com.rishabh.medidocapp.SkinCancer.MVP;

public class SkinPresenter implements SkinContract.presenter
{
    SkinContract.view mvpview;

    public SkinPresenter(SkinContract.view mvpview) {
        this.mvpview = mvpview;
    }
}
