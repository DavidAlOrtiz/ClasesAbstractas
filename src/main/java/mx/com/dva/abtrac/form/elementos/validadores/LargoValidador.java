package mx.com.dva.abtrac.form.elementos.validadores;

import mx.com.dva.abtrac.form.elementos.validadores.mensaje.MensajeFormateable;

public class LargoValidador extends Validador implements MensajeFormateable{
    protected String mensaje = "El campo debe tener minimo %s caracteres y como maximo %s";
    private int main;
    private int max;
    public LargoValidador() {
    }

    public LargoValidador(int main, int max) {
        this.main = main;
        this.max = max;
    }
    
    

    public int getMain() {
        return main;
    }

    public void setMain(int main) {
        this.main = main;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
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
        this.mensaje = String.format(this.mensaje, this.main, this.max);
        if(valor == null){
            return true;
        }
        int tamanio = valor.length();
        return (tamanio >= this.main && tamanio <= this.max);
    }

    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje, campo, this.main, this.max);
    }
    
}
