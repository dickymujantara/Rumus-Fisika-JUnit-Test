package com.company;
import static org.junit.Assert.*;
import org.junit.*;

public class RumusFisikaTest {
    RumusFisika rumusFisika;

    @Before
    public void init(){
        rumusFisika = new RumusFisika();
    }

    @Test
    public void momentum() {
        assertEquals(1.2, rumusFisika.momentum(0.6,2),0);
    }

    @Test
    public void perubahanMomentum() {
        assertEquals(4,rumusFisika.perubahanMomentum(2,3,5),0);
    }

    @Test
    public void energiPotensial() {
        assertEquals(15, rumusFisika.energiPotensial(0.5,3),0);
    }

    @Test
    public void energiKinetik() {
        assertEquals(6.25, rumusFisika.energiKinetik(0.5,5),0);
    }

    @Test
    public void energiMekanik() {
        assertEquals(7.5,rumusFisika.energiMekanik(2.5,3),0);
    }
}