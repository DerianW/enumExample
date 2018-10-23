package enumExample;

public enum Colors {

    WET_ASPHALT(52, 73, 94), MIDNIGHT_BLUE(44, 62, 80);

    private final int r, g, b;

    private Colors(final int r, final int g, final int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getRed() {
        return r;
    }
}
