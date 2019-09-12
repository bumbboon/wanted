package com.bumbuboon.wanted;

public class Bounty {

    private int bounty;
    private String bountyName;

    public Bounty(int bounty) {
        this.bounty = bounty;
    }

    public int getBounty() {
        return bounty;
    }

    public void setBounty(int Bounty) {
        this.bounty = bounty;
    }

    public String getBountyName() {
        return bountyName;
    }

    public void setBountyName(String bountyName) {
        this.bountyName = bountyName;
    }

}