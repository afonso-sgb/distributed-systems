package isos.iesd.servectorcli;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CanExecuteTransaction {

    private int idx;
    private int indice1;
    private int indice2;

    // Getters e setters
    @XmlElement
    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    @XmlElement
    public int getIndice1() {
        return indice1;
    }

    public void setIndice1(int indice1) {
        this.indice1 = indice1;
    }

    @XmlElement
    public int getIndice2() {
        return indice2;
    }

    public void setIndice2(int indice2) {
        this.indice2 = indice2;
    }
}
