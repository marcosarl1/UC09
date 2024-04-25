package controller;

import javax.swing.JOptionPane;

import model.entities.Sale;
import view.SaleCalculator;

public class SaleController {

    private static final Double MIN_PRICE_FOR_DISCOUNT = 500.00;

    public static void calculateSale(SaleCalculator saleCalculator) {

        try {
            double price = Double.parseDouble(saleCalculator.valueField.getText());
            if (price <= 0) {
                throw new IllegalArgumentException("O valor da venda deve ser maior que zero.");
            }
            if (price > MIN_PRICE_FOR_DISCOUNT) {
                Sale sale = new Sale(price);
                String discountInput = JOptionPane.showInputDialog(null, "Insira a porcentagem de desconto.",
                        "Solicitar desconto", JOptionPane.DEFAULT_OPTION);
                if (discountInput == null) {
                    return;
                }
                double discount = Double.parseDouble(discountInput);
                sale.requestDiscount(discount);
                JOptionPane.showMessageDialog(null,
                        String.format("Pre�o original: R$%.2f %nPre�o com desconto: R$%.2f", price, sale.getPrice()),
                        "Detalhes da venda", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        String.format("Pre�o total: R$%.2f", price),
                        "Detalhes da venda", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            if (saleCalculator.valueField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Insira o valor da venda!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Insira um n�mero v�lido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            saleCalculator.valueField.setText("");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
