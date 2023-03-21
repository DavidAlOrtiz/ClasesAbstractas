package mx.com.dva.abtrac.form.elementos;

public class InputForms extends ElementosForms {
    
    private String tipo =  "Text";

    public InputForms(String nombre) {
        super(nombre);
    }

    public InputForms(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    @Override
    public String dibujar() {
        return "<input type="+this.tipo+" name="+this.getNombre()+" value="+this.valor+" >";
    }

    
    
}
