public enum GroceryType {
    SNUFF("Snus"),
    MILK("Mjölk"),
    ERERGY_DRINK("Energidryck");

    private final String label;

    GroceryType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
