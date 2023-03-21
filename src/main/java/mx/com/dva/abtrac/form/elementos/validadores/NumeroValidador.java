package mx.com.dva.abtrac.form.elementos.validadores;

public class NumeroValidador extends Validador{
    
    protected String mensaje = "El valor tiene que ser un numero";
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
        try {
            Integer.parseInt(valor);
            return false;
        } catch (Exception e) {
            return true;
        }
    }
    
}
