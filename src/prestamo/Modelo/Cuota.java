package prestamo.Modelo;
// Generated 28/07/2014 00:25:40 by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Cuota generated by hbm2java
 */
@Entity
@Table(name="cuota"
    ,schema="prestamo"
)
public class Cuota  implements java.io.Serializable {


     private int id;
     private Prestamo prestamo;
     private Integer numeroCuota;
     private BigDecimal monto;

    public Cuota() {
    }

	
    public Cuota(int id) {
        this.id = id;
    }
    public Cuota(int id, Prestamo prestamo, Integer numeroCuota, BigDecimal monto) {
       this.id = id;
       this.prestamo = prestamo;
       this.numeroCuota = numeroCuota;
       this.monto = monto;
    }
   
     @Id 

    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_prestamo")
    public Prestamo getPrestamo() {
        return this.prestamo;
    }
    
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    
    @Column(name="numero_cuota")
    public Integer getNumeroCuota() {
        return this.numeroCuota;
    }
    
    public void setNumeroCuota(Integer numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    
    @Column(name="monto", precision=131089, scale=0)
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
}
