package model.entities;

public class Calories {

    public static double calculateBasalCalories(double weight, int height, int age, boolean isMale) {

        if (weight <= 0) {
            throw new IllegalArgumentException("O peso deve ser um valor positivo maior que zero");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("A altura deve ser um valor positivo maior que zero");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("A idade deve ser um valor positivo maior que zero");
        }
        if (isMale) {
            return 66 + (13.8 * weight) + (5 * height) - (6.8 * age);
        } else {
            return 655 + (9.6 * weight) + (1.9 * height) - (4.7 * age);
        }
    }

    public static double calculateTotalCalories(double basalCalories, double activityFactor) {
        return basalCalories * activityFactor;
    }

    public static double[] calculateRec(double dailyCalories) {
        if (dailyCalories <= 0){
            throw new IllegalArgumentException("O valor de Calórias diárias deve ser positivo maior que zero.");
        }
        double[] recs = new double[3];

        recs[0] = (dailyCalories * 0.5) / 4; //Carboidratos
        recs[1] = (dailyCalories * 0.25) / 4; //Proteínas
        recs[2] = (dailyCalories * 0.25) / 9; //Gordura
        
        return recs;
    }
}
