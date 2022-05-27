package com.company.bo_thu;

import java.util.ArrayList;

public class Thu {
    private String name_han;
    private String way_to_write;
    private boolean isThereAnyContained;
    private ArrayList<Thu>contained = new ArrayList<>();
    private String another_form_bien_the;
    private String meaning;
    private String cheating_meaning;
    public Thu(String name_han, String way_to_write, boolean isThereAnyContained, String another_form_bien_the,String meaning, String cheating_meaning) {
        this.name_han = name_han;
        this.way_to_write = way_to_write;
        this.isThereAnyContained = isThereAnyContained;
        this.another_form_bien_the = another_form_bien_the;
        this.meaning = meaning;
        this.cheating_meaning = cheating_meaning;
    }

    public String getAnother_form_bien_the() {
        return another_form_bien_the;
    }

    public void setAnother_form_bien_the(String another_form_bien_the) {
        this.another_form_bien_the = another_form_bien_the;
    }

    public void setName_han(String name_han) {
        this.name_han = name_han;
    }

    public void setWay_to_write(String way_to_write) {
        this.way_to_write = way_to_write;
    }

    public void setThereAnyContained(boolean thereAnyContained) {
        isThereAnyContained = thereAnyContained;
    }
    public String getName_han() {
        return name_han;
    }

    public String getWay_to_write() {
        return way_to_write;
    }

    public boolean isThereAnyContained() {
        return isThereAnyContained;
    }

    public ArrayList<Thu> getContained() {
        return contained;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getCheating_meaning() {
        return cheating_meaning;
    }

    public void setCheating_meaning(String cheating_meaning) {
        this.cheating_meaning = cheating_meaning;
    }

    @Override
    public String toString() {
        return name_han+"\n"+way_to_write+"\nMeaning: "+meaning+"\nHow to remember : "+((cheating_meaning!=null
        )?cheating_meaning:"");
    }
    public void showContainer(){
        if (contained.size() > 0){
            for (Thu thu:contained) {
                System.out.println("\n");
                System.out.println("Components--------------");
                System.out.println(thu.toString());
            }
        }
    }
}
