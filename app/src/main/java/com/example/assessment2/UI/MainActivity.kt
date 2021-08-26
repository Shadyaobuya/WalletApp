package com.example.assessment2.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assessment2.Models.AccountDetails
import com.example.assessment2.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvTransaction=findViewById<RecyclerView>(R.id.rvWallet)
        rvTransaction.layoutManager=LinearLayoutManager(baseContext)
        var walletDetails= listOf(
            AccountDetails("Mike","4658743654","2020-02-01","30000","DEBIT"),
            AccountDetails("Hanah","4658743654","2020-02-01","30000","DEBIT"),
            AccountDetails("michele","4658743654","2020-02-01","30000","DEBIT"),
            AccountDetails("Anna","4658743654","2020-02-01","30000","DEBIT"),
            AccountDetails("Hoyo","4658743654","2020-02-01","30000","DEBIT"),

            )
        var walletAdapter=WalletAdapter(walletDetails)
        rvTransaction.adapter=walletAdapter



    }
}
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

