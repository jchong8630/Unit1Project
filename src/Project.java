import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Input Variables
        System.out.print("Total Bill: ");
        double totalBill = s.nextDouble();
        System.out.print("Tip Percent: ");
        double tipPercent = s.nextDouble();
        tipPercent *= .01;
        System.out.print("Number Of People: ");
        int numPeople = s.nextInt();

        //Non Input Variables
        double tipCost = totalBill * tipPercent;
        tipCost = Math.round((tipCost + .001) * 100.0) / 100.0  ;
        double tipPerPerson = tipCost / numPeople;
        tipPerPerson = Math.round((tipPerPerson + .001) * 100.0) / 100.0;
        double costPerPerson = totalBill / numPeople;
        double totalPerPerson = costPerPerson + tipPerPerson;
        totalPerPerson = Math.round(totalPerPerson * 100.0) / 100.0;
        double completeBill = totalBill + tipCost;

        //Increase totalPerPerson by 1 cent if the amount calculated is less than the completeBill
        if ((totalPerPerson * numPeople) < (completeBill)) {
            totalPerPerson += .01;
            totalPerPerson = Math.round(totalPerPerson * 100.0) / 100.0;
        }

        //Display
        System.out.println();
        System.out.println("Total Tip Cost: $" + tipCost);
        System.out.println("Total Cost: $" + completeBill);
        System.out.println("Tip Per Person: $" + tipPerPerson);
        System.out.println("Total Per Person: $" + totalPerPerson);

    }
}