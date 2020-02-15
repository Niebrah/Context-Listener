package com.tutorialspoint;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent>{
// a generic has a type that is definied in <> and is a data structure that doesn't have an explicit
// datatype in its definition 
	
	public void onApplicationEvent(ContextStoppedEvent event) {
		
		System.out.print("ContextStoppedEvent Received");
		
	}
	
	
	
	
}
