package model.cards;


import model.Prototype;
import model.cards.monstercards.MonsterCard;

//abstract class card
public abstract class Card implements Prototype {
    protected String name;
    protected String description;
    protected int price;
    protected boolean isHidden;
    protected Location location;
    protected String type;

    public Card(String name, String description,int price) {
        setName(name);
        setDescription(description);
        setPrice(price);
    }

    public Card(String name, String description, boolean isHidden, Location location, int price) {
        setName(name);
        setDescription(description);
        setHidden(isHidden);
        setLocation(location);
        setPrice(price);
    }

    public abstract void action(MonsterCard monster);

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Location getLocation() {
        return location;
    }


    public int getPrice() {
        return price;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public abstract Object clone();
}
