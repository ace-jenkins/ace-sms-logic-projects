package ace.sms.logic.api.web.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Caspar
 * @contract 279397942@qq.com
 * @create 2020/1/3 15:21
 * @description
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SmsLogicApiWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmsLogicApiWebApplication.class, args);
    }
}
