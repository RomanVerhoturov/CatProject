
public class Cat
{
    private Double originWeight;
    private Double weight;

    private Double minWeight = 1000.0;
    private Double maxWeight = 9000.0;

    private Double eat= 0.0;

    private static int count = 0;



    public Cat()
    {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(double inWeigh){
        weight = inWeigh;
        originWeight= weight;

        count ++;

    }

    private void setWeight(double inweight){

        if(weight>minWeight && weight<maxWeight){
            weight += inweight;
            if(getStatus() =="Dead" || getStatus() == "Exploded"){
                count --;
            }
        }


    }




    public static int getCount(){
        return count;
    }

    public void setOriginWeight(double value){
        if(value>minWeight && value<maxWeight){
            originWeight = value;
        }
    }


    public void meow()
    {
        setWeight(-200.0);
        System.out.println("Meow");

    }

    public void feed(Double amount)
    {
        setWeight(amount);
        eat += amount;
    }

    public void drink(Double amount)
    {
        setWeight(amount);
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public double getEat(){
        return eat;
    }

    public void goTual() {
        setWeight(-50.0);
}
}