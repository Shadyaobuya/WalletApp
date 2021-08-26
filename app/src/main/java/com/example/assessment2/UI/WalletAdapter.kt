package com.example.assessment2.UI

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assessment2.Models.AccountDetails
import com.example.assessment2.R

class WalletAdapter(var accountList:List<AccountDetails>):RecyclerView.Adapter<WalletViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.transaction_list_item,parent,false)
        return WalletViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        var currentDetail=accountList.get(position)
        holder.description.text=currentDetail.description
        holder.reference.text=currentDetail.reference
        holder.date.text=currentDetail.date
        holder.amount.text=currentDetail.amount
        holder.transaction.text=currentDetail.transactionType
    }

    override fun getItemCount(): Int {
        return accountList.size
    }

}

class WalletViewHolder(var itemView:View):RecyclerView.ViewHolder(itemView){
    var description=itemView.findViewById<TextView>(R.id.tvDescription)
    var reference=itemView.findViewById<TextView>(R.id.tvReference)
    var date=itemView.findViewById<TextView>(R.id.tvDate)
    var amount=itemView.findViewById<TextView>(R.id.tvAmount)
    var transaction=itemView.findViewById<TextView>(R.id.tvTransaction)


}