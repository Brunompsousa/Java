/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercpoo_14;

/**
 *
 * @author Bruno Sousa
 */
public class ExercPOO_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Aprender javaPOO");
        v[1] = new Video("Aprendendo Kotlin");
        v[2] = new Video("Aprender a programar");
        
        Viewer p[] = new Viewer[2];
        p[0] = new Viewer("Bruno",30,"M","BMPS");
        p[1] = new Viewer("Miguel",20,"M","Miguel2");
        
        System.out.println("----- VIDEOS -----");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("----- VIEWERS -----");
        System.out.println(p[0].toString());
        System.out.println(p[1].toString());
        
        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(p[1],v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(p[1],v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
    }
    
}
