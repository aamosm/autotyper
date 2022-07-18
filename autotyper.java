import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;

public class autotyper{
    public long longgg;
    public static void main(String args[]) throws InterruptedException, AWTException {
        String input = JOptionPane.showInputDialog("Enter your word:");
        StringSelection stringSelection = new StringSelection(input);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);

        autotyper sec = new autotyper();

        sec.seconds();

    }

    public static void seconds() throws InterruptedException, AWTException {

        String jaja = "";
        String jajaa = " ";

        String aa = "`";
        String ab = "~";
        String ac = "!";
        String aq = "@";
        String aw = "#";
        String ae = "$";
        String ar = "%";
        String at = "^";
        String ay = "&";
        String au = "*";
        String ai = "(";
        String ao = ")";
        String ap = "-";
        String as = "_";
        String ad = "=";
        String af = "+";
        String ag = "[";
        String ah = "{";
        String aj = "}";
        String ak = "]";
        String al = ";";
        String az = ":";
        String ax = "'";
        String av = "\\";
        String an = "|";
        String am = ",";
        String aA = ">";
        String aB = ".";
        String aC = "<";
        String aQ = "/";
        String aW = "?";

        String aaa = "q";
        String aab = "w";
        String aac = "e";
        String aaq = "r";
        String aaw = "t";
        String aae = "y";
        String aar = "u";
        String aat = "i";
        String aay = "o";
        String aau = "p";
        String aai = "a";
        String aao = "s";
        String aap = "d";
        String aas = "f";
        String aad = "g";
        String aaf = "h";
        String aag = "j";
        String aah = "k";
        String aaj = "l";
        String aak = "z";
        String aal = "x";
        String aaz = "c";
        String aax = "v";
        String aav = "b";
        String aan = "n";
        String aam = "m";

        String name = JOptionPane.showInputDialog("Enter total time in milliseconds:");  

        if(name.contains(aa)||name.contains(az)||name.contains(ax)||name.contains(ac)||name.contains(av)||name.contains(an)||name.contains(am)||name.contains(al)||name.contains(ak)||name.contains(aj)||name.contains(ah)||name.contains(ag)||name.contains(af)||name.contains(ad)||name.contains(as)||name.contains(ap)||name.contains(ao)||name.contains(ai)||name.contains(au)||name.contains(ay)||name.contains(at)||name.contains(ar)||name.contains(ae)||name.contains(aw)||name.contains(aq)||name.contains(ab)||name.contains(aC)||name.contains(aB)||name.contains(aA)||name.contains(aW)||name.contains(aQ)||name.equals(aam)||name.equals(aan)||name.equals(aab)||name.equals(aav)||name.equals(aac)||name.equals(aax)||name.equals(aaz)||name.equals(aal)||name.equals(aak)||name.equals(jaja)||name.equals(jajaa)||name.equals(aah)||name.equals(aag)||name.equals(aaj)||name.equals(aaf)||name.equals(aad)||name.equals(aas)||name.equals(aaa)||name.equals(aap)||name.equals(aao)||name.equals(aai)||name.equals(aau)||name.equals(aay)||name.equals(aat)||name.equals(aar)||name.equals(aae)||name.equals(aaw)||name.equals(aaq)){

            seconds();

        }
        else{
            autotyper sec = new autotyper();

            long longgg = Long.parseLong(name);

            Robot robot = new Robot();
            int i = 1;
            autotyper typer = new  autotyper();

            String message = "Click 'ok' when you have your intended window open";
            JOptionPane.showMessageDialog(null, message);
            while (longgg>i){
                Thread.sleep(3);
                robot.keyPress(KeyEvent.VK_CONTROL);

                robot.keyPress(KeyEvent.VK_V);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_ENTER);

                i++;
            }
        }}

}