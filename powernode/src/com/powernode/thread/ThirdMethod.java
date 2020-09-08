package com.powernode.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThirdMethod {
    public static void main(String[] args) {
        FutureTask<String> ft = new FutureTask(new MThread());
        Thread t = new Thread(ft);
        t.start();
        String result = null;
        try {
            result = ft.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }

}
class MThread implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "abc";
    }
}
