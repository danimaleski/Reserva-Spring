package movies;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;

@Data
@Entity
public class Reservas{

    private @Id String id;
    private String nome;
    private String data;
    private String horario;
    private String sala;
    //Chave única: data, horario e sala

    public Reservas() {}
    
    public String getInfo() {
    	return this.id + " " + this.nome;
    }
}
