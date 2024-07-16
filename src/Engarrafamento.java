
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Engarrafamento {
    private List<Avenida> avenidas;

    public Engarrafamento(List<Avenida> avenidas) {
        this.avenidas = avenidas;
    }

    public double calculaEngarrafamentos(Avenida avenida) {
        var engarrafamento =  ((double) avenida.getNumeroVeiculos() / avenida.getQuantidadePistas()) * 5.5;
        return engarrafamento / avenida.getTamanho();
    }

   /* public List<Avenida> determinaAvenidaPorEngarrafamento() {
        return avenidas.stream()
                .sorted((avenida1, avenida2) -> {
                    var engarrafamentoAvenida1 = calculaEngarrafamentos(avenida1);
                    var engarrafamentoAvenida2 = calculaEngarrafamentos(avenida2);
                    return Double.compare(engarrafamentoAvenida2, engarrafamentoAvenida1);
                }).collect(Collectors.toList());
    } */

    public List<String> determinaAvenidaPorEngarrafamento() {
        return avenidas.stream()
                .sorted(Comparator.comparingDouble(this::calculaEngarrafamentos))
                .map(Avenida::getNome)
                .collect(Collectors.toList());
    }
}
