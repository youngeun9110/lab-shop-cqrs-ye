package labshopcqrs-ye.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;
import java.time.LocalDate;


//<<< EDA / CQRS
@Entity
@Table(name="MyPage_table")
@Data
public class MyPage {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long orderId;
        private String productId;
        private String deliveryStatus;
        private String orderStatus;


}
