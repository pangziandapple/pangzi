package pangzi.apple.mq.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;

@Component
public class Customer implements ChannelAwareMessageListener {

	private Logger logger = LoggerFactory.getLogger(Customer.class);

	@Override
	public void onMessage(Message message, Channel channel) throws Exception {
		System.out.println("receive message:{}" + message);
		String receivedMessage = null;
		receivedMessage = new String(message.getBody());
		System.out.println("message.body:{}"+receivedMessage);

		MessageProperties prop = message.getMessageProperties();
		long deliveryTag = prop.getDeliveryTag();
		channel.basicAck(deliveryTag, true);
		System.out.println(">>>队列消息已删除,Tag=" + deliveryTag);
	}

}
