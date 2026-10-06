/*
 *	Author: Nisha Cooke
 *  Date: 10/2/26
 * 	Collaborator:
 */

import java.util.Scanner;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //intro
        System.out.println("Welcome! You are a barkery owner getting ready for your day!");
        System.out.print("What is your bakery's name? ");
        String name = sc.nextLine();

        //buy ingredients
        int money = 30;
        int eggsPrice = 7;
        int flourPrice = 5;
        int sugarPrice = 5;
        int butterPrice = 5;
        int chipsPrice = 4;
        int frostingPrice = 3;
        int yeastPrice = 7;

        System.out.println();
        System.out.println("You have $30 to spend at the store");
        System.out.println("Eggs: $7");
        System.out.println("Flour: $5");
        System.out.println("Sugar: $5");
        System.out.println("Butter: $5");
        System.out.println("Chocolate chips: $4");
        System.out.println("Frosting: $3");
        System.out.println("Yeast: $7");
        System.out.println();

        //eggs
        System.out.print("Would you like to buy eggs for $7?: ");
        String buyEggs = sc.nextLine();
        boolean hasEggs = false;
        if (buyEggs.equals("yes") && eggsPrice <= money) {
            hasEggs = true;
            money = money - eggsPrice;
        } else if (buyEggs.equals("yes")) {
            System.out.println("Looks like you dont have enough money for this item.");
        }
        else {
            hasEggs = false;
        }
 
        //flour
        System.out.print("Would you like to buy flour for $5?: ");
        String buyFlour = sc.nextLine();
        boolean hasFlour = false;
        if (buyFlour.equals("yes") && flourPrice <= money) {
            hasFlour = true;
            money = money - flourPrice;
        } else if (buyFlour.equals("yes")) {
            System.out.println("Looks like you dont have enough money for this item.");
        }
        else {
            hasFlour = false;
        }
 
        //sugar
        System.out.print("Would you like to buy sugar for $5? ");
        String buySugar = sc.nextLine();
        boolean hasSugar = false;
        if (buySugar.equals("yes") && sugarPrice <= money) {
            hasSugar = true;
            money = money - sugarPrice;
        } else if (buySugar.equals("yes")) {
            System.out.println("Looks like you dont have enough money for this item.");
        }
        else {
            hasSugar = false;
        }
 
        //butter
        System.out.print("Would you like to buy butter for $5? ");
        String buyButter = sc.nextLine();
        boolean hasButter = false;
        if (buyButter.equals("yes") && butterPrice <= money) {
            hasButter = true;
            money = money - butterPrice;
        } else if (buyButter.equals("yes")) {
            System.out.println("Looks like you dont have enough money for this item.");
        }
        else {
            hasButter = false;
        }
 
        //chocolate chips
        System.out.print("Would you like to buy chocolate chips for $4? ");
        String buyChips = sc.nextLine();
        boolean hasChips = false;
        if (buyChips.equals("yes") && chipsPrice <= money) {
            hasChips = true;
            money = money - chipsPrice;
        } else if (buyChips.equals("yes")) {
            System.out.println("Looks like you dont have enough money for this item.");
        }
        else {
            hasChips = false;
        }
 
        //frosting
        System.out.print("Would you like to buy frosting for $3? ");
        String buyFrosting = sc.nextLine();
        boolean hasFrosting = false;
        if (buyFrosting.equals("yes") && frostingPrice <= money) {
            hasFrosting = true;
            money = money - frostingPrice;
        } else if (buyFrosting.equals("yes")) {
            System.out.println("Looks like you dont have enough money for this item.");
        }
        else {
            hasFrosting = false;
        }
 
        //yeast
        System.out.print("Would you like to buy yeast for $7? ");
        String buyYeast = sc.nextLine();
        boolean hasYeast = false;
        if (buyYeast.equals("yes") && yeastPrice <= money) {
            hasYeast = true;
            money = money - yeastPrice;
        } else if (buyYeast.equals("yes")) {
            System.out.println("Looks like you dont have enough money for this item.");
        }
        else {
            hasYeast = false;
        }
 
        //canMake booleans
        boolean canMakeCookies = hasEggs && hasFlour && hasSugar && hasButter && hasChips;
        boolean canMakeCake = hasEggs && hasFlour && hasSugar && hasButter && hasFrosting;
        boolean canMakeBread = hasFlour && hasYeast;
 
        //choose recipe
        System.out.println();
        System.out.println("Choose a recipe to bake! Cookies, cake, or bread?: ");
        String recipe = sc.nextLine();
 
        boolean canMakeRecipe = ((recipe.equals("cookies")||recipe.equals("Cookies")) && canMakeCookies) || (recipe.equals("cake")||recipe.equals("Cake") && canMakeCake) || ((recipe.equals("bread")||recipe.equals("Bread")) && canMakeBread);
 
        if (canMakeRecipe == false) {
            boolean onMenu = recipe.equals("cookies") || recipe.equals("cake") || recipe.equals("bread");
            if (onMenu == false) {
                System.out.println("Sorry, that's not on the menu");
            } else {
                System.out.println("Sorry, you don't have all the ingredients for " + recipe);
            }
            System.out.print("Pick a different recipe: ");
            recipe = sc.nextLine();
            canMakeRecipe = ((recipe.equals("cookies")||recipe.equals("Cookies")) && canMakeCookies) || (recipe.equals("cake")||recipe.equals("Cake") && canMakeCake) || ((recipe.equals("bread")||recipe.equals("Bread")) && canMakeBread);
            if (canMakeRecipe == false) {
                System.out.println("You can't make that either, looks like you won't have any treats for " + name + " today");
            }
        }
 
        //end
        System.out.println();
        if (canMakeRecipe) {
            System.out.println("Exellent choice! You have everything you need, now it's time to bake " + recipe + "!");
            System.out.println();
            System.out.println("Great work! Everyone will love " + name + "'s freshly baked " + recipe + " today!");
        } //else {
        //     System.out.println("You can't make that either, looks like you won't have any treats for " + name + " today");
        // }
    }
}
    

