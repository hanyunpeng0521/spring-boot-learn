package com.hyp.learn.qs.controller;


import com.hyp.learn.qs.conf.DubboConfig;
import com.hyp.learn.qs.conf.DefinitionConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ConfController {
	
	@Resource
	DefinitionConfig conf;
	
	@Resource
    DubboConfig dubbo;
	
	/**
	 * 测试自定义配置属性加载
	 * @return
	 */
	@RequestMapping("/conf")
	public String getConfig() {
		System.out.println(conf.toString());
		return conf.toString();
	}
	
	/**
	 * 测试自定义的额外文件的配置信息
	 * @return
	 */
	@RequestMapping("/dubbo")
	public String dubboConfig() {
		System.out.println(dubbo.toString());
		return dubbo.toString();
	}
}
