import java.util.Scanner;

public class Output extends ExpenseType{
	
	public static void main(String[] args) {
		
		ExpenseType exp=new ExpenseType();
		
	
		System.out.println("Meals Expense:"+exp.meals());
		System.out.println("Total Expense: "+ exp.totalExpense());
		
		System.out.println("meals along with lunch: "+exp.mealsWithLunch());
		
	}

}
