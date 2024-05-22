/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author Elegant
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        StudentClass st[] = new StudentClass[5];

        st[0] = new StudentClass();
        st[1] = new StudentClass();
        st[2] = new StudentClass();
        st[3] = new StudentClass();
        st[4] = new StudentClass();

        st[0].setName("Amy");
        st[1].setName("Ben");
        st[2].setName("Bob");
        st[3].setName("Joe");
        st[4].setName("Liam");

        for(int i = 0; i < st.length; i++){
            System.out.println(st[i].getName());
        }
    }
    
}
