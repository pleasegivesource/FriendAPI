package org.utilitymods.friendapi;

public class ProfileData {

    public final String alias;

    public final Integer kills;

    public ProfileData(String alias, Integer kills) {
        this.alias = alias;
        this.kills = kills;
    }

    @Override
    public String toString() {
        return "Alias: " + alias + "\n" + "Kills: " + kills + "\n";
    }

}
