package food.delivery.domain;

import food.delivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String menu;
    private String orderStatus;
    private String userId;
    private String orderCount;
    private Date orderDate;
}
