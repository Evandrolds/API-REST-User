package com.dio.live.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Evandro
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentation {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable

    public class MovimentationId implements Serializable {

        private Long movimentationId;
        private Long idUser;
    }
    @EmbeddedId
    @Id
    @GeneratedValue
    private MovimentationId id;
    @ManyToOne
    private Occurrence ocurrence;
    @ManyToOne
    private Calendar calendar;
    private LocalDateTime entranceDate;
    private LocalDateTime departureDate;
    private BigDecimal period;

}
