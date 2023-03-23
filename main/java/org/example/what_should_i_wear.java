package org.example;

import java.util.Scanner;
public class what_should_i_wear {
    public static void main(String[] args) {

        System.out.println("Tell me what the weather is and the temperature");

        Scanner reader1 = new Scanner(System.in);
        Scanner reader2 = new Scanner(System.in);
        String weather = reader1.nextLine();
        int temperature = reader2.nextInt();

        String recommendedOutfit = "";

//        if the temperature is less than 5 wear a winter coat
//        if the temperature is between 5 and 15 wear a hoodie with cargos
//        if the temperature is between 15 and 25 wear a t-shirt and shorts
//        if the temperature is more than 25 wear a vest and trunks

        if (temperature < 5) {
            recommendedOutfit += "wear a winter coat and warm clothing";
        } else if (temperature <= 15 && temperature > 5) {
            recommendedOutfit += "wear a hoodie with cargos";
        } else if (temperature <= 25 && temperature > 15) {
            recommendedOutfit += "wear a t-shirt and shorts";
        } else if (temperature > 25) {
            recommendedOutfit += "wear a vest and trunks";
        }

//        if the weather is rainy carry an umbrella
//        if the weather is sunny wear sunglasses
//        if the weather is snow wear boots
//        if the weather windy stay inside

        if (weather.equals("rainy")){
            recommendedOutfit += " and carry an umbrella";
        } else if (weather.equals("sunny")) {
            recommendedOutfit += " and wear sunglasses";
        } else if (weather.equals("snowy")) {
            recommendedOutfit += " and wear boots";
        } else if (weather.equals("windy")) {
            recommendedOutfit = "Just stay inside for your own safety";
        } else if (weather.equals("cloudy")) {
            recommendedOutfit += " and check the weather if it's raining";
        }

        System.out.println(recommendedOutfit);
    }

}
