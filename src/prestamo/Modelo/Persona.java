package prestamo.Modelo;
// Generated Jul 15, 2014 5:35:39 PM by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Persona generated by hbm2java
 */
@Entity
@Table(name="persona"
    ,schema="prestamo"
)
@Inheritance(strategy=InheritanceType.JOINED)
public class Persona  implements java.io.Serializable {


     private int id;
     protected String apellido;
     protected String nombre;
     private Integer numeroDocumento;
     private TipoDocumento tipoDocumento;
     private Direccion direccion;
     private Date fechaNacimiento;
     private String nacionalidad;

    public Persona() {
    }

    public Persona(String apellido, String nombre, Integer numeroDocumento, TipoDocumento tipoDocumento, Direccion direccion) {
       this.apellido = apellido;
       this.nombre = nombre;
       this.numeroDocumento = numeroDocumento;
       this.tipoDocumento = tipoDocumento;
       this.direccion = direccion;
    }
   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="apellido", nullable = false)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    @Column(name="nombre", nullable = false )
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="numero_documento")
    public Integer getNumeroDocumento() {
        return this.numeroDocumento;
    }
    
    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_tipo_documento")
    public TipoDocumento getTipoDocumento() {
        return this.tipoDocumento;
    }
    
    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_direccion")
    public Direccion getDireccion() {
        return this.direccion;
    }

    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_nacimiento", length=29)
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Column(name="nacionalidad")
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    @Column(name="telefono")
    public String getTelefono() {
        return this.nacionalidad;
    }
}
