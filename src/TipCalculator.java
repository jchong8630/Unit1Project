import java.util.Scanner;

public class TipCalculator {
    private  double totalBill;
    private double numPeople;
    private double tipPercent;
    private double tipCost;
    private double tipPerPerson;
    private double completeBill;

    private double totalPerPerson;

    private double costPerPerson;


    public void calculator()
    {
        open();
        calculation();
        display();
    }

    public void open()
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Total Bill: ");
        totalBill = s.nextDouble();
        System.out.print("Tip Percent: ");
        tipPercent = s.nextDouble();
        tipPercent *= .01;
        System.out.print("Number Of People: ");
        numPeople = s.nextInt();
    }

    public void calculation()
    {
        tipCost = totalBill * tipPercent;
        tipCost = Math.round((tipCost + .001) * 100.0) / 100.0  ;
        tipPerPerson = tipCost / numPeople;
        tipPerPerson = Math.round((tipPerPerson + .001) * 100.0) / 100.0;
        costPerPerson = totalBill / numPeople;
        totalPerPerson = costPerPerson + tipPerPerson;
        totalPerPerson = Math.round(totalPerPerson * 100.0) / 100.0;
        completeBill = totalBill + tipCost;
        if ((totalPerPerson * numPeople) < (completeBill)) {
            totalPerPerson += .01;
            totalPerPerson = Math.round(totalPerPerson * 100.0) / 100.0;
    }


    }

    //Display
    public void display()
    {
        System.out.println();
        System.out.println("Total Tip Cost: $" + String.format("%.2f", tipCost));
        System.out.println("Total Cost: $" + String.format("%.2f", completeBill));
        System.out.println("Tip Per Person: $" + String.format("%.2f", tipPerPerson));
        System.out.println("Total Per Person: $" + String.format("%.2f", totalPerPerson));
    }

}
