/**
 * 
 */
package com.Identify_NewBikes.StepDefinitions;

import java.io.IOException;

import org.testng.annotations.Optional;

/**
 * @author 2303927
 *
 */
public interface Hooks {

	void setUp(@Optional String browser) throws IOException;
	void tearDown();
	void setUp() throws IOException;
}
