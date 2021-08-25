package com.eliz.mackolik.app.data;

import com.eliz.mackolik.network.data.Team;

public class MatchBO {

    private Long id;
    private Integer fts_A;
    private Integer fts_B;
    private Team team_A;
    private Team team_B;

    public MatchBO(Long id, Integer fts_A, Integer fts_B, Team team_A, Team team_B) {
        this.id = id;
        this.fts_A = fts_A;
        this.fts_B = fts_B;
        this.team_A = team_A;
        this.team_B = team_B;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFts_A() {
        return fts_A;
    }

    public void setFts_A(Integer fts_A) {
        this.fts_A = fts_A;
    }

    public Integer getFts_B() {
        return fts_B;
    }

    public void setFts_B(Integer fts_B) {
        this.fts_B = fts_B;
    }

    public Team getTeam_A() {
        return team_A;
    }

    public void setTeam_A(Team team_A) {
        this.team_A = team_A;
    }

    public Team getTeam_B() {
        return team_B;
    }

    public void setTeam_B(Team team_B) {
        this.team_B = team_B;
    }

    @Override
    public String toString() {
        return "MatchBO{" +
                "id=" + id +
                ", fts_A=" + fts_A +
                ", fts_B=" + fts_B +
                ", team_A=" + team_A +
                ", team_B=" + team_B +
                "}\n";
    }
}
