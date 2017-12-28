package com.org.io;

import java.util.prefs.Preferences;

public class PerferencesDemo {
    public static void main(String[] args) throws Exception {
        Preferences pref = Preferences.userNodeForPackage(PerferencesDemo.class);
        pref.put("Location", "Oz");
        pref.put("Footwear", "Ruby Slippers");
        pref.putInt("Companions", 4);
        pref.putBoolean("Are there witches?", true);
        int usageCount = pref.getInt("UsageCount", 0);
        usageCount++;
        System.out.println("usageCount:"+usageCount);
        for (String keys : pref.keys()) {
            System.out.println(keys + ":" + pref.get(keys, null));
        }
        System.out.println("How many companions does Dorothy have?" + pref.getInt("Companions",0));
    }
}
