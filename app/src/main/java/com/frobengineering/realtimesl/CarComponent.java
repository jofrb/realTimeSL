package com.frobengineering.realtimesl;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    void Inject(MainActivity mainActivity);

}
