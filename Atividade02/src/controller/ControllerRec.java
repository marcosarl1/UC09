package controller;

import model.entities.Calories;
import view.CalcRec;

public class ControllerRec {
    
    public static void calculateRecs(CalcRec calcRec){
        try{
           String calString = calcRec.getTfCal().getText().replace(',','.').trim();
            validateInputs(calString);
            
            double dailyCalories = Double.parseDouble(calString);
            double[] recs = Calories.calculateRec(dailyCalories);
            
            calcRec.getLblCarbo().setText(String.format("Carboidratos (50%%): %.2f g", recs[0]));
            calcRec.getLblProtein().setText(String.format("Proteína (25%%): %.2f g", recs[1]));
            calcRec.getLblGordura().setText(String.format("Gordura (25%%): %.2f g", recs[2]));
            
        } catch (IllegalArgumentException e){
            calcRec.displayError(e.getMessage());
        }
    }
    
    private static void validateInputs(String calString){
        if (calString.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo de Calórias diárias.");
        }
        
        try {
            Double.valueOf(calString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Digite um valor válido para Calórias diárias.");
        }
    }
}
