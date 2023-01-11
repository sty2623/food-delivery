package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCancled extends AbstractEvent {

    private Long id;
    private String menu;
    private String orderStatus;
    private Date orderDate;
    private String userId;
    private String orderCount;

    public OrderCancled(Order aggregate){
        super(aggregate);
    }
    public OrderCancled(){
        super();
    }
}
