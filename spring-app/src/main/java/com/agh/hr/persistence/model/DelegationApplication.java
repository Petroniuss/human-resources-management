package com.agh.hr.persistence.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DelegationApplication extends Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime startDate;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime endDate;

    private String destination;

}
