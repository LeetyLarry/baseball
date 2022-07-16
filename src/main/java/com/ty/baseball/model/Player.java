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

    public Player(Builder builder) {
        this.team = builder.team;
        this.position = builder.position;
        this.age = builder.age;
        this.games = builder.games;
        this.atBats = builder.atBats;
        this.hits = builder.hr;
        this.rbi = builder.rbi;
        this.sb = builder.sb;
        this.walks = builder.walks;
        this.average = builder.average;
        this.ops = builder.ops;
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

    static class Builder {

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

        public Builder team(String team) {
            this.team = team;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder games(int games) {
            this.games = games;
            return this;
        }

        public Builder atBats(int atBats) {
            this.atBats = atBats;
            return this;
        }

        public Builder hits(int hits) {
            this.hits = hits;
            return this;
        }

        public Builder hr(int hr) {
            this.hr = hr;
            return this;
        }

        public Builder rbi(int rbi) {
            this.rbi = rbi;
            return this;
        }

        public Builder sb(int sb) {
            this.sb = sb;
            return this;
        }

        public Builder walks(int walks) {
            this.walks = walks;
            return this;
        }

        public Builder avg(double average) {
            this.average = average;
            return this;
        }

        public Builder ops(double ops) {
            this.ops = ops;
            return this;
        }

        public Player Build() {
            return new Player(this);
        }
    }
}
