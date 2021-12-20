package com.atm.gymsys.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Order {
    @Id
    private String orderId;

    private String venueId;

    private String userId;

    /**
     * 预约日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reservedDate;

    private Integer orderBeginTime;

    private Integer orderEndTime;

    private Integer orderStatus;//0代表进行中 (预约成功), 1代表已取消, 2代表已成功(已完成订单)

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date orderDate;

    private Double order_Price;

}
