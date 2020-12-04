package org.openqa.selenium;

public interface WebDriver {

	void get(String uri);

	void close();

	void quit();

	void findElement(By linkText);

}
