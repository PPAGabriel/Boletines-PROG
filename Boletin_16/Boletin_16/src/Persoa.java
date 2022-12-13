public class Persoa {
    private String NIF;
    private String nome;
    private String apellido;

    public Persoa(){};
    public Persoa(String nif, String n, String a){
        NIF= nif;
        nome=n;
        apellido=a;
    }

    //setters y getters
    public void setNome(String n){
        nome=n;
    }
    public void setNIF(String n){
        NIF=n;
    }
    public void setApellido(String a){
        apellido=a;
    }

    public String getNIF(){
        return NIF;
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
                "NIF='" + NIF + '\'' +
                ", nome='" + nome + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
