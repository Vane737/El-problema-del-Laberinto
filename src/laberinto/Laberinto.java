/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laberinto;

/**
 *
 * @author Vivian Vanessa
 */
public class Laberinto {
    public static int c = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m[][] = new int [4][4];
        
       laberintoSinCero(m,0,0,3,3,1);
         System.out.println("/////////////////////////");
         laberinto(m, 0, 0, 3, 3, 1);
       System.out.println("La cantidad de Soluciones es: " + c);
         System.out.println("////////////////////////");
       laberintoConCero(m,0,0,3,3,1);
        //System.out.println("////////////////////");
        //laberintoDiagonal(m, 0, 0, 2, 2, 1);
        //laberintoDiagonalConNulo(m, 0, 0, 2, 2, 1);
       
        //System.out.println("////////////////////");
        //laberintoDiagonalSinNulo(m, 0, 0, 2, 2, 2);
       //laberintoNoVisitados(m, 0, 0, 3, 3, 1);
    
        //laberintoNoVisitadosDiagonal(m,0,0,2,2,1);
        //mostrar(m);

        //laberintoConValorN(m,0,0,3,3,1);
        System.out.println("La cantidad de Soluciones es: " + c);
        System.out.println("Hola Como estas");
    }
        public static void mostrar(int m[][])
    {
        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[i].length; j++)
            {
                System.out. print(m[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public static boolean posValida(int m[][], int i, int j){
    return i >= 0 && i < m.length && j >= 0 && 
            j < m[i].length && m[i][j] == 0; 
    }
    public static boolean sinValorNulo(int m[][])
    {
        int c = 0;

        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[i].length; j++)
            {
                if(m[i][j] == 0)
                {
                 return false;    
                }
            }         
        }
    return true;    
        
    }
    public static void laberinto(int m[][], int i, int j, int i1, int j1, int paso)
    {
        if(!posValida(m, i, j)) return;
        m[i][j]= paso;
        if(i == i1 && j == j1)
        {
    
            mostrar(m);
            c = c + 1;
        }
        
        laberinto(m, i, j-1, i1, j1, paso + 1);
        laberinto(m, i-1, j, i1, j1, paso + 1);
        laberinto(m, i, j+1, i1, j1, paso + 1);
        laberinto(m, i+1, j, i1, j1, paso + 1);
        m[i][j]= 0;
    }
    public static void laberintoSinCero(int m[][], int i, int j, int i1, int j1, int paso)
    {
        if(!posValida(m, i, j)) return;
        m[i][j]= paso;
        if(i == i1 && j == j1)
        {
            if(sinValorNulo(m))
            {
            mostrar(m);
            c = c + 1;
            }
        }
        
        laberintoSinCero(m, i, j-1, i1, j1, paso + 1);
        laberintoSinCero(m, i-1, j, i1, j1, paso + 1);
        laberintoSinCero(m, i, j+1, i1, j1, paso + 1);
        laberintoSinCero(m, i+1, j, i1, j1, paso + 1);
        m[i][j]= 0;
    }
    public static boolean conValorNulo(int m[][])
    {
        for(int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[i].length; j++)
            {
                if(m[i][j]== 0)
                {
                    return true;
                }
            }
            
        }
    return false;    
 
    }
    
    public static void laberintoConCero(int m[][], int i, int j, int i1, int j1, int paso)
    {   
        if(!posValida(m, i, j)) return;
            m[i][j]= paso;
            if(i == i1 && j == j1)
            {
                if(conValorNulo(m))
                {
                mostrar(m);
                c = c + 1;
                }
            }
        
        laberintoConCero(m, i, j-1, i1, j1, paso + 1);
        laberintoConCero(m, i-1, j, i1, j1, paso + 1);
        laberintoConCero(m, i, j+1, i1, j1, paso + 1);
        laberintoConCero(m, i+1, j, i1, j1, paso + 1);
        m[i][j]= 0;
        
    }
    public static void laberintoDiagonal(int m[][], int i, int j, int i1, int j1, int paso)
    {
        if(!posValida(m, i, j)) return;
        m[i][j]= paso;
        if(i == i1 && j == j1)
        {
            mostrar(m);
            c = c + 1;
        }
        
        laberintoDiagonal(m, i, j-1, i1, j1, paso + 1);
        laberintoDiagonal(m, i-1, j-1, i1, j1, paso + 1);
        laberintoDiagonal(m, i-1, j, i1, j1, paso + 1);
        laberintoDiagonal(m, i-1, j+1, i1, j1, paso + 1);
        laberintoDiagonal(m, i, j+1, i1, j1, paso + 1);
        laberintoDiagonal(m, i+1, j+1, i1, j1, paso + 1);
        laberintoDiagonal(m, i+1, j, i1, j1, paso + 1);
        laberintoDiagonal(m, i+1, j-1, i1, j1, paso + 1);

        m[i][j]= 0;
    }
    
    public static void laberintoDiagonalSinCero(int m[][], int i, int j, int i1, int j1, int paso)
    {
        if(!posValida(m, i, j)) return;
        m[i][j]= paso;
        if(i == i1 && j == j1)                                              
        {                                               
            if(sinValorNulo(m))                      
            {                                         
                mostrar(m);
                c = c + 1;
            }
        }
        
        laberintoDiagonalSinCero(m, i, j-1, i1, j1, paso + 1);
        laberintoDiagonalSinCero(m, i-1, j-1, i1, j1, paso + 1);
        laberintoDiagonalSinCero(m, i-1, j, i1, j1, paso + 1);
        laberintoDiagonalSinCero(m, i-1, j+1, i1, j1, paso + 1);
        laberintoDiagonalSinCero(m, i, j+1, i1, j1, paso + 1);
        laberintoDiagonalSinCero(m, i+1, j+1, i1, j1, paso + 1);
        laberintoDiagonalSinCero(m, i+1, j, i1, j1, paso + 1);
        laberintoDiagonalSinCero(m, i+1, j-1, i1, j1, paso + 1);

        m[i][j]= 0;
    }
public static void laberintoDiagonalConCero(int m[][], int i, int j, int i1, int j1, int paso)
    {
        if(!posValida(m, i, j)) return;
        m[i][j]= paso;
        if(i == i1 && j == j1)
        {
            if(conValorNulo(m))
            {
                mostrar(m);
                c = c + 1;
            }
        }
        
        laberintoDiagonalConCero(m, i, j-1, i1, j1, paso + 1);
        laberintoDiagonalConCero(m, i-1, j-1, i1, j1, paso + 1);
        laberintoDiagonalConCero(m, i-1, j, i1, j1, paso + 1);
        laberintoDiagonalConCero(m, i-1, j+1, i1, j1, paso + 1);
        laberintoDiagonalConCero(m, i, j+1, i1, j1, paso + 1);
        laberintoDiagonalConCero(m, i+1, j+1, i1, j1, paso + 1);
        laberintoDiagonalConCero(m, i+1, j, i1, j1, paso + 1);
        laberintoDiagonalConCero(m, i+1, j-1, i1, j1, paso + 1);

        m[i][j]= 0;
    }
    public static void laberintoNoVisitadosDiagonal(int m[][], int i, int j, int i1, int j1, int paso) {
    if (!posValida(m, i, j)) {
        return;
    }
    m[i][j] = paso;
    if (i == i1 && j == j1) {
        mostrar(m);
        c = c + 1;
    }
    int aleatorio=(int) Math.floor(Math.random()*(8-1+1)+1);
    switch(aleatorio) {
        case 1: laberintoDiagonal(m, i, j - 1, i1, j1, paso + 1);
        case 2: laberintoDiagonal(m, i - 1, j - 1, i1, j1, paso + 1);
        case 3: laberintoDiagonal(m, i - 1, j, i1, j1, paso + 1);
        case 4: laberintoDiagonal(m, i - 1, j + 1, i1, j1, paso + 1);
        case 5: laberintoDiagonal(m, i, j + 1, i1, j1, paso + 1);
        case 6: laberintoDiagonal(m, i + 1, j + 1, i1, j1, paso + 1);
        case 7: laberintoDiagonal(m, i + 1, j, i1, j1, paso + 1);
        case 8: laberintoDiagonal(m, i + 1, j - 1, i1, j1, paso + 1);
    }
    m[i][j] = 0;
}
    public static void laberintoDiagonal1(int m[][], int i, int j, int i1, int j1, int paso) {
    if (!posValida(m, i, j)) {
        return;
    }
    m[i][j] = paso;
    if (i == i1 && j == j1) {
        mostrar(m);
        c = c + 1;
    }

    laberintoDiagonal1(m, i, j - 1, i1, j1, paso + 1);
    laberintoDiagonal1(m, i - 1 , j - 1, i1, j1, paso + 1);
    laberintoDiagonal1(m, i - 1, j, i1, j1, paso + 1);
    laberintoDiagonal1(m, i - 1, j + 1, i1, j1, paso + 1);
    laberintoDiagonal1(m, i, j + 1, i1, j1, paso + 1);
    laberintoDiagonal1(m, i + 1, j + 1, i1, j1, paso + 1);
    laberintoDiagonal1(m, i + 1, j, i1, j1, paso + 1);
    laberintoDiagonal1(m, i + 1, j - 1, i1, j1, paso + 1);
    m[i][j] = 0;
}

}
