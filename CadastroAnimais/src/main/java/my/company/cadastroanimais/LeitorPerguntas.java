package my.company.cadastroanimais;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeitorPerguntas {

    public static void processarPerguntas(JPanel jPanel, List<String> listaPerguntas) {
        Iterator<String> iterator = listaPerguntas.iterator();
        for (Component comp : jPanel.getComponents()) {
            if (comp instanceof JLabel & iterator.hasNext()) {
                ((JLabel) comp).setText(iterator.next());
            }
        }
    }

    public static List<String> lerPerguntas(File perguntas) {

        List<String> listaPerguntas = new ArrayList<>();
        try {
            FileReader fr = new FileReader(perguntas);
            BufferedReader br = new BufferedReader(fr);
            String linha;
            while ((linha = br.readLine()) != null) {
                listaPerguntas.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaPerguntas;
    }
}
