package cn.itcast.order.clients;

import cn.itcast.order.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @BelongsProject: cloud-demo
 * @BelongsPackage: cn.itcast.order.clients
 * @Classname: UserClient
 * @Author: admin
 * @Date: 2022/11/25 15:54
 * @Description:
 */

@FeignClient("userservice")
public interface UserClient {
    @GetMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);
}
