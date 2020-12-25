package com.savchenko.homeworks.hometask20;

import lombok.Getter;
@Getter
public class Fork {

    private boolean taken = false;

    public synchronized
    void take() throws InterruptedException {
        while (taken) {
            wait();
        }
        taken = true;
    }

    public synchronized void put() {
        taken = false;
        notifyAll();
    }
}