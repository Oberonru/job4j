package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Test
*
*@autor Alexey Petrushenko
*version 1.0.0
*@since 20.11.2018
*/

public class CalculateTest {

/**
*Test eho
*/	

@Test
public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Alexey Petrushenko";
    String expect = "Echo, echo, echo :  Alexey Petrushenko"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
}