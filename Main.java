public class Main {
    public static void main(String[] args) {

        // Crear un objeto de la clase Empleado
        Employee employee = new Employee("John", 10000);
        // Podemos acceder al nombre directamente ya que es public
        System.out.println(employee.name);
        // accedemos al atributo salario por medio de get y set ya que es private
        System.out.println(employee.getSalary());
        employee.setSalary(5000);
        System.out.println(employee.getSalary());


        // 
        BankAccount account = new BankAccount(1234, "Ahorro");
        account.setBalance(1000);

        // Si tratamos de acceder al numero de cuenta directamente, obtendremos un error
        // Debido a que el campo accountNumber es privado, no podemos acceder directamente
        //System.out.println("Account number: " + account.accountNumber); // The field accountNumber is not visible

        // La solucion es usar el metodo getAccountNumber
        System.out.println("Account number: " + account.getAccountNumber());
        account.showAccountDetails();

        Utilities utils = new Utilities();

        var result = utils.add(10, 20);
        var result2 = utils.subtract(10, 20);
        var result3 = utils.multiply(10, 20);
        var result4 = utils.divide(10, 20);

        System.out.println("El resultado de la suma es: entre "+10+" y "+20+" es: " + result);
        System.out.println("El resultado de la resta es: entre "+10+" y "+20+" es: " + result2);
        System.out.println("El resultado de la multiplicacion es: entre "+10+" y "+20+" es: " + result3);
        System.out.println("El resultado de la división es: entre "+10+" y "+20+" es: " + result4);
    }
}
