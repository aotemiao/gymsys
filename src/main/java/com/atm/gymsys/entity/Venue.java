package com.atm.gymsys.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Venue {
    @Id
    private String venueId;

    private String venueType;

    private String venueName;

    private Double venuePrice;

    private  Integer venueCapacity;
    /**
     * 开始时间
     */
    private Integer venueOpenTime;
    /**
     * 关闭时间
     */
    private Integer venueCloseTime;
    /**
     * 场馆是否被删除;为0代表场馆未被删除,1代表场馆被删除了
     */
    private Integer venueStatus;
}
