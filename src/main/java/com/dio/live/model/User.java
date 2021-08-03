package com.dio.live.model;

import lombok.*;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import org.hibernate.envers.Audited;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private UserCategory userCategory;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLavel accessLevel;
    @ManyToOne
    private WorkDay workDay;
    private BigDecimal tolerance;
    private LocalDateTime startOfJourney;
    private LocalDateTime endOfJourney;
}
