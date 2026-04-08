package design_pattern.behavior_design_pattern.template_method_pattern.example1.cooker;

public class Cooker3 extends RamyonCooker {
    public Cooker3(String name) {
        super.name = name;
    }

    @Override
    public void boilWater() {
        System.out.println("최상급 물 끓이기");
    }

    @Override
    public void dropSoup() {
        System.out.println("최상급 스프 넣기");
    }

    @Override
    public void dropNoodles() {
        System.out.println("최상급 면발 넣기");
    }

    @Override
    public void setOnBowl() {
        System.out.println("최상급 그릇에 따르기");
    }
}