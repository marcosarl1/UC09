package model.entities;

public class IMC {

    public Double calcularIMC(double weight, double height) {
        if (weight <= 0) {
            throw new IllegalArgumentException("O peso deve ser um valor positivo maior que zero");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("A altura deve ser um valor positivo maior que zero");
        }
        return weight / (height * height);
    }

    public String interpretarIMC(double imc) {
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 40){
            return "Obesidade";
        } else {
            return "Obesidade grave";
        }
    }
}
