package info7255.JsonSchema;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Arrays;

@SpringBootApplication
public class JsonSchemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonSchemaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			System.out.println("inspect spring boot here");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}

	@Bean
	JedisConnectionFactory jedisConnectionFactory(){
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
		jedisConnectionFactory.setHostName("127.0.0.1");
		jedisConnectionFactory.setPort(6379);
		return jedisConnectionFactory;
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate(){
		RedisTemplate<String, Object> tmplate = new RedisTemplate<>();
		tmplate.setConnectionFactory(jedisConnectionFactory());
		return tmplate;
	}
}
