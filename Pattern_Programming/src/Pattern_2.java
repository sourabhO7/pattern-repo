public class Pattern_2 {
    public static void main(String[] args) {
        Pattern_2.fun1();
        System.out.println();
        Pattern_2.fun2();
        System.out.println();
        Pattern_2.fun3();
        System.out.println();
        Pattern_2.fun4();
        System.out.println();
        Pattern_2.fun5();
        System.out.println();
        Pattern_2.fun6();
        System.out.println();
        Pattern_2.fun7();
        System.out.println();
        Pattern_2.fun8();
        System.out.println();
        Pattern_2.fun9();
    }

    public static void fun1(){
        for(int row=0;row<10;row++){
            for(int col=0;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void fun2(){
        for(int row=0;row<10;row++){
            for(int col=0;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void fun3(){
        // approach 1
        for(int row=0;row<10;row++){
            for(int col=0;col<=row;col++){
                System.out.print(9-col+" ");
            }
            System.out.println();
        }

        System.out.println();

        // approach 2
        for(int row=0;row<10;row++){
            for(int col=9;col>=9-row;col--){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void fun4(){
        for(int row=0;row<10;row++){
            for(int col=0;col<=row;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }

    public static void fun5(){
        // approach 1
        for(int row=0;row<10;row++){
            for(int col=0;col<=row;col++){
                System.out.print(9-row+" ");
            }
            System.out.println();
        }

        System.out.println();

        // approach 2
        for(int row=9;row>=0;row--){
            for(int col=0;col<=9-row;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }

    public static void fun6(){
        for(int row=0;row<10;row++){
            for(int col=0;col<=row;col++){
                System.out.print((char)(65+col)+" ");
            }
            System.out.println();
        }
    }

    public static void fun7(){
        // approach 1
        for(int row=0;row<10;row++){
            for(int col=0;col<=row;col++){
                System.out.print((char)(74-col)+" ");
            }
            System.out.println();
        }

        System.out.println();

        // approach 2
        for(int row=0;row<10;row++){
            for(int col=74;col>=74-row;col--){
                System.out.print((char)col+" ");
            }
            System.out.println();
        }
    }

    public static void fun8(){
        for(int row=0;row<10;row++){
            for(int col=0;col<=row;col++){
                System.out.print((char)(65+row)+" ");
            }
            System.out.println();
        }
    }

    public static void fun9(){
        // approach 1
        for(int row=0;row<10;row++){
            for(int col=0;col<=row;col++){
                System.out.print((char)(74-row)+" ");
            }
            System.out.println();
        }

        System.out.println();

        // approach 2
        for(int row=74;row>=65;row--){
            for(int col=0;col<=74-row;col++){
                System.out.print((char)(row)+" ");
            }
            System.out.println();
        }
    }
}
