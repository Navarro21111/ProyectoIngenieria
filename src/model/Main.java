package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String usuario="Francisco";
		String contrase�a="Francisco";
		iniciarSesion(usuario,contrase�a);

	}

	private static boolean iniciarSesion(String usuario, String contrase�a) {
		String cadena;
        FileReader f;
        boolean permiso=false;
		try {
			File archivo = new File ("C:\\Users\\manpa\\Proyecto Ingenieria\\Proyecto Ingenieria\\src\\model\\Contrase�as.txt");
			
			f = new FileReader(archivo);
			BufferedReader b = new BufferedReader(f);
			while((cadena = b.readLine())!=null) {
				int coma=cadena.indexOf("-");
				String usuarioB=cadena.substring(0, coma).trim();
				String contrase�aB=cadena.substring(coma+1).trim();
				if(usuario.equals(usuarioB)&&contrase�a.equals(contrase�aB)){
					permiso=true;
				}
				
				
	            
	        }
	        b.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return permiso;
        
        
		
	}

}
