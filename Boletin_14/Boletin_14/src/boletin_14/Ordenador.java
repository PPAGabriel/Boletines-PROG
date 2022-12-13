
package boletin_14;
import com.gabriel.partes.*;


public class Ordenador {
    private Monitor obxMo=new Monitor();
    private Teclado obxTe=new Teclado();
    private CPU obxCpu=new CPU();
    private float precio;
    
    public Ordenador(){}
    
    public Ordenador(float mo, String te, int cpu,float pr){
    obxMo.setPulgadas(mo);
    obxTe.setMarca(te);
    obxCpu.setVelocidad(cpu);
    precio=pr;
    }
    
    public float getPrecio(){
    return precio;
    }
    
    public Teclado getTeclado(){
    return obxTe;
    }
    
    public CPU getCPU(){
    return obxCpu;
    }

    public Monitor getMonitor(){
    return obxMo;
    }
    
    @Override
    public String toString() {
        return obxMo.toString() +", " +obxTe.toString() +", "+obxCpu.toString() +", precio: "+ precio;
    }
    
    
    
}
