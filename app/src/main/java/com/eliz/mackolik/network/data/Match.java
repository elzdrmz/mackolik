package com.eliz.mackolik.network.data;

import com.eliz.mackolik.app.data.MatchBO;

/*
{
                "id": 3161474,
                "date_time_utc": "2019-10-03 14:50:00",
                "match_time": "14:50",
                "status": "Played",
                "fts_A": 1,
                "fts_B": 2,
                "hts_A": 0,
                "hts_B": 1,
                "team_A": {
                    "id": 13104,
                    "uuid": "8hluxv5afo5yejrtl36naq9uv",
                    "name": "Astana",
                    "tla_name": "AST",
                    "display_name": "Astana"
                },
                "team_B": {
                    "id": 1943,
                    "uuid": "c0d1qca7kz0fi0ypx7aw4nusc",
                    "name": "Partizan",
                    "tla_name": "PAR",
                    "display_name": "Partizan"
                },
                "extras": {
                    "iddaa_code": 21103,
                    "iddaa_live": false
                }
            }
 */
public class Match {

    private Long id;
    private Integer fts_A;
    private Integer fts_B;
    private Team team_A;
    private Team team_B;

    public Match(Long id, Integer fts_A, Integer fts_B, Team team_A, Team team_B) {
        this.id = id;
        this.fts_A = fts_A;
        this.fts_B = fts_B;
        this.team_A = team_A;
        this.team_B = team_B;
    }

    public MatchBO toDomainModel() {
        return new MatchBO(
            this.id,
            this.fts_A,
            this.fts_B,
            this.team_A,
            this.team_B
        );
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
}
