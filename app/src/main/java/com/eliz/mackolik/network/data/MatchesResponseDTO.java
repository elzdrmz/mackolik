package com.eliz.mackolik.network.data;

import java.util.List;

/*
{
    "name": "Avrupa Ligi",
    "format": "International cup",
    "date": "2019-10-03 14:50:00",
    "matches": [
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
            },
 */
public class MatchesResponseDTO {

    public String date;
    public List<Match> matches;
}
