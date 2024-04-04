package Principal;
import com.mycompany.ejerciciojava011.SuperHeroe;


public class Principal {

    private static Object sup2;
    public static void main (String[]args){
    SuperHeroe sup1 = new SuperHeroe("Spiderman");
    SuperHeroe sup2= new SuperHeroe("Mujer Maravilla");
    SuperHeroe sup3= new SuperHeroe("Super Man");
       sup1.setNombre("Hombre Araña");
       sup1.setDescripcion("Viste de rojo y azul, y vota telarañas");
       sup2.setNombre("Mujer Maravilla");
       sup2.setDescripcion("Usa brazaletes indestructibles, acompañada de una vestimenta de falda con una blusa color rojo y bordes de oro");
       sup2.setCapa(true);
       sup3.setNombre("Super Man");
       sup3.setDescripcion("Usa mallas azules, acompañado de un logo, puede volar y su principal debilidad es la cryptonita");
       
               
        System.out.println(sup1.getNombre());
        System.out.println(sup1.getDescripcion());
        
        System.out.println(sup1.toString());
        System.out.println("Mujer Maravilla");
        sup2.setDescripcion("Tiene los poderes de fuerza, volar y esquivar balas.");
        sup2.setCapa(true);
        sup3.setNombre("Super Man");
        sup3.setDescripcion("Tiene el poder de super vision, aliento humano, curacion rapida, volar, super fuerza, agilidad y reflejos");
        sup3.setCapa(true);
        
        
        
        System.out.println(sup2.toString());
        System.out.println(sup3.toString());
    }
}
