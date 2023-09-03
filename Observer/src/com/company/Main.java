package com.company;

import com.company.observable.MainObservablentf;
import com.company.observable.WeatherInterface;
import com.company.observable.WeatherObservable;
import com.company.observer.Email;
import com.company.observer.MainObserverInf;
import com.company.observer.Text;

public class Main {

    public static void main(String[] args) {
	 System.out.println("Hi this is Prerna");
        WeatherInterface mainObservablentf = new WeatherObservable();
        MainObserverInf mainObserverInf = new Email("prerna.singh");
        MainObserverInf mainObserverInf1 = new Email("aditya");
        MainObserverInf mainObserverInf2 = new Text(9053);

        mainObservablentf.add(mainObserverInf);
        mainObservablentf.add(mainObserverInf1);
        mainObservablentf.add(mainObserverInf2);

        mainObservablentf.setTemp(56);
        mainObservablentf.setTemp(516);

    }
}
