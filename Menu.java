/**
 * Daniel
 */
public class Menu {

    public static void main(String args []){
        Lista l = new Lista();

        l.insert_element_at_end("Ambar");
        l.insert_element_at_end("Buro");
        l.insert_element_at_end("Cero");
        l.insert_element_at_end("Diodo");
        l.insert_element_at_end("Esfinge");
        l.insert_element_at_end("Flor");
        l.insert_start("Jalea");

        l.showList();

        System.out.println();
        l.delete_start ();
        l.showList();

        System.out.println();
        System.out.println(l.extract_start());
        l.showList();

    }

}


