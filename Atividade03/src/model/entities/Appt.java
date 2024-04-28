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

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public LocalDate getApptDate() {
        return apptDate;
    }

    public void setApptDate(LocalDate apptDate) {
        this.apptDate = apptDate;
    }

    public Boolean getIsPatient() {
        return isPatient;
    }

    public void setIsPatient(Boolean isPatient) {
        this.isPatient = isPatient;
    }

    public Boolean getApptDone() {
        return apptDone;
    }

    public void setApptDone(Boolean apptDone) {
        this.apptDone = apptDone;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}
