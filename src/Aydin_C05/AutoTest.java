package Aydin_C05;

import org.junit.*;

import static org.junit.Assert.*;

import java.awt.Color;

/**
 * Tests mit JUnit
 * Github:
 * git@github.com:faydinTGM/AutoTest01.git
 * 
 * @author Fatih Aydin
 * @version 26-04-2017
 */
public class AutoTest {
	
	/**
	 * Test des 2.Konstruktors und der getType() Methode.
	 */
	@Test
	public void test1(){
		Auto a = new Auto("Audi", Color.blue, 140);
		Assert.assertEquals("Audi", "Audi", a.getType());
	}
	
	/**
	 * Test des 2.Konstruktors und der getFarbe() Methode.
	 */
	@Test
	public void test2(){
		Auto a = new Auto("Audi", Color.blue, 140);
		Assert.assertEquals("Farbe", Color.blue, a.getFarbe());
	}
	
	/**
	 * Test des 2.Konstruktors und der getLeistung() Methode.
	 */
	@Test
	public void test3(){
		Auto a = new Auto("Audi", Color.blue, 140);
		Assert.assertEquals(140, a.getLeistung(), 0);
	}
	
	/**
	 * Test des 1.Konstruktors und der getType() Methode.
	 */
	@Test
	public void test4(){
		Auto a = new Auto();
		Assert.assertEquals("Ford", "Ford", a.getType());
	}
	
	/**
	 * Test des 1.Konstruktors und der getFarbe() Methode.
	 */
	@Test
	public void test5(){
		Auto a = new Auto();
		Assert.assertEquals("Farbe", Color.RED, a.getFarbe());
	}
	
	/**
	 * Test des 1.Konstruktors und der getLeistung() Methode.
	 */
	@Test
	public void test6(){
		Auto a = new Auto();
		Assert.assertEquals(160, a.getLeistung(), 0);
	}
	
	/**
	 * Test des 2.Konstruktors und der ToString() Methode.
	 */
	@Test
	public void test7(){
		Auto a = new Auto("Audi", Color.white, 140);
		Assert.assertEquals("ToString", "Audi, weiß, 140PS", a.toString());
	}
	
	/**
	 * Test des 1.Konstruktors und der ToString() Methode.
	 */
	@Test
	public void test8(){
		Auto a = new Auto();
		Assert.assertEquals("ToString", "Ford, rot, 160PS", a.toString());
	}	
	
	/**
	 * Test der IllegalArgumentException für das Attribut farbe
	 */
	@Test (expected=IllegalArgumentException.class)
	public void test9() {
		Auto a = new Auto("Audi", null, 140);
	}
	
	/**
	 * Test der IllegalArgumentException für das Attribut type
	 */
	@Test (expected=IllegalArgumentException.class)
	public void test10() {
		Auto a = new Auto(null, Color.white, 140);
	}
	
	/**
	 * Test der IllegalArgumentException für das Attribut leistung
	 */
	@Test (expected=IllegalArgumentException.class)
	public void test11() {
		Auto a = new Auto("Audi", Color.white, -140);
	}
	
	/**
	 * Test der IllegalArgumentException für die setFarbe Methode
	 */
	@Test (expected=IllegalArgumentException.class)
	public void test12() {
		Auto a = new Auto("Audi", Color.white, 140);
		a.setFarbe(null);
	}
	
	/**
	 * Test der IllegalArgumentException für die setLeistung Methode
	 */
	@Test (expected=IllegalArgumentException.class)
	public void test13() {
		Auto a = new Auto("Audi", Color.white, 140);
		a.setLeistung(-190);
	}
	
	/**
	 * Test der IllegalArgumentException für die setType Methode
	 */
	@Test (expected=IllegalArgumentException.class)
	public void test14() {
		Auto a = new Auto("Audi", Color.white, 140);
		a.setType(null);
	}
	
	/**
	 * Test der IllegalArgumentException für die setType Methode
	 */
	@Test (expected=IllegalArgumentException.class)
	public void test15() {
		Auto a = new Auto("Audi", Color.white, 140);
		a.setType(" ");
	}
	
	/**
	 * Test der IllegalArgumentException für das Attribut type
	 */
	@Test (expected=IllegalArgumentException.class)
	public void test16() {
		Auto a = new Auto(" ", Color.white, 140);
	}
	
	/**
	 * Test der setType() Methode.
	 */
	@Test
	public void test17(){
		Auto a = new Auto();
		a.setType("Audi");
		Assert.assertEquals("Audi", "Audi", a.getType());
	}
	
	/**
	 * Test der setFarbe() Methode.
	 */
	@Test
	public void test18(){
		Auto a = new Auto();
		a.setFarbe(Color.blue);
		Assert.assertEquals("Farbe", Color.blue, a.getFarbe());
	}
	
	/**
	 * Test der setLeistung() Methode.
	 */
	@Test
	public void test19(){
		Auto a = new Auto();
		a.setLeistung(140);
		Assert.assertEquals(140, a.getLeistung(), 0);
	}
}
