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
        tipCost = Math.round((tipCost + .001) * 100.0) / 100.0  ;
        System.out.println(tipCost);
        double tipPerPerson = tipCost / numPeople;
        double costPerPerson = totalBill / numPeople;
        costPerPerson = Math.round((costPerPerson + .001) * 100.0) / 100.0;
        double totalPerPerson = costPerPerson + tipPerPerson;
        totalPerPerson = Math.round(totalPerPerson * 100.0) / 100.0;
        if ((totalPerPerson * numPeople) != (totalBill + tipCost)) {
            totalPerPerson += .011;
            totalPerPerson = Math.round(totalPerPerson * 100.0) / 100.0;
        }

        System.out.println(tipPerPerson);
        System.out.println(totalPerPerson);

//https://github.com/jchong8630/Unit1Project

    }
}