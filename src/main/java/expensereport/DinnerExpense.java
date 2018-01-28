package expensereport;

import static expensereport.Expense.Type.BREAKFAST;
import static expensereport.Expense.Type.DINNER;

public class DinnerExpense extends Expense {
    public DinnerExpense(int amount) {
        super(Type.DINNER, amount);
    }

    @Override
    boolean isOverage() {
        return amount > 5000;
    }

    @Override
    String getName() {
        return "Dinner";
    }

    @Override
    boolean isMeal() {
        return true;
    }
}
