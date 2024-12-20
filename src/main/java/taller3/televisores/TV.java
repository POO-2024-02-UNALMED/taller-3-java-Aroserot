package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV=0;
    
    public TV(Marca marca, boolean estado){
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		TV.numTV++;
    }
    
    public Marca getMarca() {
        return this.marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        if (estado==true && canal>=1 && canal<=120){
            this.canal = canal;
        }
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen){
        if (estado==true && volumen>=0 && volumen<=7){
            this.volumen = volumen;
        }     
    }

    public Control getControl() {
        return this.control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV(){
        return TV.numTV;
    }

    public static void setNumTV(int numTV){
        TV.numTV = numTV;
    }

    public void turnOff(){
        this.estado=false;
    }

    public void turnOn(){
        this.estado=true;
    }

    public boolean getEstado(){
        return estado;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public void canalUp(){
        this.setCanal(this.canal+1);
    }

    public void canalDown(){
        this.setCanal(this.canal-1);
    }

    public void volumenUp(){
        this.setVolumen(this.volumen+1);
                   
    }

    public void volumenDown(){
        this.setVolumen(this.volumen-1);
    }
}