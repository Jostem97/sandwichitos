package tid1605u01e02.Modelos;

public class TipoSandwishito {

    protected String clave;
    protected String nombre;

    public TipoSandwishito() {
    }

    public TipoSandwishito(String clave, String nombre) {
        this.clave = clave;
        this.nombre = nombre;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
