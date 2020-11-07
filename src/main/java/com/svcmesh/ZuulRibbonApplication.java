package com.svcmesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulRibbonApplication.class, args);
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
