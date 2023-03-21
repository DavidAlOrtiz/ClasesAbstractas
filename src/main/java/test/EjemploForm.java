package test;

import java.util.ArrayList;
import java.util.List;
import mx.com.dva.abtrac.form.elementos.ElementosForms;
import mx.com.dva.abtrac.form.elementos.InputForms;
import mx.com.dva.abtrac.form.elementos.Select.Opcion;
import mx.com.dva.abtrac.form.elementos.SelectForm;
import mx.com.dva.abtrac.form.elementos.TextArea;
import mx.com.dva.abtrac.form.elementos.validadores.EmailValidador;
import mx.com.dva.abtrac.form.elementos.validadores.LargoValidador;
import mx.com.dva.abtrac.form.elementos.validadores.NoNullo;
import mx.com.dva.abtrac.form.elementos.validadores.NumeroValidador;
import mx.com.dva.abtrac.form.elementos.validadores.RequeridoValidator;

public class EjemploForm {
    public static void main(String[] args) {
        ElementosForms username = new InputForms("username");
        
        InputForms password = new InputForms("password", "password");
        
        InputForms email = new InputForms("email", "email");
        
        InputForms edad = new InputForms("edad", "number");
        
        TextArea textArea = new TextArea(5, 9, "exp");
        
        SelectForm select = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");
        
        select.addOpcion(new Opcion("2", "PHGay"));
        select.addOpcion(new Opcion("3", "JavaScript"));
        select.addOpcion(new Opcion("4", "C++"));
        select.addValidador(new NoNullo());
        
        username.setValor(" d");
        password.setValor("12345");
        email.setValor("Algo@gmail.com");
        edad.setValor("14");
        
        java.setSelected(true);
        
        //Clases anonimas Solo se ocupan un vez
        ElementosForms elementoGenerico = new ElementosForms(){
            private String valor;
            private String tipo;
            
            @Override
            public String dibujar() {
                return "<input type='colocpicker'/>";
            }
            
        };
        
        List<ElementosForms> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(textArea);
        elementos.add(select);
        elementos.add(elementoGenerico);
        for(ElementosForms elemento : elementos ){
            System.out.println(elemento.dibujar());
        }
        password.addValidador(new LargoValidador(6, 12));
        username.addValidador(new RequeridoValidator());
        email.addValidador(new EmailValidador());
        edad.addValidador(new NumeroValidador());
        textArea.addValidador(new NoNullo());
        elementos.forEach(p ->{
            if(!p.isValido()){
                p.getErrores().forEach(System.out::println);
            }
        });
        
        
    }
}
