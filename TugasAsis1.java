
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class TugasAsis1 {
    public static void main(String []args){
        Scanner input = new Scanner (System.in);
        System.out.println("Input = ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        //a tidak boleh 0
        if (a==0){
            System.out.println("Output =");
            System.out.println("Input a tidak boleh 0");
        }else{
            String var = "x";
        if (b>0 && c>0)
            System.out.println("Polinomial "+a+var+"^2 +"+b+var+"+"+c+" memiliki ");
        else if (b>0 && c<0)
            System.out.println("Polinomial "+a+var+"^2 +"+b+var+"-"+(-c)+" memiliki ");
        else if (b<0 && c<0)
            System.out.println("Polinomial "+a+var+"^2 -"+(-b)+var+"-"+(-c)+" memiliki ");
        else if (b<0 && c>0)
            System.out.println("Polinomial "+a+var+"^2 -"+(-b)+var+"+"+c+" memiliki ");
        else if (b==0 && c>0)
            System.out.println("Polinomial "+a+var+"^2 +"+c+" memiliki ");
        else if (b==0 && c<0)
            System.out.println("Polinomial "+a+var+"^2 -"+(-c)+" memiliki ");
        else if (c==0 && b>0)
            System.out.println("Polinomial "+a+var+"^2 +"+b+var+" memiliki ");
        else if (c==0 && b<0)
            System.out.println("Polinomial "+a+var+"^2 -"+(-b)+var+" memiliki ");
        else if (b==0 && c==0)
            System.out.println("Polinomial "+a+var+"^2 memiliki ");
        
    //soal pertama yaitu diskriminan
    double D = (b*b)-4*a*c;
    System.out.println("1. Diskriminan\t\t\t"+"= "+D);
    
    //soal kedua yaitu akar-akar polinomial
    double Akar1,Akar2,Akari,Akarc;
    Akari = Math.sqrt(D);
    
    if (b==0){
        if (D==0){
            System.out.println("2. Akar-akar dari polinomial\t"+"= 0");
        }else if(D<=0){
            Akar1 = (Math.sqrt(-D)/(2*a));
            Akar2 = -(Math.sqrt(-D)/(2*a));
            System.out.println("2. Akar-akar dari polinomial\t"+"= "+Akar1+"i"+" dan "+Akar2+"i");
        }else if(D>=0){
            Akar1 = (Akari/(2*a));
            Akar2 = -(Akari/(2*a));
            System.out.println("2. Akar-akar dari polinomial\t"+"= "+Akar1+" dan "+Akar2);
        }
    }else{
        if (D==0){
            Akar1 = -((b)/(2*a));
            System.out.println("2. Akar-akar dari polinomial\t"+"= "+Akar1);
        }else if (D<=0){
            Akar1 = -(b/(2*a));
            Akarc = ((Math.sqrt(-D))/(2*a));
            System.out.println("2. Akar-akar dari polinomial\t"+"= "+Akar1+"+"+Akarc+"i"+" dan "+Akar1+"-"+Akarc+"i");
        }else if (D>=0){
            Akar1 = -((b+Akari)/(2*a));
            Akar2 = -((b-Akari)/(2*a));
            System.out.println("2. Akar-akar dari polinomial\t"+"= "+Akar1+" dan "+Akar2);
        }
    }
    
    //soal ketiga yaitu titik stasioner
    double AbsisX = 0,OrdinatY = 0;
    AbsisX = -(b/(2*a));
    OrdinatY = -(D/(4*a));
    
    if (b==0){
     System.out.println("3. Titik Stasioner\t\t" + "= " + "(0,"+OrdinatY+ ")");
    }else if (D==0){
     System.out.println("3. Titik Stasioner\t\t" + "= " + "(" +AbsisX+ ",0)");
    }else if (b==0 && D==0){
     System.out.println("3. Titik Stasioner\t\t" + "= (0,0)");
    }else{
     System.out.println("3. Titik Stasioner\t\t" + "= " + "(" +AbsisX+ ","+OrdinatY+ ")");
            }       
    
    //soal keempat yaitu kecekungan kurva
    if (a>0){
        System.out.println("4. Kecekungan kurva\t\t"+"= Atas");
    }else if (a<0){
        System.out.println("4. Kecekungan kurva\t\t"+"= Bawah");
    }
    
    //soal kelima yaitu titik minimum dan maksimum lokal
    if (a>0 && D!=0){
        System.out.println("5. Nilai minimum lokal\t\t" + "= " +OrdinatY);
    }else if (a>0 && D==0){
        System.out.println("5. Nilai minimum lokal\t\t" + "= 0");
    }else{
        System.out.println("5. Nilai maksimum lokal\t\t" + "= " +OrdinatY);
    }
        }
    }
}

