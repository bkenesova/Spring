package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String catSay;

    public Cat(String catSay) {
        this.catSay = catSay;
    }

    @Override
    public String toString() {
        return "Im a Cat, мяу";
    }

    @Override
    void voice() {
        System.out.println(catSay);
    }
}
