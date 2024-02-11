/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yearlymaintenancecost;

/**
 *
 * @author Administrator
 */
public class YearlyMaintenanceCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaring variables
        double totalCost;
        double springCost = 3400;
        double summerCost = 4000;
        double fallCost = 2500;
        double winterCost = 3000;
        //doing the math
        totalCost = springCost + summerCost + fallCost + winterCost;
        //outputting the variables
        System.out.println("The cost of maintenance for the Spring is " + springCost);
        System.out.println("The cost of maintenance for the Summer is " + summerCost);
        System.out.println("The cost of maintenance for the Fall is " + fallCost);
        System.out.println("The cost of maintenance for the Winter is " + winterCost);
        System.out.println("The total cost of maintenance for the year is " + totalCost);
    }
    
}
