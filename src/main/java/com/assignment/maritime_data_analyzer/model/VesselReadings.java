package com.assignment.maritime_data_analyzer.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "vessel_metrics")
@Getter
@Setter
@NoArgsConstructor
public class VesselReadings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vessel_code", nullable = false)
    private String vesselCode;

    @Column(nullable = false)
    private LocalDateTime datetime;

    @Column(nullable = false, precision = 10, scale = 6)
    private BigDecimal latitude;

    @Column(nullable = false, precision = 10, scale = 6)
    private BigDecimal longitude;

    @Column(precision = 10, scale = 2)
    private BigDecimal power;

    @Column(name = "fuel_consumption", precision = 10, scale = 2)
    private BigDecimal fuelConsumption;

    @Column(name = "actual_speed_overground", precision = 5, scale = 2)
    private BigDecimal actualSpeedOverground;

    @Column(name = "proposed_speed_overground", precision = 5, scale = 2)
    private BigDecimal proposedSpeedOverground;

    @Column(name = "predicted_fuel_consumption", precision = 10, scale = 2)
    private BigDecimal predictedFuelConsumption;
}
