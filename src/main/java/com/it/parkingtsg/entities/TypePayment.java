package com.it.parkingtsg.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "type_payment")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TypePayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_type_id")
    private Long paymentTypeId;

    @Column(name = "type_mean_payment")
    private String typeMeanPayment;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}