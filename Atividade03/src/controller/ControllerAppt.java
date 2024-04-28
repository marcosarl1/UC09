package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.entities.Appt;
import view.Home;
import view.RegAppt;

public class ControllerAppt {
    
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final String CPF_REGEX = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
    private static final String TEL_REGEX = "\\(\\d{2}\\)\\s\\d{4,5}-\\d{4}";
    
    public static void registerAppt(Home home, RegAppt regAppt){
        try {
            String patientName = regAppt.getTextName().getText().trim();
            String cpf = regAppt.getTextCPF().getText().trim();
            String tel = regAppt.getTextTel().getText().trim();
            String dateText = regAppt.getTextDate().getText().trim();
            
            validateInputs(patientName, cpf, tel, dateText);
            
            LocalDate apptDate = LocalDate.parse(dateText, FORMATTER);
            Boolean isPatient = regAppt.getChkIsPatient().isSelected();
            
            Appt appt = new Appt(patientName, cpf, tel, apptDate, isPatient, false, "");
            
            home.addAppt(appt);
            regAppt.displaySuccess("Consulta adicionada com sucesso!");
            clearInputs(regAppt);
        } catch (DateTimeParseException e) {
            regAppt.displayError("Data inválida. Formato esperado: dd/MM/aaaa");
        } catch(IllegalArgumentException e) {
            regAppt.displayError(e.getMessage());
        }
    }
    
    private static void validateInputs(String patientName, String cpf, String tel, String dateText){
        if (patientName.isEmpty() && cpf.isEmpty() && tel.isEmpty() && dateText.isEmpty()) {
            throw new IllegalArgumentException("Preencha todos os campos.");
        } else if (patientName.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo Nome.");
        } else if (tel.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo Telefone.");
        }else if (cpf.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo CPF.");
        }  else if (dateText.isEmpty()) {
            throw new IllegalArgumentException("Preencha o campo Data da Consulta.");
        } 
        
        Pattern telPattern = Pattern.compile(TEL_REGEX);
        Matcher telMatcher = telPattern.matcher(tel);
        if (!telMatcher.matches()) {
            throw new IllegalArgumentException("Telefone inválido. Formato esperado: (XX) XXXXX-XXXX ou (XX) XXXX-XXXX");
        }
        
        Pattern cpfPattern = Pattern.compile(CPF_REGEX);
        Matcher cpfMatcher = cpfPattern.matcher(cpf);
        if (!cpfMatcher.matches()) {
            throw new IllegalArgumentException("CPF inválido. Formato esperado: XXX.XXX.XXX-XX");
        }
    }
    
    private static void clearInputs(RegAppt regAppt){
        regAppt.getTextName().setText("");
        regAppt.getTextCPF().setText("");
        regAppt.getTextTel().setText("");
        regAppt.getTextDate().setText("");
        regAppt.getChkIsPatient().setSelected(false);
    }
}
