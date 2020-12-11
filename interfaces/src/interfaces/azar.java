package interfaces;

public class azar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] valor = {1,2,3,4,5,6,7};
        boolean bucle=true;
        while (bucle==true) {
            valor[0]=(int) Math.floor(Math.random()*6+1);
            valor[1]=(int) Math.floor(Math.random()*6+1);
            valor[2]=(int) Math.floor(Math.random()*6+1);
            valor[3]=(int) Math.floor(Math.random()*6+1);
            valor[4]=(int) Math.floor(Math.random()*6+1);
            valor[5]=(int) Math.floor(Math.random()*6+1);


            int x=0;
            for(int contador=0;contador<valor.length;contador++) {

                for (int contador2=0;contador2<valor.length;contador2++) {
                    System.out.println("ar[contador] "+valor[contador] +" contador "+valor[contador2]);
                    //System.out.println("a" +contador);
                    if(valor[contador]==valor[contador2]) {
                        System.out.println("Son iguales " +valor[contador] +" y "+valor[contador2]);
                        x++;
                        System.out.println(x +" x \n");
                    }
                }
            }
            System.out.println(" X "+x);
            if(x<=7) {
            	System.out.println("BLUCLE ");
                bucle=false;
                //se da valor 0 para que no acabe el bucle
            }
        }
		 
		 System.out.println("  FIN    " +valor[0]+"  "+valor[1] +" "+valor[2]+"  "+valor[3]+"  "+valor[4]+"  "+valor[5]);
		 
		 
		 
		 
		 
		 
		 
		 //
	}

}
