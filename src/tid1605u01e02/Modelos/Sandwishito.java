package tid1605u01e02.Modelos;

import java.util.Date;

public class Sandwishito {

    protected Integer no;
    protected Float precio;
    protected Cliente cliente;
    protected Vendedor vendedor;
    protected Date fecha;
    protected TipoSandwishito tipo;

    public Sandwishito() {
    }

    public Sandwishito(Integer no, Float precio, Cliente cliente, Vendedor vendedor, Date fecha, TipoSandwishito tipo) {
        this.no = no;
        this.precio = precio;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    /**
     * @return the no
     */
    public Integer getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(Integer no) {
        this.no = no;
    }

    /**
     * @return the precio
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tipo
     */
    public TipoSandwishito getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoSandwishito tipo) {
        this.tipo = tipo;
    }

}
