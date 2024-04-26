package controller;

import view.CalcIMC;
import model.entities.IMC;

public class ControllerIMC {

    public static void calcularIMC(CalcIMC calcIMC) {
        try {
            validateInputs(calcIMC.getTfHeight().getText().replace(',', '.').trim(), 
                    calcIMC.getTfWeight().getText().replace(',', '.').trim());

            double height = Double.parseDouble(calcIMC.getTfHeight().getText().replace(',', '.').trim());
            double weight = Double.parseDouble(calcIMC.getTfWeight().getText().replace(',', '.').trim());

            IMC imcModel = new IMC();
            double imc = imcModel.calcularIMC(weight, height);
            String interpretacao = imcModel.interpretarIMC(imc);

            calcIMC.getLblResultado().setText("Resultado: " + String.format("%.2f", imc));
            calcIMC.getLblInterpretacao().setText("Interpretação: " + interpretacao);
        } catch (IllegalArgumentException e) {
            calcIMC.displayError(e.getMessage());
        }
    }

    private static void validateInputs(String heightString, String weightString){
        if (heightString.isEmpty() && weightString.isEmpty()) {
            throw new IllegalArgumentException("Preencha os campos de altura e peso.");
        } else if (heightString.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo de altura.");
        } else if (weightString.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo de peso.");
        }

        try {
           Double.valueOf(heightString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("A altura deve ser um valor numérico.");
        }

        try {
            Double.valueOf(weightString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("O peso deve ser um valor numérico.");
        }
    }
}
