/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Revista;
import servicio.RevistaServicio;

/**
 *
 * @author erika
 */
public class RevistaControl {
    private final RevistaServicio revistaServicio = new RevistaServicio();
    
    public Revista crear(String [] args) {
        var revista = new Revista(Integer.valueOf(args[0]),args[1],
        Integer.valueOf(args[2]),Integer.valueOf(args[3]),Integer.valueOf(args[4]));
        this.revistaServicio.crear(revista);
        return revista;
    }
    
    public List<Revista> listar() {
        return this.revistaServicio.listar();
    }
    
}
