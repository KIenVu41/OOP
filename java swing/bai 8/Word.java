/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form8;

/**
 *
 * @author Admin
 */
public class Word implements Comparable<Word>{
    protected String id;
    protected String en;
    protected String vn;

    public Word() {
    }

    public Word(String id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public String getId() {
        return id;
    }

    public String getEn() {
        return en;
    }

    public String getVn() {
        return vn;
    }
    
    @Override
    public String toString() {
        return "Word{" + "id=" + id + ", en=" + en + ", vn=" + vn + '}';
    }
    
    @Override
    public int compareTo(Word o) {
        if (en.equals(o.en)) return 0;
        else if (en.compareTo(o.en)<0 ) return 1;
        else return -1;
    }
}
