package com.mooc.house.filter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterBeanConfig {
  
	/**
	 * 1.构造filter
	 * 2.配置拦截urlpattern
	 * 3.利用FilterRegistrationBean进行封装
	 * @return
	 * */
	@Bean
	public FilterRegistrationBean<LogFilter> logFilter() {
		FilterRegistrationBean<LogFilter> filterRegistrationBean = new FilterRegistrationBean<LogFilter>();
		filterRegistrationBean.setFilter(new LogFilter());
		List<String>urList = new ArrayList<String>();
		urList.add("*");
		filterRegistrationBean.setUrlPatterns(urList);
		return filterRegistrationBean;
	}
}
