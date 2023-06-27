package com.midnightsun.orderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "city")
public class City extends AbstractAuditingEntity {
    @Id
    @GeneratedValue(generator = "city_sequence_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "city_sequence_generator", initialValue = 1000, allocationSize = 1)
    private Long id;

    private String name;
}
