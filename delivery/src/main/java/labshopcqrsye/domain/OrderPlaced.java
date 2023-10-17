package labshopcqrsye.domain;

import java.util.*;
import labshopcqrsye.domain.*;
import labshopcqrsye.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String status;
    private String address;
}
