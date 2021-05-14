package ua.tqs.QualidadeAr;

import java.util.Objects;

public class Cidade {
    private String name;
    private String state;
    private String country;

    private Coords coords;

    public Cidade(String name, String state, String country, Coords coords){
        this.name = name;
        this.state = state;
        this.country = country;
        this.coords = coords;
    }

    public Cidade copy(){
        return new Cidade(name, state, country,
                coords);
    }

    @Override
    public boolean equals(Object cidade2) {
        if (this == cidade2) return true;
        if (cidade2 == null || getClass() != cidade2.getClass()) return false;
        Cidade cidade = (Cidade) cidade2;
        return name.equals(cidade.name) &&
                state.equals(cidade.state) &&
                country.equals(cidade.country) &&
                coords.equals(cidade.coords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, state, country, coords);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }
}
