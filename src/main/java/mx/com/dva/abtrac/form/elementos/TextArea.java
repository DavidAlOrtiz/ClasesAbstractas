package mx.com.dva.abtrac.form.elementos;

public class TextArea extends ElementosForms {
    private int colums;
    private int rows; 

    public TextArea(String nombre) {
        super(nombre);
    }

    public TextArea(int colums, int rows, String nombre) {
        super(nombre);
        this.colums = colums;
        this.rows = rows;
    }

    public int getColums() {
        return colums;
    }

    public void setColums(int colums) {
        this.colums = colums;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
    @Override
    public String dibujar() {
        return "<textarea name='"+ this.getNombre()+ "' cols='"+this.colums+
                    "' rows='"+this.rows+"' >"+this.valor+"</textarea>";
    }
}
