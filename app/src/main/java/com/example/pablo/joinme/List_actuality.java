package com.example.pablo.joinme;

/**
 * Created by Pablo on 14/03/2017.
 * This Class is to specify the data which will be on the content_list.xlm
 *
 */

public class List_actuality {
    // Attribut
    String place;
    String time ;
    String topic ;
    String leveltxt;
    int level ;

    // Constructor
    public List_actuality(String place,String time, String topic, int level)
    {
        this.place = place ;
        this.time = time ;
        this.topic = topic ;
        this.level = level ;
        this.leveltxt = String.valueOf(level) ;

    }
    // Getter
    public String getPlace() {return this.place ;}
    public String getTime() {return this.time ;}
    public String getTopic() {return this.topic ;}
    public int getLevel() {return this.level ;}
    public String getLeveltxt() {return this.leveltxt ;}

}
