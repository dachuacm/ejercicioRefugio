public class Fecha {

    private int dia;
    private String mes;
    private int a;

    private static int num_inst;

    public Fecha(){
        num_inst++;
    }

    public Fecha(int dia,String mes,int aa){

            this.dia=dia;
            this.mes=mes;
            this.a=aa;
            num_inst++;
            
    }

    public int cuantosSomos(){
        return num_inst;
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int valor){
        dia=valor;
    }

    

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    /*public static int diasMes( Fecha fecha ){

        if(fecha.mes.equals("Febrero") 
            && esBisiesto(fecha.a)){
            return 28;
        }



    }
    
    public static int diasMes(int mes,int a){

    }*/

    public int diasMes(  ){


        if(mes.equals("Febrero") 
            && esBisiesto(fea)){
            return 28;
        }


    }

    private static boolean esBisiesto(int year){

         return  year%4==0 && year%100!=0;
    }


}
