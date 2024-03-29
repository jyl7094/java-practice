/*
Create a simple interface that allows an object to be saved to some sort of storage medium.

Implement the following:

1.  ISaveable (interface)

    -  It has two methods:

        -  write(), takes no arguments and returns a List containing objects of type String.

        -  read(), takes a List of type String and doesn't return anything.

2.  Player (class)

    -  It has four fields. Two Strings called name and weapon. Two ints called hitPoints and strength.

    -  A constructor that accepts a String (name) and two ints (hitPoints and strength). It initialises name, hitPoints and strength with the newly passed in values. It initialises weapon with the default weapon "Sword".

    -  And eleven methods:

        -  Getters and setters for all four fields.

        -  write(), same as interface. Return a List of the fields in the order they appear in toString().

        -  read(), same as interface. Store the values in the List, in the order they appear in toString(). Make sure the List is not null and the size() is greater than 0 before storing the values.

        -  toString(), Players overriding toString() method. It takes no arguments and returns a String in the following format:

Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}

3.  Monster (class)

    -  It has three fields. One String called name and Two ints called hitPoints and strength.

    -  A constructor that accepts a String (name) and two ints (hitPoints and strength). It initialises name, hitPoints and strength with the newly passed in values.

    -  And six methods:

        -  Only getters for the three fields.

        -  write(), same as interface. Return a List of the fields in the order they appear in toString().

        -  read(), same as interface. Store the values in the List, in the order they appear in toString(). Make sure the List is not null and the size() is greater than 0 before storing the values.

        -  toString(), Monsters overriding toString() method. It takes no arguments and returns a String in the following format:

Monster{name='Werewolf', hitPoints=20, strength=40}

TIP:  Player and Monster need to implement ISaveable.

TIP:  Be extremely careful with the spelling of the names of the fields, constructors and methods.

TIP:  Be extremely careful about spaces and spelling in the returned String from the toString() method.

NOTE:  All fields are private.

NOTE:  Both constructors are public.

NOTE:  All methods are public. 

NOTE:  There are no static members.

NOTE:  Do not add a main method to the solution code.

NOTE:  If you get an error from the Evaluate class, it's most likely the constructor. Check if you've added a constructor or if the constructor has the right arguments.
*/

import java.util.List;
import java.util.ArrayList;

public class Player implements ISaveable {
    private String name, weapon;
    private int hitPoints, strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return this.name;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public List<String> write() {
        List<String> list = new ArrayList<String>();
        list.add(this.name);
        list.add(String.valueOf(this.hitPoints));
        list.add(String.valueOf(this.strength));
        list.add(this.weapon);
        return list;
    }

    public void read(List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.name = list.get(0);
        this.hitPoints = Integer.parseInt(list.get(1));
        this.strength = Integer.parseInt(list.get(2));
        this.weapon = list.get(3);
    }

    @Override
    public String toString() {
        return "Player{name='" + this.name + "', hitPoints=" + this.hitPoints + ", strength=" + this.strength + ", weapon='" + this.weapon + "'}";
    }
}
