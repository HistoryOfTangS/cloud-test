package com.tangyinzi.cloudtestuser.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tangyinzi")
public class RedisConfig {
    //@Bean
    //public RedisConnectionFactory redisConnectionFactory() {
    //    JedisPoolConfig poolConfig = new JedisPoolConfig();
    //    poolConfig.setMaxTotal(5);
    //    poolConfig.setTestOnBorrow(true);
    //    poolConfig.setTestOnReturn(true);
//
    //    JedisConnectionFactory connectionFactory = new JedisConnectionFactory(poolConfig);
    //    connectionFactory.setUsePool(true);
    //    connectionFactory.setHostName("localhost");
    //    connectionFactory.setPort(6379);
//
    //    return connectionFactory;
    //}
    //@Bean
    //public RedisTemplate<String, Object> redisTemplate() {
    //    RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
    //    redisTemplate.setConnectionFactory(redisConnectionFactory());
    //    redisTemplate.setEnableTransactionSupport(true);
    //    return redisTemplate;
    //}


    //@Bean
    //public StringRedisTemplate stringRedisTemplate() {
    //    StringRedisTemplate stringRedisTemplate = new StringRedisTemplate(redisConnectionFactory());
    //    stringRedisTemplate.setEnableTransactionSupport(true);
    //    return stringRedisTemplate;
    //}

    //@Bean
    //public RedisTemplate<String, Object> redisTemplate() {
    //    RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
    //    redisTemplate.setConnectionFactory(redisConnectionFactory());
    //    redisTemplate.setEnableTransactionSupport(true);
    //    //StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
    //    GenericToStringSerializer<String> genericToStringSerializer = new GenericToStringSerializer<>(String.class);
    //    redisTemplate.setValueSerializer(genericToStringSerializer);
    //    redisTemplate.afterPropertiesSet();
    //    return redisTemplate;
    //}

    /*txManager*/
    /*@Bean
    public DataSourceTransactionManager dataSourceTransactionManager(@Autowired DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }*/
}
