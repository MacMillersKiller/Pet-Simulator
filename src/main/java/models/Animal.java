package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//Possible Interface for extenstion
public interface Animal {

    public Long eat(Food food);

}
