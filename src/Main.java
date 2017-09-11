import model.Modelo;
import presenter.Presentador;
import view.Vista;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Modelo model = new Modelo();
            Vista view= new Vista();
            Presentador presenter = new Presentador(view, model);
            view.setPresenter(presenter);


        });
        }
    }
