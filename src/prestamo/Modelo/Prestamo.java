package prestamo.Modelo;
// Generated 28/07/2014 00:25:40 by Hibernate Tools 3.6.0
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Prestamo generated by hbm2java
 */
@Entity
@Table(name="prestamo"
    ,schema="prestamo"
)
public class Prestamo  implements java.io.Serializable {


     private int id;
     private Cliente cliente;
     private BigDecimal montoTotal;
     private BigDecimal interes;
     private Set<Cuota> cuotas = new HashSet<>();

    public Prestamo() {
    }

	
    public Prestamo(int id) {
        this.id = id;
    }
    public Prestamo(int id, Cliente cliente, BigDecimal montoTotal, BigDecimal interes, Set<Cuota> cuotas) {
       this.id = id;
       this.cliente = cliente;
       this.montoTotal = montoTotal;
       this.interes = interes;
       this.cuotas = cuotas;
    }
   
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_cliente")
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    @Column(name="monto_total", precision=131089, scale=0)
    public BigDecimal getMontoTotal() {
        return this.montoTotal;
    }
    
    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    
    @Column(name="interes", precision=131089, scale=0)
    public BigDecimal getInteres() {
        return this.interes;
    }
    
    public void setInteres(BigDecimal interes) {
        this.interes = interes;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="prestamo")
    public Set<Cuota> getCuotas() {
        return this.cuotas;
    }
    
    public void setCuotas(Set<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
}
