package labshopcqrs-ye.domain;

import labshopcqrs-ye.domain.OrderPlaced;
import labshopcqrs-ye.domain.OrderCancelled;
import labshopcqrs-ye.OrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="Order_table")
@Data

//<<< DDD / Aggregate Root
public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private String productId;
    
    
    
    
    private Integer qty;
    
    
    
    
    private String customerId;
    
    
    
    
    private Double amount;
    
    
    
    
    private String status;
    
    
    
    
    private String address;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){
        // Get request from Order
        //labshopcqrs-ye.external.Order order =
        //    Application.applicationContext.getBean(labshopcqrs-ye.external.OrderService.class)
        //    .getOrder(/** mapping value needed */);

    }
    @PreRemove
    public void onPreRemove(){


        OrderCancelled orderCancelled = new OrderCancelled(this);
        orderCancelled.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
//>>> DDD / Aggregate Root
