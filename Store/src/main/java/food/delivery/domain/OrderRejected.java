package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String orderId;
    private String menu;
    private String orderStatus;
    private String userId;
    private String orderCount;
    private Date orderDate;

    public OrderRejected(Store aggregate){
        super(aggregate);
    }
    public OrderRejected(){
        super();
    }
}
