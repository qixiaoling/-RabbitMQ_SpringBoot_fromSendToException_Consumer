package xiaolingUseJava.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Jackson2JsonMessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

    /*@Bean
    MessageListenerContainer messageListenerContainer(ConnectionFactory connectionFactory){
        SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer();
        simpleMessageListenerContainer.setConnectionFactory(connectionFactory);
        simpleMessageListenerContainer.setQueues(queue());
        simpleMessageListenerContainer.setMessageListener(new RabbitMQListner());
        return simpleMessageListenerContainer;

    }*/
    /*@Bean
    //if you need a customize a connectionFactory, for example with different port and username and password,
    //customize this connectionFactory, and then put it in the MessagelistenerContainer bean.

    ConnectionFactory connectionFactory(){
        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory("localhost");
        cachingConnectionFactory.setUsername(username);
        cachingConnectionFactory.setPassword(password);
        return cachingConnectionFactory;
    }

    @Bean
    MessageListenerContainer messageListenerContainer(){
        SimpleMessageListenerContainer simpleMessageListenerContainer = new SimpleMessageListenerContainer();
        simpleMessageListenerContainer.setConnectionFactory(connectionFactory());
        simpleMessageListenerContainer.setQueues(queue());
        simpleMessageListenerContainer.setMessageListener(new RabbitMQListner());
        return simpleMessageListenerContainer;
    }*/

}
