package kata3;

import kata3.control.CalculateEmailDomainHistogramControl;
import kata3.control.CalculateArrayHistogramControl;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 1, 5, 1, 2, 3};
        CalculateArrayHistogramControl<Integer> control = new CalculateArrayHistogramControl(array);
        control.execute();
        
        String filename = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\kata3\\src\\kata3\\correo";
        CalculateEmailDomainHistogramControl control2 = new CalculateEmailDomainHistogramControl(filename);
        control2.execute();
    }
}