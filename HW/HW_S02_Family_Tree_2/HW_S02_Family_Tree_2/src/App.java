public class App {
    public static void main(String[] args) throws Exception {
        // Формируем дерево:
        Human G1M1 = new Human("G1M1", TypeSex.M); // G1M1 - ИМЯ человека. Его расшифровка: G1 - поколение 1, M1 - мужчина 1
        Human G1W1 = new Human("G1W1", TypeSex.W); // В файле "Java_Family tree.xlsx" изображено дерево
        Human G1M2 = new Human("G1M2", TypeSex.M);
        Human G1W2 = new Human("G1W2", TypeSex.W);
        Human G1M3 = new Human("G1M3", TypeSex.M);
        Human G1W3 = new Human("G1W3", TypeSex.W); // итого в первом поколении 3 мужчины и 3 женщины

        Human G2M1 = new Human("G2M1", TypeSex.M); // G2 - поколение 2, M1 - мужчина 1
        Human G2W1 = new Human("G2W1", TypeSex.W); 
        Human G2M2 = new Human("G2M2", TypeSex.M); 
        Human G2W2 = new Human("G2W2", TypeSex.W); 
        Human G2M3 = new Human("G2M3", TypeSex.M); 
        Human G2W3 = new Human("G2W3", TypeSex.W); 

        Human G3M1 = new Human("G3M1", TypeSex.M); 
        Human G3W1 = new Human("G3W1", TypeSex.W);        
        Human G3M2 = new Human("G3M2", TypeSex.M); 
        Human G3W2 = new Human("G3W2", TypeSex.W);  // итого в Третьем поколении 2 мужчины и 2 женщины

        // Сведений о родителях представителей первого поколения нет.
        G1M1.Children.add(G2M1);
        G1M1.Children.add(G2M2);

        G1W1.Children.add(G2M1);
        G1W1.Children.add(G2M2);

        G1M2.Children.add(G2W1);
        G1M2.Children.add(G2W2);

        G1W2.Children.add(G2W1);
        G1W2.Children.add(G2W2);

        G1M3.Children.add(G2M3);
        G1M3.Children.add(G2W3);

        G1W3.Children.add(G2M3);
        G1W3.Children.add(G2W3);
        
        
        G2M1.Dad = G1M1;
        G2M1.Mom = G1W1;
        // детей нет
        
        G2M2.Dad = G1M1;
        G2M2.Mom = G1W1;
        G2M2.Children.add(G3M1);
        G2M2.Children.add(G3M2);

        G2W1.Dad = G1M2;
        G2W1.Mom = G1W2;
        G2W1.Children.add(G3M1);
        G2W1.Children.add(G3M2);

        G2W2.Dad = G1M2;
        G2W2.Mom = G1W2;
        G2W2.Children.add(G3W1);
        G2W2.Children.add(G3W2);

        G2M3.Dad = G1M3;
        G2M3.Mom = G1W3;
        G2M3.Children.add(G3W1);
        G2M3.Children.add(G3W2);

        G2W3.Dad = G1M3;
        G2W3.Mom = G1W3;
        // детей нет

        G3M1.Dad = G2M2;
        G3M1.Mom = G2W1;
        // детей нет
        G3M2.Dad = G2M2;
        G3M2.Mom = G2W1;
        // детей нет
        G3W1.Dad = G2M3;
        G3W1.Mom = G2W2;
        // детей нет
        G3W2.Dad = G2M3;
        G3W2.Mom = G2W2;
        
        Research.getGrandfathers(G3W2);
        Research.getOffsprings(G1M2, "", 0, 2); // 2 - уровень потомка. Потомок 2-го уровня - это внук.

    }
}
