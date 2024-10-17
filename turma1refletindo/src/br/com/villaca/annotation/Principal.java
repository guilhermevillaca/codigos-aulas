package br.com.villaca.annotation;

import java.lang.reflect.Method;

/**
 *
 * @author guilherme.villaca
 */
public class Principal {
    
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("br.com.villaca.annotation.Exemplo");
        Method metodo = clazz.getMethod("testar");
        MinhasInfo info = metodo.getAnnotation(MinhasInfo.class);
        System.out.println("Autor " + info.autor());
        System.out.println("Data " + info.data());
        
    }

}
