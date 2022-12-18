public class Persoa {
    private String nif;
    private String nome;
    private String apellido;

    public Persoa(){};
    public Persoa(String nf, String n, String a){
        nif= nf;
        nome=n;
        apellido=a;
    }

    //setters y getters
    public void setNome(String n){
        nome=n;
    }
    public void setNIF(String n){
        nif=n;
    }
    public void setApellido(String a){
        apellido=a;
    }

    public String getNIF(){
        return nif;
    }
    public String getNome(){
        return nome;
    }
    public String getApellido(){
        return apellido;
    }

    @Override
    public String toString() {
        return
                "NIF='" + nif + '\'' +
                ", nome='" + nome + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
