package taller3.televisores;

public class Control {
    private TV tv;

    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }
    public void turnOff(){
        tv.turnOff();
    }

    public void turnOn(){
        tv.turnOn();
    }

    public void canalUp(){
        tv.canalUp();
    }

    public void canalDown(){
        tv.canalDown();
    }

    public void volumenUp(){
        tv.volumenUp();
    }

    public void volumenDown(){
        tv.volumenDown();
    }

    public void setCanal(int canal){
        this.tv.setCanal(canal);
    }

    public void setVolumen(int volumen){
        this.tv.setVolumen(volumen);
    }

    public TV getTv() {
		return this.tv;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
}