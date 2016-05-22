package Controladora;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Cliente {
public static void main(String[] args){
    String [] temp=new String[4];
    int i=0;
    File f=new File("Configuraciones.txt");
    //Scanner s;
    String p = " ";
    
    
    try {
        
        FileReader s= new FileReader(f);
        BufferedReader br = new BufferedReader(s);
        String ln;
        
            while((ln=br.readLine())!=null){
            //i++;
            temp[i]=ln;//temp[3]=br.readLine();temp[1]=br.readLine();temp[2]=br.readLine();//temp[]=br.readLine();temp[2]=br.readLine();
              i++;
        }
          //  }
            //}
        //temp[2]=br.readLine();
        s.close();
    }catch (Exception e){
            e.printStackTrace();
    }
    //temp=p.split("/");
    String []temp1;String []temp2;String []temp3;
    temp1=temp[0].split(":");
    temp2=temp[1].split(":");
    
    temp3=temp[2].split(":");
    Controladora ctrl=new Controladora();
    thread t1=new thread();
    t1.start();
    ctrl.setinstance(ctrl,(Integer.parseInt(temp1[0])),Integer.parseInt(temp1[1]),(Integer.parseInt(temp2[0])),Integer.parseInt(temp2[1]),(Integer.parseInt(temp3[0])),Integer.parseInt(temp3[1]));
    //ctrl.Inicio();
}
}
