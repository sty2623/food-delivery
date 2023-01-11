package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class AppRegistered extends AbstractEvent {

    private Long id;
    private String orderId;
    private String menu;
    private String orderStatus;
    private String deliveryInfo;
    private Date deliveryDate;
    private String userId;
    private String riderId;

    public AppRegistered(Delivery aggregate){
        super(aggregate);
    }
    public AppRegistered(){
        super();
    }
}
