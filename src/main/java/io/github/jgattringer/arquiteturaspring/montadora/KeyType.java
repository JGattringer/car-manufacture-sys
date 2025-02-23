package io.github.jgattringer.arquiteturaspring.montadora;

public class KeyType {
    private ManufacturedBy manufacturedBy;
    private String typeOfKey;

    public ManufacturedBy getManufacturedBy() {
        return manufacturedBy;
    }

    public void setManufacturedBy(ManufacturedBy manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    public String getTypeOfKey() {
        return typeOfKey;
    }

    public void setTypeOfKey(String typeOfKey) {
        this.typeOfKey = typeOfKey;
    }
}
