package devices;

public class Car {
    String model;
    String producer;
    Integer yearOfProduction = 0;
    Integer age = 2021 - yearOfProduction;
    Integer value;

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getValue() {
        return value;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
        this.age = 2021 - yearOfProduction;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String toString(){
        return model + " " + producer + " " + yearOfProduction + " " + age + " " + value;
    }
}
