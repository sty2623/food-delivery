package food.delivery.domain;

import food.delivery.domain.CookPicked;
import food.delivery.domain.AppRegistered;
import food.delivery.domain.DeliveryCompleted;
import food.delivery.RiderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Delivery_table")
@Data

public class Delivery  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String menu;
    
    
    
    
    
    private String orderStatus;
    
    
    
    
    
    private String deliveryInfo;
    
    
    
    
    
    private Date deliveryDate;
    
    
    
    
    
    private String userId;
    
    
    
    
    
    private String riderId;

    @PostPersist
    public void onPostPersist(){


        CookPicked cookPicked = new CookPicked(this);
        cookPicked.publishAfterCommit();



        AppRegistered appRegistered = new AppRegistered(this);
        appRegistered.publishAfterCommit();



        DeliveryCompleted deliveryCompleted = new DeliveryCompleted(this);
        deliveryCompleted.publishAfterCommit();

    }

    public static DeliveryRepository repository(){
        DeliveryRepository deliveryRepository = RiderApplication.applicationContext.getBean(DeliveryRepository.class);
        return deliveryRepository;
    }




    public static void orderInfoUpdate(CookStarted cookStarted){

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStarted.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

        
    }


}
