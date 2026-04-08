package design_pattern.behavior_design_pattern.template_method_pattern.example1;

import design_pattern.behavior_design_pattern.template_method_pattern.example1.cooker.Cooker1;
import design_pattern.behavior_design_pattern.template_method_pattern.example1.cooker.Cooker2;
import design_pattern.behavior_design_pattern.template_method_pattern.example1.cooker.Cooker3;
import design_pattern.behavior_design_pattern.template_method_pattern.example1.cooker.RamyonCooker;

public class TemplateMethodDriver {
    public static void main(String[] args) {
        RamyonCooker cooker1 = new Cooker1("구데기 요리사");
        RamyonCooker cooker2 = new Cooker2("좀 치는 요리사");
        RamyonCooker cooker3 = new Cooker3("쌉고수 요리사");

        cooker1.cook();
        cooker2.cook();
        cooker3.cook();
    }
}
