package com.epam.bcg.barcodebooking.desktop;

import com.epam.bcg.barcodebooking.shared.SomeExchangeApi;

public class Application {

    public static void main(String ... args) {
        System.out.println("access from desktop:" + new SomeExchangeApi().connect());
    }
}
