package Chapter5.Varargs;

public class VarargsDemo {

    public static int sum(int...args) {
        int sum = 0;
        for(int arg: args) {
            sum += arg;
        }
        return sum;
    }

    // The WRONG way to use varargs to pass one or more arguments
    public static int min(int...args) {
        if(args.length == 0) { // if clients pass no argument, if fails it runtime, not compile time
            throw new IllegalArgumentException("Too few arguments");
        }
        int min = args[0];
        for(int i = 1; i < args.length; i++){
            if(args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }

    public static int minV2(int firstArg, int...remainingArgs) {
        int min = firstArg;
        for(int arg: remainingArgs) {
            if(arg < min) {
                min = arg;
            }
        }
        return min;
    }
}
