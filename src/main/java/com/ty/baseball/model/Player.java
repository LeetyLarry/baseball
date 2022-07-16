package com.ty.baseball.model;

public class Player {

    public Player() {

    }

    public Player(String team, String position, int age, int games, int atBats,
                  int hits, int hr, int rbi, int sb, int walks, double average, double ops) {
        this.team = team;
        this.position = position;
        this.age = age;
        this.games = games;
        this.atBats = atBats;
        this.hits = hits;
        this.hr = hr;
        this.rbi = rbi;
        this.sb = sb;
        this.walks = walks;
        this.average = average;
        this.ops = ops;
    }

    private String team;
    private String position;
    private int age;
    private int games;
    private int atBats;
    private int hits;
    private int hr;
    private int rbi;
    private int sb;
    private int walks;

    private double average;
    private double ops;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getRbi() {
        return rbi;
    }

    public void setRbi(int rbi) {
        this.rbi = rbi;
    }

    public int getSb() {
        return sb;
    }

    public void setSb(int sb) {
        this.sb = sb;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getOps() {
        return ops;
    }

    public void setOps(double ops) {
        this.ops = ops;
    }
}
