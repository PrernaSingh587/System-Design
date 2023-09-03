package com.company.observable;

import com.company.observer.MainObserverInf;

import java.util.ArrayList;
import java.util.List;

public class WeatherObservable implements WeatherInterface{

    int temp;
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
    public void setTemp(int temp) {
        this.temp = temp;
        notify_();
    }
}
