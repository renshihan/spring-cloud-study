package com.renshihan.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RefreshScope指示Config客户端在服务器参数刷新时，也刷新注入的属性值，
@RefreshScope
public class MySampleRestController {
    @Value("${my-config.appName}")
    private String appName;
    @RequestMapping("/app-name")
    public String getAppName(){
        return appName;
    }
}
