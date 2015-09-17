/**
 * Sep 17, 2015
 */
package su.artix.domain;

/**
 * @author sdv
 *
 */
public class Client {

	private String name;
	
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", age=" + age + "]";
	}

	
	
}
