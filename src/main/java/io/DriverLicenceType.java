package io;

public enum DriverLicenceType {
    C1,
    A1,
    A2,
    A3,
    B1,
    B2,
    C2,
    C3,
    C4,
    D,
    E,
    F,
    M,
    N,
    P;

    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
