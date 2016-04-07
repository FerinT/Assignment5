package com.ferin.factories.tranaction;

import com.ferin.transaction.Transaction;
import com.ferin.transaction.impl.BalanceEnquiry;
import com.ferin.transaction.impl.Transfer;
import com.ferin.transaction.impl.Withdraw;


public class TransactionFactory {

        public static Transaction getTransaction(String value){
            Transaction chain = setUpChain();
            return chain.handleRequest(value);
        }

        public static Transaction setUpChain(){
            Transaction balanceEnquiry = new BalanceEnquiry();
            Transaction transfer = new Transfer();
            Transaction withdraw = new Withdraw();

            balanceEnquiry.setNextTransaction(transfer);
            transfer.setNextTransaction(withdraw);

            return balanceEnquiry;
        }


}
