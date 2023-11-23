package base.personal.persona;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tbl_ingresopersonas")
@Data
public class Personal {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="numero")
        private long numero;
        @Column(name="Nombre")
        private String Nombre;
        @Column(name="Apellido")
        private String Apellido;
        @Column(name="Numero_de_celular")
        private int Numero_de_celular;
        @Column(name="Correo")
        private String Correo;


        public Personal(long numero) {
            this.numero = numero;
        }
}
