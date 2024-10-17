package br.com.villaca.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 *
 * @author guilherme.villaca
 */
public class ReflectionPessoa {
    
    public static void main(String[] args) throws Exception {
        
        Class<?> clazz = Class.forName("br.com.villaca.reflection.Pessoa");
        
        Constructor<?> construtor = clazz.getConstructor(String.class);
        
        Object pessoa = construtor.newInstance("Guilherme");
        
        Method method = clazz.getMethod("getNome");
        String nome = (String)method.invoke(pessoa);
        System.out.println("Nome " + nome );
        
        //Pessoa p = new Pessoa("Guilherme");
        
        
        
    }

}
