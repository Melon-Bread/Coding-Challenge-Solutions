class SpaceAge {

    private double seconds = 0;
    private int earthYear = 31557600;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double onEarth() {
        return seconds / earthYear;
    }

    double onMercury() {
        return seconds / (earthYear * 0.2408467);
    }

    double onVenus() {
        return seconds / (earthYear * 0.61519726);
    }

    double onMars() {
        return seconds / (earthYear * 1.8808158);
    }

    double onJupiter() {
        return seconds / (earthYear * 11.862615);
    }

    double onSaturn() {
        return seconds / (earthYear * 29.447498);
    }

    double onUranus() {
        return seconds / (earthYear * 84.016846);
    }

    double onNeptune() {
        return seconds / (earthYear * 164.79132 );
    }

}
