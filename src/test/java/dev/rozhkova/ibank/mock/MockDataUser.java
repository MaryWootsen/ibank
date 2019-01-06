package dev.rozhkova.ibank.mock;

import dev.rozhkova.ibank.dto.UserDto;
import dev.rozhkova.ibank.entity.BankAccountEntity;
import dev.rozhkova.ibank.entity.PaymentHistoryEntity;
import dev.rozhkova.ibank.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class MockDataUser {

    public static UserEntity userEntity() {
        final UserEntity userEntity = new UserEntity();
        userEntity.setId(1L);
        userEntity.setFirstName("James");
        userEntity.setLastName("Alan");
        userEntity.setPatronymic("Hetfield");
        userEntity.setPassportNumber("HC1235685");
        userEntity.setEmail("jamesalan@mail.ru");
        userEntity.setLogin("user1");
        userEntity.setPassword("user1");
        userEntity.setEnabled(true);
        userEntity.setRole("ROLE_USER");
        final List<BankAccountEntity> bankAccountEntities = new ArrayList<>();
        userEntity.setBankAccount(bankAccountEntities);
        final List<PaymentHistoryEntity> paymentHistoryEntities = new ArrayList<>();
        userEntity.setPaymentHistory(paymentHistoryEntities);
        return userEntity;
    }

    public static UserDto userDto() {
        final UserDto userDto = new UserDto();
        userDto.setId(1L);
        userDto.setFirstName("James");
        userDto.setLastName("Alan");
        userDto.setPatronymic("Hetfield");
        userDto.setPassportNumber("HC1235685");
        userDto.setEmail("jamesalan@mail.ru");
        userDto.setLogin("user1");
        userDto.setEnabled(true);
        return userDto;
    }
}