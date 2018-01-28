package expensereport;

import static expensereport.Expense.Type.BREAKFAST;
import static expensereport.Expense.Type.DINNER;

public class DinnerExpense extends Expense {
    public DinnerExpense(int amount) {
        super(Type.DINNER, amount);
    }

    @Override
    boolean isOverage() {
        return (type == DINNER && amount > 5000)
                || (type == BREAKFAST && amount > 1000);
    }

    @Override
    String getName() {
        String name = "TILT";
        switch (type) {
            case DINNER:
                name = "Dinner";
                break;
            case BREAKFAST:
                name = "Breakfast";
                break;
            case CAR_RENTAL:
                name = "Car Rental";
                break;
        }
        return name;
    }

    @Override
    boolean isMeal() {
        return type == BREAKFAST || type == DINNER;
    }
}
