package tech.vincentury;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;

public class CompletionFutureTest {

    @Test
    public void thenApply(){
        CompletableFuture completableFuture =
        CompletableFuture
                //建造者模式
                .supplyAsync(()-> "Hello")
                .thenApply(s -> s +" world")
                //TODO Java8 新特性
                .thenApply(String::toUpperCase);

        System.out.println(completableFuture.join());

    }
}
