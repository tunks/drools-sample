package com.sample;

public class Applicant implements java.io.Serializable {

    private String firstName;
    private String lastName;

    private int id;
    private int requestAmount;
    private int creditScore;

    private boolean approved;

    private Action action;
    
    public Applicant() {
    }

    public Applicant(int _id, String _firstName, String _lastName, int _requestAmount, int _creditScore) {
        id = _id;
        firstName = _firstName;
        lastName = _lastName;
        requestAmount = _requestAmount;
        creditScore = _creditScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public int getRequestAmount() {
        return requestAmount;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean _approved) {
        approved = _approved;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Applicant{" + "firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", requestAmount=" + requestAmount + ", creditScore=" + creditScore + ", approved=" + approved + '}';
    }
}
