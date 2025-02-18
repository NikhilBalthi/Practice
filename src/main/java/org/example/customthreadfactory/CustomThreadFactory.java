package org.example.customthreadfactory;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {

    private final String baseName;
    private int threadCount = 0;

    public CustomThreadFactory(String baseName){
        this.baseName = baseName;
    }

    @Override
    public Thread newThread(Runnable r) {
        threadCount++;
        Thread thread = new Thread(r,baseName+ " thred name "+threadCount);
        return thread;
    }
}
