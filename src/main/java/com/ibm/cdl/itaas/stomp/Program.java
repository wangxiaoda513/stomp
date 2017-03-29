package com.ibm.cdl.itaas.stomp;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Program {

    public static void main(String[] args) throws IOException, TimeoutException {

//        启用相关插件
//        rabbitmq-plugins enable rabbitmq_management rabbitmq_web_stomp rabbitmq_stomp

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare("rabbitmq", "fanout");
        String routingKey = "rabbitmq_routingkey";
        String message = "{\"name\":\"小果子!\"}";
        channel.basicPublish("rabbitmq", routingKey,null, message.getBytes());
        System.out.println("[x] Sent Message:"+message);
        channel.close();
        connection.close();
    }

}