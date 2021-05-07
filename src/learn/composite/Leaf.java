package learn.composite;

public class Leaf implements Component{
private String name;
private Double price;

public Leaf(String name, Double price) {
	this.name = name;
	this.price = price;
}

@Override
public String printPrice() {
return name+ " :"+price;
}
}
