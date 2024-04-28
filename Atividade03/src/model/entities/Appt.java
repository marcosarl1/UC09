package model.entities;

import java.time.LocalDate;

public class Appt {
    
    private String patientName;
    private String cpf;
    private String tel;
    private LocalDate apptDate;
    private Boolean isPatient;
    private Boolean apptDone;
    private String prescription;

    public Appt(String patientName, String cpf, String tel, LocalDate apptDate, Boolean isPatient, Boolean apptDone, String prescription) {
        this.patientName = patientName;
        this.cpf = cpf;
        this.tel = tel;
        this.apptDate = apptDate;
        this.isPatient = isPatient;
        this.apptDone = false;
        this.prescription = "";
    }

    public String getPatientName() {
        return patientName;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTel() {
        return tel;
    }

    public LocalDate getApptDate() {
        return apptDate;
    }

    public Boolean getIsPatient() {
        return isPatient;
    }

    public Boolean getApptDone() {
        return apptDone;
    }

    public String getPrescription() {
        return prescription;
    }
}
