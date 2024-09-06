package ru.vtvhw.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MavenCircleTest {
    @Test
    public void createMavenCircle() {
        MavenCircle mavenCircle = new MavenCircle(4);
        System.out.println(mavenCircle);
        assertEquals(4, mavenCircle.getRadius());
    }
}
