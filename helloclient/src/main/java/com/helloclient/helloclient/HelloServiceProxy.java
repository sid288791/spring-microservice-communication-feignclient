package com.helloclient.helloclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="hello-service" )
public interface HelloServiceProxy {
	
	   @RequestMapping("/rest/hello/server")
	   public String gethello();
	   

}
