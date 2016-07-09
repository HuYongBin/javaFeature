package com.hyb.code;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author YongBin Hu
 * @date 2016/7/9
 */
public class Scheduled implements Runnable{
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(9);
        Scheduled scheduled = new Scheduled();
        executor.scheduleWithFixedDelay(scheduled,0,1, TimeUnit.SECONDS);
        executor.scheduleWithFixedDelay(scheduled,0,1, TimeUnit.SECONDS);
        executor.scheduleWithFixedDelay(scheduled,0,1, TimeUnit.SECONDS);
        executor.scheduleWithFixedDelay(scheduled,0,1, TimeUnit.SECONDS);
        executor.scheduleWithFixedDelay(scheduled,0,1, TimeUnit.SECONDS);
        executor.scheduleWithFixedDelay(scheduled,0,1, TimeUnit.SECONDS);
        executor.scheduleWithFixedDelay(scheduled,0,1, TimeUnit.SECONDS);
        executor.scheduleWithFixedDelay(scheduled,0,1, TimeUnit.SECONDS);
        executor.scheduleWithFixedDelay(scheduled,0,1, TimeUnit.SECONDS);
    }


    private int count = 0;
    @Override
    public void run() {
        count=count + 2;
            System.out.println(count++);
    }
}
