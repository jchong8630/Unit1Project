import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Total Bill: ");
        double totalBill = s.nextDouble();
        System.out.print("Tip Percent: ");
        double tipPercent = s.nextDouble();
        tipPercent *= .01;
        System.out.print("Number Of People: ");
        int numPeople = s.nextInt();
        double tipCost = totalBill * tipPercent;
        double tipPerPerson = tipCost / numPeople;
        double costPerPerson = totalBill / numPeople;
        double totalPerPerson = costPerPerson + tipPerPerson;
        totalPerPerson = Math.round(totalPerPerson * 100.0) / 100.0;
        if ((totalPerPerson * numPeople) != totalBill) {
            totalPerPerson += .01;
        }

        System.out.println(tipPerPerson);
        System.out.println(totalPerPerson);



    }
}