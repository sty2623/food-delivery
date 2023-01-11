package food.delivery.domain;

import food.delivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderCancled extends AbstractEvent {

    private Long id;
    private String menu;
    private String orderStatus;
    private Date orderDate;
    private String userId;
    private String orderCount;
}
