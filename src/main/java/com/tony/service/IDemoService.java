package com.tony.service;

import java.util.concurrent.CompletableFuture;

public interface IDemoService {

  String sayHello(String name);

  default CompletableFuture<String> sayHelloAsync(String name) {
    return CompletableFuture.completedFuture(sayHello(name));
  }

}
