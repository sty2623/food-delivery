package food.delivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="OrderStatus_table")
@Data
public class OrderStatus {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String menu;
        private String orderStatus;
        private String userId;
        private String orderCount;
        private String deliveryInfo;
        private String riderId;
        private Date orderDate;


}
