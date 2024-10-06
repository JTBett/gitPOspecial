package hva.seasons;


public class Winter extends Season {

    public Winter() {
        this.setSeasonal(0, 2);
    }

    @Override
    public Season nextSeason() {
        return new Spring();
    }

}
