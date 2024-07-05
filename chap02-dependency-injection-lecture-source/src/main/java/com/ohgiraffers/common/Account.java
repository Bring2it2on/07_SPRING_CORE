package com.ohgiraffers.common;

public interface Account {

    // 잔액조회
    String getBalance();

    // 입급
    String deposit(int money);

    // 출금
    String withdraw(int money);
}
