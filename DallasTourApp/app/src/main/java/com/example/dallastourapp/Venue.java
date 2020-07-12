package com.example.dallastourapp;

public class Venue  {
    private String name;
    private String location;
    private String explanation;
    private int imageResourceId;

    Venue (String name, String location, String explanation, int imageResourceId){
        this.name = name;
        this.location =location;
        this.explanation =explanation;
        this.imageResourceId =imageResourceId;
    }
     public String getName (){return name;}
            String getLocation(){return location;}
            String getExplanation(){return explanation;}

            int getImageResourceId(){return imageResourceId;}


      @Override
     public  String toString(){
         return "Place{" +
                 "name='"+ name + '\'' +
                 "location'" + location + '\'' +
                 ",explanation'" + explanation + '\''+
                 ",imageResourceId=" + imageResourceId +
                 '}';
      }

}
