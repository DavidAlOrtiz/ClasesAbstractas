package mx.com.dva.abtrac.form.elementos.validadores;

public class NoNullo extends Validador {
    
    protected String mansaje = "El valor es nulo";
    
    @Override
    public void setMensaje(String mensaje) {
        this.mansaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mansaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null);
    }
    
}
