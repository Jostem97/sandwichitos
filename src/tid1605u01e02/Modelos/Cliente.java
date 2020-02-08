package tid1605u01e02.Modelos;

public class Cliente {

    protected Integer no;
    protected String nombre;
    protected String apellidos;
    protected String telefono;

    public Cliente() {
    }

    public Cliente(Integer no, String nombre, String apellidos, String telefono) {
        this.no = no;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
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

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
