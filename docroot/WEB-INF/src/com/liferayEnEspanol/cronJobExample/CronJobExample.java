package com.liferayEnEspanol.cronJobExample;
import java.util.Date;

import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;


public class CronJobExample implements MessageListener {

	@Override
	public void receive(Message message) throws MessageListenerException {
		System.out.println("["+new Date()+"] Running.....");
		
	}

}
