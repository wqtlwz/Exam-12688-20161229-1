package cn.hand.exam.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartEvent implements ApplicationListener<ContextStartedEvent>{

	public void onApplicationEvent(ContextStartedEvent arg0) {
		System.out.println("Context Start");
		
	}
	
	
}
