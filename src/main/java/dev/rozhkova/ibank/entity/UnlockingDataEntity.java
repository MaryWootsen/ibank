package dev.rozhkova.ibank.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "unlocking_data")
public class UnlockingDataEntity {
    @NotNull
    private String accountNumber;

    @NotNull
    private String generatedValue;

    @NotNull
    @Column(columnDefinition = "boolean default true")
    private boolean isValid;
}
