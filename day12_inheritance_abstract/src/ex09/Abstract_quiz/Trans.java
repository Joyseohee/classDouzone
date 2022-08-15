/* 문제1] Trans 추상클래스
 * abstract method start()/stop()
 * public String name(String name) {
 * return name;}
 * 
 * 
 * sub class : Subway/Bus/Bicycle
 MainEntry에서 메인 함수 구현

 */

package ex09.Abstract_quiz;

public abstract class Trans {
	protected String sub = null;
	public abstract int ask();
	public abstract char ask2();
	public abstract void start(String sub);
	public abstract void stop(String sub);
}
