package food.delivery.domain;

import food.delivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String menu;
    private String orderStatus;
    private String deliveryInfo;
    private Date deliveryDate;
    private String userId;
    private String riderId;
}
