package com.example.tuncbank.database;

import com.example.tuncbank.database.transactions.accountInformation;

public interface IinformationController {

    boolean isInformationValid();

    accountInformation getAccountInformation();

}
