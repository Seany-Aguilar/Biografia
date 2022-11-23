
package Biografia;

//import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
/* @author BETTERLEE*/
 
public class DatosBio{
    
    private static String Nombre; 
    private static String Apellidos;
    private static String Estudios;
    private static int edad;
    private static String Direccion;
    private static String deportesFav;
    private static String hobbies;
    private static String anecdotas;
    private static String metas;
    private static String modeloS; 
    private static String fechaN;
    private static String fechasImp;
   
    
    String [] boton= { "Guardar pdf"};

        public void DatosBio(){
         String datos;
         
        String r[];
        String Nombre[];
        String Apellidos[];
        int edad[];
        String Estudios[];
        String Direccion[];
        String deportesFav[];
        String hobbies[];
        String anecdotas[];
        String metas[];
        String modeloS[];
        String fechaN[];
        String fechasImp[];
        
        r = new String[1];
        Nombre = new String[1];
        Apellidos = new String[1]; 
        edad = new int[1];
        Estudios = new String[1];
        Direccion = new String[1];
        deportesFav = new String[1];
        hobbies= new String[1];
        anecdotas= new String[1];
        metas= new String[1];
        modeloS = new String[1];
        fechaN = new String[1];
        fechasImp = new String[1];
        
        int i=0;
        while (i<1){
          datos = JOptionPane.showInputDialog("Ingrese un Nombre:  " );
          setApellidos(JOptionPane.showInputDialog("Ingrese sus apellido: "));
          setfechaN(JOptionPane.showInputDialog("Ingresa tu fecha de nacimiento: "));
          setedad (Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: ")));
          setDireccion(JOptionPane.showInputDialog("Ingresa tu direccion: "));
          setEstudios(JOptionPane.showInputDialog("Ingresa el nivel de estudios que tienes: "));
          setdeportesFav(JOptionPane.showInputDialog("¿Cuales son tus deportes favoritos?  "));
          sethobbies(JOptionPane.showInputDialog("¿Cuales son tus hobbies? "));
          setfechasImp(JOptionPane.showInputDialog("¿Que fecha es importante para ti?"));
          setanecdotas(JOptionPane.showInputDialog("Escribe tu mejor recuerdo: "));
          setmetas(JOptionPane.showInputDialog("¿Cuales son tus metas? "));
          setmodeloS(JOptionPane.showInputDialog("¿Quien/es son tu modelo a seguir?" ));
          
          
          r[i] = datos;
          Apellidos[i] = getApellidos();
          fechaN[i]=  getfechaN();
          edad[i]= getedad();
          Direccion[i] = getDireccion();
          Estudios[i] = getEstudios();
          deportesFav[i]= getdeportesFav();
          hobbies[i]= gethobbies();
          fechasImp[i]= getfechasImp();
          anecdotas[i] = getanecdotas();
          metas[i]= getmetas();
          modeloS[i]= getmodeloS();
          i++;
        }
        
        for (int j = 0; j < r.length ; j++) {
            System.out.println("Nombre: " + Nombre);
            System.out.println("Apellidos: " + Apellidos);
            System.out.println("Fecha de nacimiento: " + fechaN);
            System.out.println("Direccion " + Direccion);
            System.out.println("");
            
        }
        }
        

    public static String getNombre(){
        return Nombre;
    }
    public static void setNombre(String Nombre){
        DatosBio.Nombre = Nombre;
    }
    
    
    public static String getApellidos() {
        return Apellidos;
    }
    public static void setApellidos(String Apellidos) {
        DatosBio.Apellidos = Apellidos;
    }
    
    public static String getfechaN(){
        return fechaN;
    }
    public static void setfechaN(String fechaN){
        DatosBio.fechaN = fechaN;
    } 
    
    public static int getedad(){
    return edad;
    }
    public static void setedad(int edad){
        DatosBio.edad = edad;
    }
    
    public static String getDireccion(){
        return Direccion;
    }
    public static void setDireccion(String Direccion){
        DatosBio.Direccion = Direccion;
    } 
    
    public static String getEstudios(){
        return Estudios;
    }
    public static void setEstudios(String Estudios){
        DatosBio.Estudios = Estudios;
    }
    
    public static String getdeportesFav(){
        return deportesFav;
    }
    public static void setdeportesFav(String deportesF){
        DatosBio.deportesFav = deportesF;
    }
    
    public static String gethobbies(){
        return hobbies;
    }
    public static void sethobbies(String hobbies){
        DatosBio.hobbies= hobbies;
    }
    
    public static String getfechasImp(){
        return fechasImp;
    }
    public static void setfechasImp(String fechasImp){
        DatosBio.fechasImp = fechasImp;
    }
    public static String getanecdotas(){
        return anecdotas;
    }
    public static void setanecdotas(String anecdotas){
        DatosBio.anecdotas = anecdotas;
    }  
    
    public static String getmetas(){
        return metas;
    }
    public static void setmetas(String metas){
        DatosBio.metas =  metas;
    }   

    public static String getmodeloS(){
        return modeloS;
    }
    public static void setmodeloS(String modeloS){
        DatosBio.modeloS =  modeloS;
    }

    public void componentes(){
    
}
    
}
