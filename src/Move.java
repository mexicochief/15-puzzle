import javax.swing.*;
// Класс который отвечает за перемещение квадрата(меняет местами пустой квадрат с выбранным соседним квадратом)
class Move{


    boolean move_square(square o, square p, JButton empty, JButton button){
         int vert = p.x - o.x;
         int hor = p.y - o.y;
         if((Math.abs(vert) <= 1 && Math.abs(hor) == 0)  ||  (Math.abs(vert) == 0 && Math.abs(hor) <= 1)){
             button.setText(p.name);
             empty.setText(o.name);
             // имена объектов меняются местами
            /* String name1 = p.name;
             p.name = o.name;
             o.name = name1;*/

             return true;
         }
         else return false;
}}