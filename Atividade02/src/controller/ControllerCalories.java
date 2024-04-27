package controller;

import model.entities.Calories;
import view.CalcGC;

public class ControllerCalories {

    public static void calculateCalories(CalcGC calcGC) {
        try {
            //Validando inputs
            validateInputs(calcGC.getTfWeight().getText().replace(',', '.').trim(),
                    calcGC.getTfHeight().getText().replace(',', '.').trim(),
                    calcGC.getTfAge().getText().trim());

            if (!calcGC.getRbFemale().isSelected() && !calcGC.getRbMale().isSelected()) {
                throw new IllegalArgumentException("Selecione o sexo.");
            }

            //Formatando inputs
            double weight = Double.parseDouble(calcGC.getTfWeight().getText().replace(',', '.').trim());
            int height = Integer.parseInt(calcGC.getTfHeight().getText().trim());
            int age = Integer.parseInt(calcGC.getTfAge().getText().replace(',', '.').trim());
            boolean isMale = calcGC.getRbMale().isSelected();

            //Calculos
            double basalCalories = Calories.calculateBasalCalories(weight, height, age, isMale);
            double activityFactor = getActivityFactor((String) calcGC.getCbActivity().getSelectedItem());
            double totalCalories = Calories.calculateTotalCalories(basalCalories, activityFactor);
            
            //Retornando resultados
            updateResults(calcGC, basalCalories, totalCalories);
        } catch (IllegalArgumentException e) {
            calcGC.displayError(e.getMessage());
        }
    }

    private static double getActivityFactor(String selectedActivity) {
        return switch (selectedActivity) {
            case "Sedentário" ->
                1.2;
            case "Leve (exercício leve 1 a 3 dias/semana)" ->
                1.375;
            case "Moderado (exercício moderado 3 a 5 dias/semana)" ->
                1.55;
            case "Ativo (exercício pesado 5 a 6 dias/semana)" ->
                1.725;
            case "Extremamente ativo (exercício pesado diário)" ->
                1.9;
            default ->
                1.0;
        };
    }

    private static void validateInputs(String weightString, String heightString, String ageString) {
        if (heightString.isEmpty() && weightString.isEmpty() && ageString.isEmpty()) {
            throw new IllegalArgumentException("Preencha todos os campos.");
        } else if (heightString.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo de altura.");
        } else if (weightString.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo de peso.");
        } else if (ageString.isEmpty()) {
            throw new IllegalArgumentException("Prencha o campo de idade.");
        }

        try {
            Integer.valueOf(heightString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Digite um valor válido para altura.");
        }

        try {
            Double.valueOf(weightString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Digite um valor válido para peso.");
        }

        try {
            Integer.valueOf(ageString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Digite um valor válido para idade.");
        }
    }

    private static void updateResults(CalcGC calcGC, double  basalCalories, double totalCalories) {
        calcGC.getLblGastoBasal().setText("Gasto Basal: " + String.format("%.2f", basalCalories));
        calcGC.getLblGastoTotal().setText("Gasto Total: " + String.format("%.2f", totalCalories));
    }
}
