package com.sunk.akka.firstApp;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

/**
 * Hello world!
 *
 */
public class HelloWorldApp
{
    public static void main( String[] args )
    {
        ActorSystem system = ActorSystem.create("demo1");
        ActorRef actor1 = system.actorOf(Props.create(HelloWorld.class));
        ActorRef actor2 = system.actorOf(Props.create(ReplyHello.class));
        
        actor1.tell("sunk", actor2);
        system.shutdown();
    }
}