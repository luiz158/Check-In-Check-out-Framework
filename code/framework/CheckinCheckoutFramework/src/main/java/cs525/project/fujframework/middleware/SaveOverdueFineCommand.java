/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the MIT License (MIT);
 * 
 */

package cs525.project.fujframework.middleware;

/**
 * provides a concrete class for saving the overdue fine of customer
 * 
 * @author Jivan Nepali
 * 
 * @version 1.0.0
 *
 */
public class SaveOverdueFineCommand implements Command {

	@Override
	public boolean execute() {
		return false;
	}

	@Override
	public boolean undo() {
		return false;
	}

}
