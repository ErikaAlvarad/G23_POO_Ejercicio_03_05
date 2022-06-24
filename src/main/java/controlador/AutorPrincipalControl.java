/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.AutorPrincipal;
import servicio.AutorPrincipalServicio;

/**
 *
 * @author erika
 */
public class AutorPrincipalControl {
    private final AutorPrincipalServicio autorPrincipalServicio = new AutorPrincipalServicio();
    
    public AutorPrincipal crear(String [] args) {
        var autorPrincipal = new AutorPrincipal(Integer.valueOf(args[0]),args[1],args[2],
        Integer.valueOf(args[3]),Double.valueOf(args[4]));
        this.autorPrincipalServicio.crear(autorPrincipal);
        return autorPrincipal;
    }
    
    public List<AutorPrincipal> listar() {
        return this.autorPrincipalServicio.listar();
    }
    
}
