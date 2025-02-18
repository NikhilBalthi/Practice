package org.example.customthreadfactory;

import java.util.concurrent.TimeUnit;

public class FirstTechnique {
    public static void main(String[] args) {
        new FirstTask();
    }
}

class FirstTask extends Thread {
    @Override
    public void run() {
        for(int i=10;i>0;i--){
            System.out.println("TICK TICK "+i);
            try {
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public FirstTask(){
        this.start();
    }
}