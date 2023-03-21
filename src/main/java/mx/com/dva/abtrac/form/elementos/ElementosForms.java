package mx.com.dva.abtrac.form.elementos;

import java.util.ArrayList;
import java.util.List;
import mx.com.dva.abtrac.form.elementos.validadores.LargoValidador;
import mx.com.dva.abtrac.form.elementos.validadores.Validador;
import mx.com.dva.abtrac.form.elementos.validadores.mensaje.MensajeFormateable;

abstract public class ElementosForms {
    protected String valor;
    private String nombre;
    private List<Validador> validadores;
    private List<String> errores;
    
    public ElementosForms(){
        this.validadores  = new ArrayList<>();
        this.errores = new ArrayList<>();
     }
    
    public ElementosForms(String nombre){
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public ElementosForms addValidador(Validador validador){
        validadores.add(validador);
        return this;
    }
    
    public List<String> getErrores(){
        return errores;
    }
    
    public boolean isValido(){
        for(Validador v : validadores){
            if(v.esValido(valor)){
                if(v instanceof  MensajeFormateable){
                    this.errores.add(((MensajeFormateable) v).getMensajeFormateado(nombre));
                }else{
                    this.errores.add(v.getMensaje());
                }
            }
        }
        return this.errores.isEmpty();
    }
    abstract public String dibujar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
