package HomeWork_final;

public class NoteBook {

    private Integer volume_ram;
    private String volume_hdd;
    private String operating_system;
    private String color;

    public NoteBook(Integer volume_ram, String volume_hdd, String operating_system, String color){
        this.volume_ram = volume_ram;
        this.volume_hdd = volume_hdd;
        this.operating_system = operating_system;
        this.color = color;
        
    }
    
    @Override
    public String toString() {
        
        return String.format(new StringBuilder().append("\tОбъём оперативной памяти: %d Gb\n")
        .append("\tОбъём жёсткого диска: %s\n")
        .append("\tОперационная система: %s\n")
        .append("\tЦвет: %s\n").toString(),volume_ram, volume_hdd, operating_system, color);
    }

    public boolean containsVol_Ram(Integer value) {
        if (NoteBook.this.volume_ram == value) return true;
        else return false;
    }

    public boolean containsVol_Hdd(String value) {
        if (NoteBook.this.volume_hdd.toLowerCase().contains(value.toLowerCase())) return true;
        else return false;
    }

    public boolean containsOper_Sys(String value) {
        if (NoteBook.this.operating_system.toLowerCase().contains(value.toLowerCase())) return true;
        else return false;
    }

    public boolean containsColor(String value) {
        if (NoteBook.this.color.toLowerCase().contains(value.toLowerCase())) return true;
        else return false;
    }
    

}
