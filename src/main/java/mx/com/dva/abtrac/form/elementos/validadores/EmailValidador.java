package mx.com.dva.abtrac.form.elementos.validadores;

public class EmailValidador extends Validador {
    private String mensaje = "El valor tiene que ser un email";
    private final String EXPRESION_REGX = "[A-Za-z0-9+_.-]+@(.+)$";
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
        return valor.matches(EXPRESION_REGX);
    }
    
}
