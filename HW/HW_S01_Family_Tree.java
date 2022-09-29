// Реализовать, с учетом ооп подхода, приложение
// Для проведения исследований с генеалогическим древом.
// Идея: описать некоторое количество компонент, например:
// - модель человека
// - компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про разные отношения
// - компонент для проведения исследований
// - дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл,

// получение\построение отдельных моделей человека.
// Под “проведением исследования” можно понимать получение всех детей выбранного человека.

import java.util.ArrayList;
import java.util.jar.Manifest;

public class HW_S01_Family_Tree {
    public static void main(String[] args) {

        human G1M1 = new human("G1M1", "m"); // G1 - поколение 1, M1 - мужчина 1
        human G1W1 = new human("G1W1", "w"); 
        human G1M2 = new human("G1M2", "m");
        human G1W2 = new human("G1W2", "w");
        human G1M3 = new human("G1M3", "m");
        human G1W3 = new human("G1W3", "w"); // итого в первом поколении 3 мужчины и 3 женщины

        human G2M1 = new human("G2M1", "m"); // G2 - поколение 2, M1 - мужчина 1
        human G2W1 = new human("G2W1", "w"); 
        human G2M2 = new human("G2M2", "m"); 
        human G2W2 = new human("G2W2", "w"); 
        human G2M3 = new human("G2M3", "m"); 
        human G2W3 = new human("G2W3", "w"); 

        human G3M1 = new human("G3M1", "m"); 
        human G3W1 = new human("G3W1", "w");        
        human G3M2 = new human("G3M2", "m"); 
        human G3W2 = new human("G3W2", "w");  // итого в Третьем поколении 2 мужчины и 2 женщины

        // Сведений о родителях представителей первого поколения нет.
        G1M1.children.add(G2M1);
        G1M1.children.add(G2M2);

        G1W1.children.add(G2M1);
        G1W1.children.add(G2M2);

        G1M2.children.add(G2W1);
        G1M2.children.add(G2W2);

        G1W2.children.add(G2W1);
        G1W2.children.add(G2W2);

        G1M3.children.add(G2M3);
        G1M3.children.add(G2W3);

        G1W3.children.add(G2M3);
        G1W3.children.add(G2W3);
        
        
        G2M1.dad = G1M1;
        G2M1.mom = G1W1;
        // детей нет
        
        G2M2.dad = G1M1;
        G2M2.mom = G1W1;
        G2M2.children.add(G3M1);
        G2M2.children.add(G3M2);

        G2W1.dad = G1M2;
        G2W1.mom = G1W2;
        G2W1.children.add(G3M1);
        G2W1.children.add(G3M2);

        G2W2.dad = G1M2;
        G2W2.mom = G1W2;
        G2W2.children.add(G3W1);
        G2W2.children.add(G3W2);

        G2M3.dad = G1M3;
        G2M3.mom = G1W3;
        G2M3.children.add(G3W1);
        G2M3.children.add(G3W2);

        G2W3.dad = G1M3;
        G2W3.mom = G1W3;
        // детей нет

        G3M1.dad = G2M2;
        G3M1.mom = G2W1;
        // детей нет
        G3M2.dad = G2M2;
        G3M2.mom = G2W1;
        // детей нет
        G3W1.dad = G2M3;
        G3W1.mom = G2W2;
        // детей нет
        G3W2.dad = G2M3;
        G3W2.mom = G2W2;
        // детей нет    
        
        research.get_grandmothers(G3W2);
        research.get_grandmothers(G2M3);
        research.get_grandmothers(G1M1);

        research.get_children(G1M1);
        
        research.get_offsprings(G1M2, "");


    }
    
}
/**
 * Исследования
 */
class research {
    static void  get_grandmothers(human h){
        if (h.dad != null && h.dad.mom != null) {
                System.out.println(h.dad.mom.name);            
        } else{
            System.out.println("no information about paternal grandmother");
        }
        if (h.mom != null && h.mom.mom != null) {
            System.out.println(h.mom.mom.name);            
        } else{
            System.out.println("no information about maternal grandmother");
        }
    }

    static void get_children(human h){
        if (!h.children.isEmpty()) {
            for (human child : h.children) {
                System.out.println(child.name);
            }
        } else{
            System.out.println("No children.");
        }
    }

    static void get_offsprings(human h, String str){
        System.out.printf("%sПотомки %s:\n", str, h.name);
        if (h.children.isEmpty()) {
            System.out.printf("%sx %s не имеет детей.\n", str, h.name);
        }else{
            str += " - ";
            for (human child : h.children) {
                System.out.printf("%s%s\n", str, child.name);
                get_offsprings(child, str);
            }
        }
    }
}

/**
 * HW_S01_Family_Tree
 */
class human {
    public human(String n, String s){
        name = n;
        sex = s;
    }
    String name;
    String sex;
    human mom;
    human dad;
    ArrayList<human> children = new ArrayList<human>();

}