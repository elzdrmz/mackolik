package com.eliz.mackolik.network.data;

public class Team {

    private String display_name;

    public Team(String display_name) {
        this.display_name = display_name;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "display_name='" + display_name + '\'' +
                '}';
    }
}
