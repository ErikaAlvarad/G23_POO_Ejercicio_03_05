/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Articulo;

/**
 *
 * @author erika
 */
public class ArticuloServicio implements IArticuloServicio{

    private static List<Articulo> articuloList = new ArrayList<>();
    
    @Override
    public Articulo crear(Articulo articulo) {
        this.articuloList.add(articulo);
        return articulo;
    }

    @Override
    public List<Articulo> listar() {
        return this.articuloList;
    }

    @Override
    public Articulo modificar(int codigoArticulo, Articulo articuloNuevo) {
    
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoArticulo));
        this.listar().get(posicion).setTitulo(articuloNuevo.getTitulo());
        this.listar().get(posicion).setIdioma(articuloNuevo.getIdioma());
        this.listar().get(posicion).setNumPublicaiones(articuloNuevo.getNumPublicaiones());
        this.listar().get(posicion).setAutorP(articuloNuevo.getAutorP());
        this.listar().get(posicion).setRevista(articuloNuevo.getRevista());
        return articuloNuevo;
    }

    @Override
    public Articulo eliminar(int codigoArticulo) {
    
        Articulo articulo=this.buscarPorCodigo(codigoArticulo);
        var posicion=this.buscarPosicion(articulo);
        this.listar().remove(posicion);
        return articulo;
    }

    @Override
    public Articulo buscarPorCodigo(int codigoArticulo) {
        Articulo articulo=null;
        for(var b:this.articuloList){
            if(codigoArticulo==b.getCodigo()){
                articulo=b;
                break;
            }
        }
        return articulo;
    }

    @Override
    public int buscarPosicion(Articulo articulo) {
    
        int posicion=-1;
        for(var b:this.articuloList){
            posicion++;
            if(b.getCodigo()==articulo.getCodigo()){
                break;
            }
        }
        return posicion;
    }
    
} 
