package com.example.splitwise.strategies;

import com.example.splitwise.models.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HeapSettleUpStrategy implements SettleUpStrategy {

    @Override
    public List<Expense> settleUp(List<Expense> expensesToSettle) {
        return null;
    }
}
