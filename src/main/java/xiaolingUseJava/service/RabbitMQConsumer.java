package xiaolingUseJava.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import xiaolingUseJava.exception.InvalidSalaryException;
import xiaolingUseJava.model.Employee;

@Component
public class RabbitMQConsumer {

    private static final Logger logger = LoggerFactory.getLogger(RabbitMQConsumer.class);

    @RabbitListener(queues = "normal.queue")
    public void receivedMessage(Employee employee) throws InvalidSalaryException {
        logger.info("Received Message From RabbitMQ: " + employee);
        if(employee.getSalary() < 0 ){
            throw new InvalidSalaryException();
        }
    }
}
