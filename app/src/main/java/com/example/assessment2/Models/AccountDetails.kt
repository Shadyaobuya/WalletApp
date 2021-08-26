package com.example.assessment2.Models

data class AccountDetails(
    var accountName:String,
    var description:String,
    var reference:String,
    var date:String,
    var amount:String,
    var transactionType:String,
    var currency:String,



)
//You are building a mobile wallet app in which a transaction is represented using a
//data class with the following attributes:
//- Description - A description of the transaction
//- Reference - Transaction reference number
//- Date - When the transaction occurred
//- Amount - The value of the transaction
//- TransactionType - Either DEBIT or CREDIT. A debit is a transaction that
//increases the account balance while a credit transaction reduces the balance.
//Implement an activity that displays a list of transactions. There ought to be a visual
//distinction between a debit and a credit. Your users should also be able to view their
//account details on the same activity, including Account Name, Currency, Balance
//and average transaction amounts.