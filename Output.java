import java.util.Scanner;

public class Output extends ExpenseType{
	
	public static void main(String[] args) {
		
		ExpenseType exp=new ExpenseType();
		
	
		System.out.println("Meals Expense:"+exp.meals());
		System.out.print("Total Expense: "+ exp.totalExpense());
		System.out.print("meals along with lunch"+exp.mealsWithLunch());
		
	}

}
