package co.edu.uniquindio.poo;

import java.util.List;

public class DirectorPersonaje {
    private BuilderPersonaje builderPersonaje;
    private BuilderMago builderMago;
    private BuilderArquero builderArquero;
    private BuilderGuerrero builderGuerrero;
    

    public DirectorPersonaje(BuilderPersonaje builderPersonaje){
        this.builderPersonaje = builderPersonaje;
    }

    public Personaje buildPersonaje(String nombre, String descripcion, String apodo, double dineroInicial, List<String> listaHabilidades){
        //Metodos para construir el personaje
        builderPersonaje.buildNombre(nombre);
        builderPersonaje.buildDescripcion(descripcion);
        builderPersonaje.buildApodo(apodo);
        builderPersonaje.buildDineroInicial(dineroInicial);
        builderPersonaje.buildHabilidades(listaHabilidades);
        return builderPersonaje.buildPersonaje();
    }

    public Personaje buildMago(String nombre, String descripcion, String apodo, double dineroInicial, List<String> listaHabilidades, int inteligencia, int sabiduria, int energiaMagica, BuilderMago builderMago){
        buildPersonaje(nombre, descripcion, apodo, dineroInicial, listaHabilidades);
        this.builderMago = builderMago;
        builderMago.buildInteligencia(inteligencia);
        builderMago.buildSabiduria(sabiduria);
        builderMago.buildEnergiaMagica(energiaMagica);
        return builderMago.buildPersonaje();
    
    }

    public Personaje buildArquero(String nombre, String descripcion, String apodo, double dineroInicial, List<String> listaHabilidades, int destreza, int agilidad, int precision, BuilderArquero builderArquero){
        buildPersonaje(nombre, descripcion, apodo, dineroInicial, listaHabilidades);
        this.builderArquero = builderArquero;
        builderArquero.buildDestreza(destreza);
        builderArquero.buildAgilidad(agilidad);
        builderArquero.buildPrecision(precision);
        return builderArquero.buildPersonaje();
    }
    
    public Personaje buildGuerrero(String nombre, String descripcion, String apodo, double dineroInicial, List<String> list, int fuerza, int resistencia, int vitalidad, BuilderGuerrero builderGuerrero){
        buildPersonaje(nombre, descripcion, apodo, dineroInicial, list);
        this.builderGuerrero = builderGuerrero;
        builderGuerrero.buildFuerza(fuerza);
        builderGuerrero.buildResistencia(resistencia);
        builderGuerrero.buildVitalidad(vitalidad);
        return builderGuerrero.buildPersonaje();
    }
}