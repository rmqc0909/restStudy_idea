package com.github.rmqc.cxf;


import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.lifecycle.ResourceProvider;
import org.apache.cxf.jaxrs.lifecycle.SingletonResourceProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiedan11 on 2016/12/23.
 */
public class CxfServer {

    public static void main(String[] args) {
        List<Class<?>> resourceClassList = new ArrayList<Class<?>>();
        resourceClassList.add(RestTest.class);
        List<ResourceProvider> resourceProviderList = new ArrayList<ResourceProvider>();
        resourceProviderList.add(new SingletonResourceProvider(new RestTest()));
        // 发布 REST 服务
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
        factory.setAddress("http://localhost:11003/cxf-demo/recources");    //访问资源地址
        factory.setResourceClasses(resourceClassList);
        factory.setResourceProviders(resourceProviderList);
        factory.create();
        System.out.println("使用CXF发布REST服务成功");
    }
}
