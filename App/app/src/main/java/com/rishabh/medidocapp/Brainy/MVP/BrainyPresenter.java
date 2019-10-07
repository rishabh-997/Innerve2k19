package com.rishabh.medidocapp.Brainy.MVP;

public class BrainyPresenter implements BrainyContract.presenter
{
    BrainyContract.view mvpview;

    public BrainyPresenter(BrainyContract.view mvpview) {
        this.mvpview = mvpview;
    }
}
