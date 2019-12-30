package com.hyp.learn.r.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * maxInactiveIntervalInSeconds: 设置 Session 失效时间，使用 Redis Session 之后，原 Spring Boot 的 server.session.timeout 属性不再生效。
 *
 * @author hyp
 * Project name is spring-boot-learn
 * Include in com.hyp.learn.r.conf
 * hyp create at 19-12-24
 **/
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400 * 30)
public class SessionConfig {

    //如何在两台或者多台中共享 Session
    //其实就是按照上面的步骤在另一个项目中再次配置一次，启动后自动就进行了 Session 共享。
}
