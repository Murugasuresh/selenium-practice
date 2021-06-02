package testNG;

import org.testng.annotations.Test;

public class groupingexample {

@Test(groups={"apple"})	
public void apple1() {
System.out.println("Apple Phone");
}
@Test(groups={"apple"})
public void apple2() {
System.out.println("Apple Phone");
}
@Test(groups={"Vivo"})
public void Vivo1() {
System.out.println("Vivo Phone");
}
@Test(groups={"Vivo"})
public void Vivo2() {
System.out.println("Vivo Phone");
}
@Test(groups={"Moto"})
public void moto1() {
System.out.println("Moto Phone");
}
@Test(groups={"Moto"})
public void moto2() {
System.out.println("Moto Phone");
}

}
