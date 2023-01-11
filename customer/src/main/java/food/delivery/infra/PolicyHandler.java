package food.delivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import food.delivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import food.delivery.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired OrderRepository orderRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderAccepted'")
    public void wheneverOrderAccepted_OrderStatusUpdate(@Payload OrderAccepted orderAccepted){

        OrderAccepted event = orderAccepted;
        System.out.println("\n\n##### listener OrderStatusUpdate : " + orderAccepted + "\n\n");


        

        // Sample Logic //
        Order.orderStatusUpdate(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderRejected'")
    public void wheneverOrderRejected_OrderStatusUpdate(@Payload OrderRejected orderRejected){

        OrderRejected event = orderRejected;
        System.out.println("\n\n##### listener OrderStatusUpdate : " + orderRejected + "\n\n");


        

        // Sample Logic //
        Order.orderStatusUpdate(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookStarted'")
    public void wheneverCookStarted_OrderStatusUpdate(@Payload CookStarted cookStarted){

        CookStarted event = cookStarted;
        System.out.println("\n\n##### listener OrderStatusUpdate : " + cookStarted + "\n\n");


        

        // Sample Logic //
        Order.orderStatusUpdate(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookCompleted'")
    public void wheneverCookCompleted_OrderStatusUpdate(@Payload CookCompleted cookCompleted){

        CookCompleted event = cookCompleted;
        System.out.println("\n\n##### listener OrderStatusUpdate : " + cookCompleted + "\n\n");


        

        // Sample Logic //
        Order.orderStatusUpdate(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CookPicked'")
    public void wheneverCookPicked_OrderStatusUpdate(@Payload CookPicked cookPicked){

        CookPicked event = cookPicked;
        System.out.println("\n\n##### listener OrderStatusUpdate : " + cookPicked + "\n\n");


        

        // Sample Logic //
        Order.orderStatusUpdate(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryCompleted'")
    public void wheneverDeliveryCompleted_OrderStatusUpdate(@Payload DeliveryCompleted deliveryCompleted){

        DeliveryCompleted event = deliveryCompleted;
        System.out.println("\n\n##### listener OrderStatusUpdate : " + deliveryCompleted + "\n\n");


        

        // Sample Logic //
        Order.orderStatusUpdate(event);
        

        

    }

}


