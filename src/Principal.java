import java.util.*;


public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        var principal = new Principal();
        List<Avenida> avenidas = principal.inicializaDadosAvenidas();
        var engarrafamento = new Engarrafamento(avenidas);
        List<String> congestionamentos = engarrafamento.determinaAvenidaPorEngarrafamento();
        System.out.println("As avenidas por engarrafamento são: \n");

        congestionamentos.forEach(System.out::println);
    }

    public List<Avenida> inicializaDadosAvenidas() {
        return new ArrayList<>(Arrays.asList(
                new Avenida("Osório de Paiva", 7.06, 2, 81018),
                new Avenida("Aguanambi", 1.89, 2, 57113),
                new Avenida("Abolição", 2.80, 2, 48700),
                new Avenida("Borges de Melo", 2.60, 2, 48243)
        ));
    }

}