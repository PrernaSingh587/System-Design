package com.company.observable;

import com.company.observer.MainObserverInf;

import java.util.ArrayList;
import java.util.List;

public class StockObservable implements StockInterface{

    int stockPrice;
    List<MainObserverInf> mainObserverInfList = new ArrayList<>();
    @Override
    public void add(MainObserverInf mainObserverInf) {
        mainObserverInfList.add(mainObserverInf);
    }

    @Override
    public void notify_() {
        for(MainObserverInf mainObserverInf : mainObserverInfList) {
            mainObserverInf.show();
        }
    }

    @Override
    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
        notify_();
    }
}
