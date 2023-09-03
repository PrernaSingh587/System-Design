package com.company;

import com.company.observable.*;
import com.company.observer.Email;
import com.company.observer.MainObserverInf;
import com.company.observer.Text;

public class Main {

    public static void main(String[] args) {
	 System.out.println("Observer Design Pattern");
        WeatherInterface weatherObservablentf = new WeatherObservable();
        MainObserverInf mainObserverInf = new Email("prerna.singh");
        MainObserverInf mainObserverInf1 = new Email("aditya");
        MainObserverInf mainObserverInf2 = new Text(9053);

        weatherObservablentf.add(mainObserverInf);
        weatherObservablentf.add(mainObserverInf1);
        weatherObservablentf.add(mainObserverInf2);

        weatherObservablentf.setTemp(56);
        weatherObservablentf.setTemp(516);

        StockInterface stockobservable = new StockObservable();
        stockobservable.add(mainObserverInf);
        stockobservable.add(mainObserverInf1);
        stockobservable.add(mainObserverInf2);

        stockobservable.setStockPrice(57);

    }
}
