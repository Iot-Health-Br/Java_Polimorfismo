/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interface_polimorfismo.Locadora;
import interface_polimorfismo.Locadora.VideoCassete;
import interface_polimorfismo.Locadora.VideoSempToshiba;

public class SalaDeEstar {
    public static void main(String[] args) {
        VideoCassete [] videos = new VideoCassete[2];
        videos[0] = new VideoPhilco();
        videos[1] = new VideoSempToshiba();
        
        for(VideoCassete vc : videos){
            System.out.printf("\n\n%s:\n", vc.getNome());
            vc.play();
            vc.stop();
            vc.rebobinarFita();}
    }
}