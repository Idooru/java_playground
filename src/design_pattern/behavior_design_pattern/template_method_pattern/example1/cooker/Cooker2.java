package design_pattern.behavior_design_pattern.template_method_pattern.example1.cooker;

public class Cooker2 extends RamyonCooker {
    public Cooker2(String name) {
        super.name = name;
    }

    @Override
    public void boilWater() {
        System.out.println("물 알잘딱 끓이기");
    }

    @Override
    public void dropSoup() {
        System.out.println("스프 한방울도 안흘리고 넣기");
    }

    @Override
    public void dropNoodles() {
        System.out.println("면발 한개도 안흘리고 넣기");
    }

    @Override
    public void setOnBowl() {
        System.out.println("먹음직스럽게 따르기");
    }
}