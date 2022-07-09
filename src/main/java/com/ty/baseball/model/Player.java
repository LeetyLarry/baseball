package com.ty.baseball.model;

public class Player {

    private String name;
    private String team;
    private String pos;
    private int age;
    private int gamesPlayed;
    private int atBats;
    private int runs;
    private int hits;
    private int homeRuns;
    private int rbis;
    private int stolenBases;
    private int walks;
    private double battingAverage;
    private double ops;

    public Player() {

    }

    public Player(String name, String team, String pos, int age, int gamesPlayed, int atBats, int runs, int hits,
                  int homeRuns, int rbis, int stolenBases, int walks, double battingAverage, double ops) {
        this.name = name;
        this.team = team;
        this.pos = pos;
        this.age = age;
        this.gamesPlayed = gamesPlayed;
        this.atBats = atBats;
        this.runs = runs;
        this.hits = hits;
        this.homeRuns = homeRuns;
        this.rbis = rbis;
        this.stolenBases = stolenBases;
        this.walks = walks;
        this.battingAverage = battingAverage;
        this.ops = ops;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getRbis() {
        return rbis;
    }

    public void setRbis(int rbis) {
        this.rbis = rbis;
    }

    public int getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public double getOps() {
        return ops;
    }

    public void setOps(double ops) {
        this.ops = ops;
    }
}
