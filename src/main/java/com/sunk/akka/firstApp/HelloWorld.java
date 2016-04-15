package com.sunk.akka.firstApp;

import akka.actor.UntypedActor;

public class HelloWorld extends UntypedActor {

	@Override
	public void onReceive(Object message) throws Exception {
		System.out.println(message);
		getSender().tell("Hello " + message, getSelf());
	}
}