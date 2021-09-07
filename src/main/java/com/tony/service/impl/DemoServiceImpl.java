package com.tony.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;

import com.tony.service.IDemoService;

@DubboService
public class DemoServiceImpl implements IDemoService {

  @Override
  public String sayHello(String name) {
    System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name
        + ", request from consumer: " + RpcContext.getServiceContext().getRemoteAddressString());
    return "Hello " + name + ", response from provider: " + RpcContext.getServiceContext().getLocalAddressString();
  }

}
