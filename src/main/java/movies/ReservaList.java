package movies;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class ReservaList{

    private @Id String id;
    private String nome;
    private String data;
    private int horario;
    private String sala;

    public ReservaList(String id, String nome, String data, int horario, String sala) {
        this.nome = nome;
        this.data = data;
        this.horario = horario;
        this.sala = sala;
    }
}
