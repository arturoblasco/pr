package ud05;

public class Anexo3Casting {

    public static void main(String[] args) {
        // Casting Implicito
        Persona encargadoCarniceria = new Encargado("Rosa Ramos", 1200,
                "Carniceria");

        // No tenemos disponibles los m�todos de la clase Encargado:
        //encargadoCarniceria.setSueldoBase(1200);
        //encargadoCarniceria.setSeccion("Carniceria");
        //Pero al imprimir se imprime con el m�todo m�s espec�fico (luego lo vemos)
        System.out.println(encargadoCarniceria.toString());

        // Casting Explicito
        Encargado miEncargado = (Encargado) encargadoCarniceria;
        
        System.out.println("sueldo: " + miEncargado.getSueldo());
        //Tenemos disponibles los m�todos de la clase Encargado:       
        miEncargado.setSueldoBase(1200);
        miEncargado.setSeccion("Carniceria");
        //Al imprimir se imprime con el m�todo m�s espec�fico de nuevo.
        System.out.println(miEncargado);
    }
} 
