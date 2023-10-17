package labshopcqrs-ye.domain;

import labshopcqrs-ye.infra.AbstractEvent;
import lombok.Data;
import java.util.*;
import java.time.LocalDate;


@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String status;
    private String address;
}
