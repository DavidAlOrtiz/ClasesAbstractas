package mx.com.dva.abtrac.form.elementos;

import java.util.ArrayList;
import java.util.List;
import mx.com.dva.abtrac.form.elementos.Select.Opcion;

public class SelectForm extends ElementosForms {
    
    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(List<Opcion> opciones, String nombre) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opciones){
        this.opciones.add(opciones);
        return this;
    }
    
    
    
    @Override
    public String dibujar() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.getNombre()).append("'>'");
        for(Opcion opcion: opciones){
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if(opcion.isSelected()){
                sb.append(" selected");
                this.valor = opcion.getValor();
            }
            sb.append(" >")
                    .append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
    
}
