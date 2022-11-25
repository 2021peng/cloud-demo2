package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.user.config
 * @Classname: PatternPropertiers
 * @Author: admin
 * @Date: 2022/11/24 17:06
 * @Description:
 */


@Data
@Component
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {
    private String dateformat;
    private String envSharedValue;
    private String name;
}
