package design_pattern.behavior_design_pattern.template_method_pattern.example1.cooker;

public class Cooker1 extends RamyonCooker {
    public Cooker1(String name) {
        super.name = name;
    }

    @Override
    public void boilWater() {
        System.out.println("물 엉망으로 끓이기");
    }

    @Override
    public void dropSoup() {
        System.out.println("스프 다 쳐흘리기");
    }

    @Override
    public void dropNoodles() {
        System.out.println("면발 다 쳐흘리기");
    }

    @Override
    public void setOnBowl() {
        System.out.println("국물 따르다가 주변에 다 쳐흘리기");
    }
}
