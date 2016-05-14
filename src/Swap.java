
public class Swap {
    Main m;
    
    Swap(Main m){
        this.m = m;
    }
    
    void swapButton(int i){
        if((i-4)>=0 && m.button[i-4].getText().equals("")){
            m.button[i-4].setText(m.button[i].getText());
            m.button[i].setText("");
        }
        else if(i-1>=0 && m.button[i-1].getText().equals("")){
           m.button[i-1].setText(m.button[i].getText());
           m.button[i].setText("");
        }
        else if(i+1>=0 && m.button[i+1].getText().equals("")){
           m.button[i+1].setText(m.button[i].getText());
           m.button[i].setText("");
        }
        else if(i+4>=0 && m.button[i+4].getText().equals("")){
           m.button[i+4].setText(m.button[i].getText());
           m.button[i].setText("");
        }
    }
}
