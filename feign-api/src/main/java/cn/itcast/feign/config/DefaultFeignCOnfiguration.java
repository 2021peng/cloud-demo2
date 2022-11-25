package cn.itcast.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.order.config
 * @Classname: DefaultFeignCOnfiguration
 * @Author: admin
 * @Date: 2022/11/25 16:58
 * @Description:
 */

public class DefaultFeignCOnfiguration {
    @Bean
    public Logger.Level feignLogLevel(){
        return Logger.Level.BASIC;
    }
}
