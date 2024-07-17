
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

    public List<String> determinaAvenidaPorEngarrafamento() {
        return avenidas.stream()
                .sorted(Comparator.comparingDouble(this::calculaEngarrafamentos))
                .map(avenida -> {
                    double congestionamento = calculaEngarrafamentos(avenida);
                    return "" + avenida.getNome() + " " + (int) congestionamento;
                }
                )
                .collect(Collectors.toList());
    }
}
