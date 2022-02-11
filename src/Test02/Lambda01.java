package Test02;


/*
С типом возвращаемых переменных
 */

interface Executable{
    int execute();
}

class Runner {
    public void run(Executable e){
        int a = e.execute();
        System.out.println(a);
    }
}



public class Lambda01 {
    public static void main(String[] args) {
        Runner runner = new Runner();


        runner.run(new Executable() {
            @Override
            public int execute() {
                return 1;
            }
        });

        runner.run(() -> 5);
    }
}
