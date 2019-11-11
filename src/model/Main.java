package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String usuario="Francisco";
		String contraseņa="Francisco";
		iniciarSesion(usuario,contraseņa);

	}

	private static boolean iniciarSesion(String usuario, String contraseņa) {
		String cadena;
        FileReader f;
        boolean permiso=false;
		try {
			File archivo = new File ("C:\\Users\\manpa\\Proyecto Ingenieria\\Proyecto Ingenieria\\src\\model\\Contraseņas.txt");
			
			f = new FileReader(archivo);
			BufferedReader b = new BufferedReader(f);
			while((cadena = b.readLine())!=null) {
				int coma=cadena.indexOf("-");
				String usuarioB=cadena.substring(0, coma).trim();
				String contraseņaB=cadena.substring(coma+1).trim();
				if(usuario.equals(usuarioB)&&contraseņa.equals(contraseņaB)){
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
