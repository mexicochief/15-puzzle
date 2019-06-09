
class square{                           // Класс, чтобы создавать экземпляры квадратов
    private int sqrt_num;
    int x ;
    int y ;
    String name;
    // Конструктор координат, выставляет квадраты в базовом положении
    square(int num ){
        if (num == 16) name = "";
        else name = Integer.toString (num);
        if( num % 4 == 0){
            x = 4;
            y = (num / 4);
        }
        else {
            x = num % 4;
            y = (num / 4) + 1;


        }
    }
}

