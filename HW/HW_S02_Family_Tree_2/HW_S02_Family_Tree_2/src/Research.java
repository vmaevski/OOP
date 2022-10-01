public class Research {
    static void  getGrandfathers(Human h){
        if (h.Dad != null && h.Dad.Dad != null) {
                System.out.println(h.Dad.Dad.getName());            
        } else{
            System.out.println("no information about paternal grandfather");
        }
        if (h.Mom != null && h.Mom.Dad != null) {
            System.out.println(h.Mom.Dad.getName());            
        } else{
            System.out.println("no information about maternal grandfather");
        }
    }

    static void  getGrandmothers(Human h){
        if (h.Dad != null && h.Dad.Mom != null) {
                System.out.println(h.Dad.Mom.getName());            
        } else{
            System.out.println("no information about paternal grandmother");
        }
        if (h.Mom != null && h.Mom.Mom != null) {
            System.out.println(h.Mom.Mom.getName());            
        } else{
            System.out.println("no information about maternal grandmother");
        }
    }

    static void getChildren(Human h){
        if (!h.Children.isEmpty()) {
            for (Human Child : h.Children) {
                System.out.println(Child.getName());
            }
        } else{
            System.out.println("No Children.");
        }
    }

    static void getOffsprings(Human h, String str){
        System.out.printf("%sПотомки %s:\n", str, h.getName());
        if (h.Children.isEmpty()) {
            System.out.printf("%sx %s не имеет детей.\n", str, h.getName());
        }else{
            str += " - ";
            for (Human Child : h.Children) {
                System.out.printf("%s%s\n", str, Child.getName());
                getOffsprings(Child, str);
            }
        }
    }

    static void getOffsprings(Human h, String str, int countLevel, int level){ 
        if ((h.Children.isEmpty()) || (countLevel > level)) {
            if (h.Children.isEmpty()){
            }
            if (countLevel > level) {
                System.out.printf("level = %d", level);
            }
        }else{
            str += " - ";
            countLevel++;
            for (Human Child : h.Children) {
                if (countLevel == level){
                    System.out.printf("%s%s\n", str, Child.getName());
                }
                getOffsprings(Child, str, countLevel, level);
            }
        }
    }
}    
