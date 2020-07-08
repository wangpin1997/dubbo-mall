package cn.wpin.mall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 基于dubbo配置中心
 * @author wangpin
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.wpin.mall.order")
@EnableFeignClients(value = "cn.wpin.mall.client")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
