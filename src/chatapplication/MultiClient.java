
package chatapplication;

import static chatapplication.MulticastClient.name;
import javax.swing.JOptionPane;

public class MultiClient {
    //setting up the login for entry into the chatroom
    MultiClient() { name= JOptionPane.showInputDialog("Please enter your name");
        int count=0;
        while( name==null || name.equals("") )
        { if(name==null)
        {
            new ChatApp().setVisible(true);
            count++;
            break;}
        //will execute if user enters an incorrect name
        else if(name.equals(""))
        {   JOptionPane.showMessageDialog(new ChatApp(), "Please enter a proper name");
            name=JOptionPane.showInputDialog("Please enter your name");
        }

        }
        if(count==0)
        { new MulticastClient().setVisible(true);
            Thread t1=new Thread(new Client());
            t1.start();



        }
    }
}
