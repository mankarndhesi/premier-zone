package com.premierleague.premier_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
    This is our Entity class -> entities represent data models in your application
    They map directly to database tables
 */

// This class is no mapped to table called Player ->
// We do not have a table called Player but we have "player_stats"

@Entity
@Table(name="player_stat")
public class Player {
    @Id
    @Column(name ="player_name", unique = true)
    private String player_name; // Unique Identifier
    private String nation;
    private String position;
    private Integer age; // We like using Integer because it can stay null...
    private Integer matches_played;
    private Integer starts;
    private Double minutes_played;
    private Double goals;
    private Double assists;
    private Double penalties_scored;
    private Double yellow_cards;
    private Double red_cards;
    private Double expected_goals;
    private Double expected_assists;
    private String team_name;

    public Player() {

    }

    public Player(Double expected_goals, Double expected_assists, Double assists, Integer age, Double goals, Integer matches_played, Double minutes_played, String nation, Double penalties_scored, String player_name, String position, Double red_cards, Integer starts, String team_name, Double yellow_cards) {
        this.expected_goals = expected_goals;
        this.expected_assists = expected_assists;
        this.assists = assists;
        this.age = age;
        this.goals = goals;
        this.matches_played = matches_played;
        this.minutes_played = minutes_played;
        this.nation = nation;
        this.penalties_scored = penalties_scored;
        this.player_name = player_name;
        this.position = position;
        this.red_cards = red_cards;
        this.starts = starts;
        this.team_name = team_name;
        this.yellow_cards = yellow_cards;
    }

    public Player (String name) {
        this.player_name = name;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMatches_played() {
        return matches_played;
    }

    public void setMatches_played(Integer matches_played) {
        this.matches_played = matches_played;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMinutes_played() {
        return minutes_played;
    }

    public void setMinutes_played(Double minutes_played) {
        this.minutes_played = minutes_played;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public Double getPenalties_scored() {
        return penalties_scored;
    }

    public void setPenalties_scored(Double penalties_scored) {
        this.penalties_scored = penalties_scored;
    }

    public Double getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(Double yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public Double getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(Double red_cards) {
        this.red_cards = red_cards;
    }

    public Double getExpected_goals() {
        return expected_goals;
    }

    public void setExpected_goals(Double expected_goals) {
        this.expected_goals = expected_goals;
    }

    public Double getExpected_assists() {
        return expected_assists;
    }

    public void setExpected_assists(Double expected_assists) {
        this.expected_assists = expected_assists;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
}
