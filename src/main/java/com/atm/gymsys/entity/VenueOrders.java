package com.atm.gymsys.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class VenueOrders {
    @Id
    private String venueId;

    private Date orderDate;

    /**
     * 分时状态;第i位代表第i~i+1小时的场馆状态0代表不可用1代表可用2代表已经被预约
     */
    private String reserveStatus;
}
