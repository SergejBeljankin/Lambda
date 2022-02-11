package Test01;


interface Executable{
    void execute();
}

class Runner {
    public void run(Executable e){
        e.execute();
    }
}

class ExecutableImplementation implements Executable{

    @Override
    public void execute() {
        System.out.println("Hello");
    }
}

public class Lambda01 {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(new ExecutableImplementation());

        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello anonimus");
            }
        });

        runner.run(() -> System.out.println("Hello Lambda"));
    }
}
