package q1;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

public class Example_1{
    public static void main(String[] args) {
        System.out.println(VM.current().details());

        System.out.println(ClassLayout.parseInstance(new Object()).toPrintable());
        System.out.println(ClassLayout.parseInstance(new Point()).toPrintable());
        System.out.println(ClassLayout.parseInstance(new Mixed()).toPrintable());
        System.out.println(ClassLayout.parseInstance(new Object[3]).toPrintable());
    }
}