package Test04;


/*
С типом возвращаемых переменных и принимаемых несколько параметров
 */

interface Executable{
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e){
        int a = e.execute(5, 5);
        System.out.println(a);
    }
}


public class Lambda01 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                return x+y+5;
            }
        });

        runner.run((x,y) -> y+x+5);
    }
}
