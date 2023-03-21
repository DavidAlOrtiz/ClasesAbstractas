package mx.com.dva.abtrac.form.elementos.validadores;

public class RequeridoValidator extends Validador {
    
    protected String mensaje = "el valor es requerido";
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor == null || valor.isBlank());
    }
    
}
