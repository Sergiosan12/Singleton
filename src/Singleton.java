public class Singleton {
    private int numeroAleatorio;
    private int numeroIntroducido;
    private int intentosMax;
    private int puntuacion;
    private String alias;
    private int contadorIntentos;
    private int rondasPartida;
    private int rondaActual;
    private int fallos;

    private Record record;

    private static Singleton instance = null;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }

    public int getNumeroIntroducido() {
        return numeroIntroducido;
    }

    public void setNumeroIntroducido(int numeroIntroducido) {
        this.numeroIntroducido = numeroIntroducido;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public int getPuntuacion() {
        return puntuacion;
    }


    public int getRondasPartida() {
        return rondasPartida;
    }

    public void setRondasPartida(int rondasPartida) {
        this.rondasPartida = rondasPartida;
    }

    public int getRondaActual() {
        return rondaActual;
    }

    public void setRondaActual(int rondaActual) {
        this.rondaActual = rondaActual;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getAlias() {
        return alias;
    }


    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getContadorIntentos() {
        return contadorIntentos;
    }

    public void setContadorIntentos(int contadorIntentos) {
        this.contadorIntentos = contadorIntentos;
    }

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public Singleton(int numeroAleatorio, int numeroIntroducido, int intentosMax, int puntuacion, String alias, int contadorIntentos, int rondasPartida, int rondaActual, int fallos, Record record) {
        this.numeroAleatorio = numeroAleatorio;
        this.numeroIntroducido = numeroIntroducido;
        this.intentosMax = intentosMax;
        this.puntuacion = puntuacion;
        this.alias = alias;
        this.contadorIntentos = contadorIntentos;
        this.rondasPartida = rondasPartida;
        this.rondaActual = rondaActual;
        this.fallos = fallos;
        this.record = record;
    }
}
