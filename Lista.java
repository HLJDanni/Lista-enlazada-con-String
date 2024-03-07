public class Lista {

    Nodo inicio;
    Nodo fin;

    public Lista(){
        inicio = null;
        fin = null;


    }  
    public void insert_start(String dato){
        Nodo nuevo = new Nodo (dato, inicio);
           inicio = nuevo;
           if(fin== null)
               fin = inicio;

    }

    public void insert_element_at_end (String dato){
     Nodo nuevo = new Nodo (dato, null);
     if (inicio == null){
         fin= nuevo;
         inicio = fin;
     } else {
         fin.setSiguiente(nuevo);
         fin = nuevo;
     }

    }

    public void delete_start(){
        inicio = inicio.siguiente;
    }

    public String extract_start(){
        String dato = inicio.getDato();
        inicio = inicio.getSiguiente();
        if(inicio == null){
            fin = null;
        }
        return dato;
    }



    public void showList(){
        Nodo temp = inicio;

        while(temp != null){
            System.out.println(temp.getDato());
            temp = temp.siguiente;
        }

    }
}
