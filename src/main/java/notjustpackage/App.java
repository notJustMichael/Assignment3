package notjustpackage;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        try {
            //iv. Timeout
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World!");

        Pet dog = new Pet.Builder()
                .age(12)
                .id("m19")
                .name("bobby")
                .sex(false)
                .build();

        JOptionPane.showMessageDialog(null, "The pet's name is "+dog.getName()+" and "+dog.getAge()+" years old");
    }

}
