package cn.itcast.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.eureka
 * @Classname: EurekaApplication
 * @Author: admin
 * @Date: 2022/11/23 20:14
 * @Description:
 */

@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
