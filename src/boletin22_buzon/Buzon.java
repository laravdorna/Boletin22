/*
 * 
a) int numeroDeCorreos(), que calcula cantos correos hai no buzon de correo
b) void engade (Correo c), que engade c ao buzon
c) boolean porLer(), que determina se quedan correos por ler
d) String amosaPrimerNoLeido(), que amostra o primeiro correo non lido
e) String amosa(int k), que amostra o correo k-ésimo, fora lido ou non
f) void elimina(int k), que elimina o correo k-ésimo.

 */
package boletin22_buzon;

import utilidades.PedirDatos;

/**
 *
 * @author lvazquezdorna
 */
public class Buzon {
    
    //crea un correo nuevo, lido estará sempre a false cuando se cree un correo
     public Correo crearAlumnoDos() {
         Correo c= new Correo(false,PedirDatos.cadena("Intruduzca contenido del correo: "));
      
        return c;
    }
   
 // cuantos correos hay en el buzon   
public int numeroDeCorreos (){
return 0;
}

//añade un correo al buzon
public void engade (Correo c){

}

//determina si quedan correos por leer
public boolean porLer(){
return false;
}

//muestra el primer correo no leido, una vez amosado cambiar lido a true
public String amosarPrimerNoLeido (){
return "hola";
}

//muestra un correo dado el numero que ocupa en el array 
public String amosa (int k){
return "hola";
}

//elimina un correo dado el numero que ocupa en el array 
public void elimina (int k){

}

}
