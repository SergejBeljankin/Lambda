package Test03;


/*
С типом возвращаемых переменных и принимаемых параметров
 */

interface Executable{
    int execute(int x);
}

class Runner {
    public void run(Executable e){
        int a = e.execute(5);
        System.out.println(a);
    }
}


public class Lambda01 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new Executable() {
            @Override
            public int execute(int x) {
                return x+5;
            }
        });

        runner.run(x -> x+5);
    }
}
