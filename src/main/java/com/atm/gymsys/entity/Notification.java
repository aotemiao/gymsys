package com.atm.gymsys.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "gms_notice")
public class Notification {
    @Id
    private String notificationId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date notificationDate;

    private String notificationPerson;

    private String content;

    private String title;
    /**
     * 通知状态;为0代表通知未被删除,1代表通知被删除了
     */
    private Integer state;
}
