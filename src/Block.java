import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
// Класс поля
public class Block  extends JFrame {


    // Кнопки
    private JButton a1Button ;
    private JButton a4Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a10Button;
    private JButton a11Button;
    private JButton a12Button;
    private JButton a13Button;
    private JButton a14Button;
    private JButton a15Button;
    private JButton a16Button = new JButton();
    private JTabbedPane tabbedPane1;

    // Объекты square
    square Butt1 = new square(1);
    square Butt2 = new square(2);
    square Butt3 = new square(3);
    square Butt4 = new square(4);
    square Butt5 = new square(5);
    square Butt6 = new square(6);
    square Butt7 = new square(7);
    square Butt8 = new square(8);
    square Butt9 = new square(9);
    square Butt10 = new square(10);
    square Butt11 = new square(11);
    square Butt12 = new square(12);
    square Butt13 = new square(13);
    square Butt14 = new square(14);
    square Butt15 = new square(15);
    square Butt16 = new square(16);
    square ButtonEmpty = Butt16 ;
    JButton But = a16Button;






    public Block() {
        a1Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt1, ButtonEmpty , But, a1Button);
                                            if(object.move_square(Butt1, ButtonEmpty , But, a1Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt1.name;
                                                Butt1.name = name1;
                                                ButtonEmpty = Butt1 ;
                                                But = a1Button;
                                            }


                                        }
                                    }
        );
        a2Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt2, ButtonEmpty , But, a2Button);
                                            if(object.move_square(Butt2, ButtonEmpty , But, a2Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt2.name;
                                                Butt2.name = name1;
                                                ButtonEmpty = Butt2 ;
                                                But = a2Button;
                                            }


                                        }
                                    }
        );
        a3Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt3, ButtonEmpty , But, a3Button);
                                            if(object.move_square(Butt3, ButtonEmpty , But, a3Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt3.name;
                                                Butt3.name = name1;
                                                ButtonEmpty = Butt3 ;
                                                But = a3Button;
                                            }


                                        }
                                    }
        );
        a4Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt4, ButtonEmpty , But, a4Button);
                                            if(object.move_square(Butt4, ButtonEmpty , But, a4Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt4.name;
                                                Butt4.name = name1;
                                                ButtonEmpty = Butt4 ;
                                                But = a4Button;
                                            }


                                        }
                                    }
        );
        a5Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt5, ButtonEmpty , But, a5Button);
                                            if(object.move_square(Butt5, ButtonEmpty , But, a5Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt5.name;
                                                Butt5.name = name1;
                                                ButtonEmpty = Butt5 ;
                                                But = a5Button;
                                            }


                                        }
                                    }
        );
        a6Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt6, ButtonEmpty , But, a6Button);
                                            if(object.move_square(Butt6, ButtonEmpty , But, a6Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt6.name;
                                                Butt6.name = name1;
                                                ButtonEmpty = Butt6 ;
                                                But = a6Button;
                                            }


                                        }
                                    }
        );
        a7Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt7, ButtonEmpty , But, a7Button);
                                            if(object.move_square(Butt7, ButtonEmpty , But, a7Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt7.name;
                                                Butt7.name = name1;
                                                ButtonEmpty = Butt7 ;
                                                But = a7Button;
                                            }


                                        }
                                    }
        );
        a8Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt8, ButtonEmpty , But, a8Button);
                                            if(object.move_square(Butt8, ButtonEmpty , But, a8Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt8.name;
                                                Butt8.name = name1;
                                                ButtonEmpty = Butt8 ;
                                                But = a8Button;
                                            }


                                        }
                                    }
        );
        a9Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt9, ButtonEmpty , But, a9Button);
                                            if(object.move_square(Butt9, ButtonEmpty , But, a9Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt9.name;
                                                Butt9.name = name1;
                                                ButtonEmpty = Butt9 ;
                                                But = a9Button;
                                            }


                                        }
                                    }
        );
        a10Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt10, ButtonEmpty , But, a10Button);
                                            if(object.move_square(Butt10, ButtonEmpty , But, a10Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt10.name;
                                                Butt10.name = name1;
                                                ButtonEmpty = Butt10 ;
                                                But = a10Button;
                                            }


                                        }
                                    }
        );
        a11Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt11, ButtonEmpty , But, a11Button);
                                            if(object.move_square(Butt11, ButtonEmpty , But, a11Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt11.name;
                                                Butt11.name = name1;
                                                ButtonEmpty = Butt11 ;
                                                But = a11Button;
                                            }


                                        }
                                    }
        );
        a12Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt12, ButtonEmpty , But, a12Button);
                                            if(object.move_square(Butt12, ButtonEmpty , But, a12Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt12.name;
                                                Butt12.name = name1;
                                                ButtonEmpty = Butt12 ;
                                                But = a12Button;
                                            }


                                        }
                                    }
        );
        a13Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Move object = new Move();
                object.move_square(Butt13, ButtonEmpty , But, a13Button);
                if(object.move_square(Butt13, ButtonEmpty , But, a13Button)){
                    String name1 = ButtonEmpty.name;
                    ButtonEmpty.name = Butt13.name;
                    Butt13.name = name1;
                    ButtonEmpty = Butt13 ;
                     But = a13Button;
                }


            }
        }
        );
        a14Button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Move object = new Move();
                object.move_square(Butt14, ButtonEmpty , But, a14Button);
                if(object.move_square(Butt14, ButtonEmpty , But, a14Button)){
                    String name1 = ButtonEmpty.name;
                    ButtonEmpty.name = Butt14.name;
                    Butt14.name = name1;
                    ButtonEmpty = Butt14 ;
                    But = a14Button;

                }


            }
        }
        );
        a15Button.addActionListener(new ActionListener() {

                                       @Override
                                       public void actionPerformed(ActionEvent e) {
                                           Move object = new Move();
                                           object.move_square(Butt15, ButtonEmpty , But, a15Button);
                                           if(object.move_square(Butt15, ButtonEmpty , But, a15Button)){
                                               String name1 = ButtonEmpty.name;
                                               ButtonEmpty.name = Butt15.name;
                                               Butt15.name = name1;
                                               ButtonEmpty = Butt15 ;
                                               But = a15Button;

                                           }


                                       }
                                   }
        );
        a16Button.addActionListener(new ActionListener() {

                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            Move object = new Move();
                                            object.move_square(Butt16, ButtonEmpty , But, a16Button);
                                            if(object.move_square(Butt16, ButtonEmpty , But, a16Button)){
                                                String name1 = ButtonEmpty.name;
                                                ButtonEmpty.name = Butt16.name;
                                                Butt16.name = name1;
                                                ButtonEmpty = Butt16 ;
                                                But = a16Button;
                                            }


                                        }
                                    }
        );






    }

    final void Unit(){
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

          // создание кнопок
        {
        panel.add(a1Button);
            a1Button.setBounds(50, 50, 50, 50);

        }
        {
            panel.add(a2Button);
            a2Button.setBounds(100, 50, 50, 50);

        }
        {
            panel.add(a3Button);
            a3Button.setBounds(150, 50, 50, 50);

        }
        {
            panel.add(a4Button);
            a4Button.setBounds(200, 50, 50, 50);

        }
        {
            panel.add(a5Button);
            a5Button.setBounds(50, 100, 50, 50);

        }
        {
            panel.add(a6Button);
            a6Button.setBounds(100, 100, 50, 50);

        }
        {
            panel.add(a7Button);
            a7Button.setBounds(150, 100, 50, 50);

        {
            panel.add(a8Button);
            a8Button.setBounds(200, 100, 50, 50);

        }
        {
            panel.add(a9Button);
            a9Button.setBounds(50, 150, 50, 50);

        }
        {
            panel.add(a10Button);
            a10Button.setBounds(100, 150, 50, 50);

        }
        {
            panel.add(a11Button);
            a11Button.setBounds(150, 150, 50, 50);

        }
        {
            panel.add(a12Button);
            a12Button.setBounds(200, 150, 50, 50);

        }
        {
            panel.add(a13Button);
            a13Button.setBounds(50, 200, 50, 50);

        }
        {
            panel.add(a14Button);
            a14Button.setBounds(100, 200, 50, 50);

        }
        {
            panel.add(a15Button);
            a15Button.setBounds(150, 200, 50, 50);

        }
        {
            panel.add(a16Button);
            a16Button.setBounds(200, 200, 50, 50);

        }
        setSize(400, 400);
        setLocationRelativeTo(null);




    }}}


