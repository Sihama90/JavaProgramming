package day07_Operators;

public class SalaryCalculatorTask {

    public static void main(String[] args) {

        int hourlyRate = 50;
        int weeklyHours = 45;
        int weeksInYear = 52;
        double stateTax = 6.0;
        double federalTax = 26.0;

        int salaryBeforeTax = hourlyRate * weeklyHours * weeksInYear;
        double StateTaxResult = salaryBeforeTax * stateTax / 100;
        double FederalTaxResult = salaryBeforeTax * federalTax / 100;
        double TotalTax = StateTaxResult + FederalTaxResult;
        double netIncome = salaryBeforeTax - FederalTaxResult - StateTaxResult;

        System.out.println(netIncome);

        int grossPay = salaryBeforeTax;
        //int netIncome = totalTax - grossPay;
       // Gross pay is: $117000
       // Federal tax is: $30420
       // State tax is: $7020
       // Total tax is: $37440
       // Net income is: 79560

        System.out.println("Gross pay is: $" + salaryBeforeTax + "\n" + "Federal tax result is: $" + FederalTaxResult +
                "\n" + "State tax result is: $" + StateTaxResult + "\n" + "Total tax is: $" +  TotalTax + "\n" +
                "Net income is: " + netIncome);
/*
  Task:
  3. Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTax, federalTax

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTax = 6 (given as percentage, you need to convert to decimal)
					   federalTax = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560


 */






    }





}
