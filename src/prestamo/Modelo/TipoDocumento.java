package prestamo.Modelo;
// Generated Jul 15, 2014 5:35:39 PM by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TipoDocumento generated by hbm2java
 */
@Entity
@Table(name="tipo_documento"
    ,schema="prestamo"
)
public class TipoDocumento  implements java.io.Serializable {


     private int id;
     private String descripcion;

    public TipoDocumento() {
    }

	
    public TipoDocumento(int id) {
        this.id = id;
    }
    public TipoDocumento(int id, String descripcion) {
       this.id = id;
       this.descripcion = descripcion;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="descripcion")
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


