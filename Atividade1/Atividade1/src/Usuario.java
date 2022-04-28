//Michelle Mitie Hamazaki
//RA: 20.00539-3

public class Usuario {
    private String name;

    public Usuario (String name) {
        this.name = name;
    }

    public String automovel(){
        return String.format("%s", name);
    }

    public String getName() {
        return name;
    }

}

