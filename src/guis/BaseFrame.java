package guis;

import db_objs.User;

import javax.swing.*;

public abstract class BaseFrame extends JFrame {
    //store user information
    protected User user;

    public BaseFrame(String title) {initialize(title);}
    public BaseFrame(String title, User user) {
        //initialize user
        this.user = user;

        initialize(title);
    }


    private void initialize(String title) {
        //instantiate jframe properties and ass a title to the bar
        setTitle(title);

        //set size(in pixels)

        setSize(420, 600);

        //terminate prorgram when the gui is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //setDe layout to null to have absolute layout which allows to manually specify the size and position of each gui component
        setLayout(null);

        //prevent gui from being resized
        setResizable(false);

        //launch the gui in the center of the screen
        setLocationRelativeTo(null);

        //call on the subclass' addGuiComponent()
        addGuiComponents();
    }
    //this method will need to be defined by subclasses when this class is being inherited from
    protected abstract void addGuiComponents();
}
