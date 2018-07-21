/*
 * Test Class
 */

/**
 * @author Lester
 */
import javax.swing.JOptionPane;

public class TestEncryption {

    public static void main(String arg[]) {
        String code, output = "";

        String text = JOptionPane.showInputDialog("Enter message");

        output += "The original message is \n" + text + "\n";
        Cipher c = new Caesar(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nCeasar Cipher\nThe encrypted message is \n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output += "The decrypted message is \n" + code + "\n";

        c = new Transpose(text);
        c.encrypt();
        code = c.getEncodedMessage();
        output += "\nTranspose\nThe encrypted Transpose message is \n" + code + "\n";
        c.decrypt(code);
        code = c.getDecodedMessage();
        output += "The decripted Transpose message is \n" + code + "\n";

        //Encode method on Transpose runs. Letter reversal occurs.
        c = new Reverser(text);
        c.encrypt();
        code = c.getEncodedMessage();
        
        //reverseText on Reverser runs. Word postion reversal occurs.
        Reverser d = new Reverser(code);
        code = d.reverseText(code);
        output += "\nReverser\nThe encrypted Reverse message is \n" + code + "\n";
        
        //Decode on Reverser runs. Word reversal undone.
        code = c.decode(code);
        
        //Decrypt on Cipher runs, which makes decode method on Transpose run. First reversal is undone.
        //Reversed back to original text
        Transpose e = new Transpose(code);
        e.decrypt(code);
        code = e.getDecodedMessage();
        output += "The decrypted Reverse message is \n" + code;
        display(output);

    }

    static void display(String s) {
        JOptionPane.showMessageDialog(null, s, "Encrypt/decrypt", JOptionPane.INFORMATION_MESSAGE);
    }
}
