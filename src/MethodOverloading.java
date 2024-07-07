public class MethodOverloading {
    public void numberOfParameters(){
        System.out.println("No parameters");
    };
    public void numberOfParameters(int a){
        System.out.println("One parameter");
    };

    public void dataType(int a){
        System.out.println("Integer parameter");
    }
    public void dataType(float a){
        System.out.println("Float parameter");
    }

    public void orderOfParameters(int a, float b){
        System.out.println("Float after Integer");
    }
    public void orderOfParameter(float a, int b){
        System.out.println("Integer after float");
    }
}
