import java.util.*;

public class Vehiculo {
    private String marca, modelo;
    private int año;
    private double precio_base;
    
    public Vehiculo(String ma, String mo, int a, double p)
    {
        this.marca=ma;
        this.modelo=mo;
        this.año=a;
        this.precio_base=p;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }
    
    public void mostrar_info()
    {
        System.out.println("Marca: "+marca+" "+" Modelo: "+modelo);
        System.out.println("Ano: "+año+" "+" Precio: "+precio_base);
    }
}
public class Coche extends Vehiculo{
    public int num_Puertas;
    public String tipo_combustible;
    
    public Coche(double n, String t, String ma, String mo, int p, int nu)
    {
        super(ma, mo, p, n);
        this.num_Puertas=nu;
        this.tipo_combustible=t;
    }

    public int getNum_Puertas() {
        return num_Puertas;
    }

    public void setNum_Puertas(int num_Puertas) {
        this.num_Puertas = num_Puertas;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }
    
    @Override
    public void mostrar_info()
    {
        super.mostrar_info();;
        System.out.println("Num Puertas: "+num_Puertas+" "+"Tipo combustible:"+tipo_combustible);
    }
}
public class Moto extends Vehiculo{
    public double cilindrada;
    public String tipo_motor;
    
    public Moto(double c, String tm, String ma, String mo, int a, double p)
    {
        super(ma, mo, a, p);
        this.cilindrada=c;
        this.tipo_motor=tm;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }
    
    @Override
    public void mostrar_info()
    {
        super.mostrar_info();;
        System.out.println("Cilindrada: "+cilindrada);
        System.out.println("Tipo Motor: "+tipo_motor);
    }
}
