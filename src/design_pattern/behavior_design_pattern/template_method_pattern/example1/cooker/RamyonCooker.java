package design_pattern.behavior_design_pattern.template_method_pattern.example1.cooker;

public abstract class RamyonCooker {
    protected String name;

    protected abstract void boilWater();

    protected abstract void dropSoup();

    protected abstract void dropNoodles();

    protected abstract void setOnBowl();

    public final void cook() {
        System.out.printf("%s가 라면을 요리합니다.\n", name);
        boilWater();
        dropSoup();
        dropNoodles();
        setOnBowl();
        System.out.println();
    }
}