package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String dogSay;
    public Dog(String dogSay) {
        this.dogSay = dogSay;
    }

    @Override
    void voice() {
        System.out.println(dogSay);
    }
    @Override
    public String toString() {
        return "I'm dog";
    }
}
