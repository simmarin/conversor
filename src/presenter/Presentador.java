package presenter;
import model.Modelo;
import view.Vista;

public class Presentador {

    private  Vista view;
    private Modelo model;

    public Presentador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
    }

    public void  division (double dato) {

        double RD;
        RD=model.division(dato);

        String D = Double.toString(RD);
        view.updateJtextfield2(D);
    }
    public void  multiplicacion (double dato) {

        double RM;
        RM=model.multiplicacion(dato);

        String M = Double.toString(RM);
        view.updateJtextfield2(M);

    }



}

