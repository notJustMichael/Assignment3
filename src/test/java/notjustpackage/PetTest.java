package notjustpackage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {
    @Before
    public void setUp() throws Exception {
        Pet pet;
    }

    @After
    public void tearDown() throws Exception {
        Assert.assertEquals(7, pet.getAge());
        //Assert.assertEquals(5, pet.getAge()); iii. failing test
    }

    @Test
    public void makePetTest() throws Exception{}
    Pet pet = new Pet.Builder()
            .id("123")
            .age(7)
            .name("Spotty")
            .sex(true)
            .build();
}