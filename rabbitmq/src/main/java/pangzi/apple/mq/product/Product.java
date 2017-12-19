package pangzi.apple.mq.product;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

@Component
public class Product {
	private Logger logger = LoggerFactory.getLogger(Product.class);

	@Resource
	private AmqpTemplate amqpTemplate;

	public void sendMessage(Object message) {
		logger.info("to send message:{}", message);
		amqpTemplate.convertAndSend("pangzitestkey", message);
	}
}
