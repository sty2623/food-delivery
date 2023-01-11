package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class AlarmSended extends AbstractEvent {

    private Long id;
    private String orderId;
    private String orderStatus;
    private String userId;
    private String orderCount;
    private Date orderDate;

    public AlarmSended(Order aggregate){
        super(aggregate);
    }
    public AlarmSended(){
        super();
    }
}
