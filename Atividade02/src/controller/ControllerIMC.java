package controller;

import view.CalcIMC;
import model.entities.IMC;

public class ControllerIMC {

    public static void calculateIMC(CalcIMC calcIMC) {
        try {
            //Obter inputs e validar com método próprio
            validateInputs(calcIMC.getTfHeight().getText().replace(',', '.').trim(), 
                    calcIMC.getTfWeight().getText().replace(',', '.').trim());

            //Formatar inputs para tipos desejados
            double height = Double.parseDouble(calcIMC.getTfHeight().getText().replace(',', '.').trim());
            double weight = Double.parseDouble(calcIMC.getTfWeight().getText().replace(',', '.').trim());

            //Calculos
            double imc = IMC.calcularIMC(weight, height);
            String interpretacao = IMC.interpretarIMC(imc);

            //Retornado resultados
            calcIMC.getLblResultado().setText("Resultado: " + String.format("%.2f", imc));
            calcIMC.getLblInterpretacao().setText("Interpretação: " + interpretacao);
        } catch (IllegalArgumentException e) {
            calcIMC.displayError(e.getMessage());
        }
    }

    private static void validateInputs(String heightString, String weightString){
        if (heightString.isEmpty() && weightString.isEmpty()) {
            throw new IllegalArgumentException("Preencha todos os campos.");
        } else if (heightString.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo de altura.");
        } else if (weightString.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo de peso.");
        }

        try {
           Double.valueOf(heightString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Digite um valor válido para altura.");
        }

        try {
            Double.valueOf(weightString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Digite um valor válido para peso.");
        }
    }
}
