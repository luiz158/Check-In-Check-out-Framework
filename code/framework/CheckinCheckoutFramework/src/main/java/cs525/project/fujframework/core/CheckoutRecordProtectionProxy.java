/**
 * 
 */
package cs525.project.fujframework.core;

import java.sql.ResultSet;

import cs525.project.fujframework.utils.LoginUtil;

/**
 * This @{CheckOutRecordProtectionProxy} class
 * implements @{CheckoutRecordFacade} interface acts like protection Proxy to
 * provide access control for appropriate user.
 * 
 * @author Fish
 * @version 1.0.0
 *
 */
public class CheckoutRecordProtectionProxy implements CheckoutRecordFacade {

	private CheckoutRecordFacade checkOutRecordFacade;
	private boolean isStaff = false;

	public CheckoutRecordProtectionProxy() {
		this.checkOutRecordFacade = new CheckoutRecordFacadeImpl();
		isStaff = LoginUtil.isStaff();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cs525.project.fujframework.core.CheckoutRecordFacade#saveCheckoutRecord(
	 * cs525.project.fujframework.core.CheckoutRecordEntry)
	 */
	@Override
	public int saveCheckoutRecord(CheckoutRecordEntry checkoutRecordEntry) {
		if (isStaff) {
			return checkOutRecordFacade.saveCheckoutRecord(checkoutRecordEntry);
		}

		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cs525.project.fujframework.core.CheckoutRecordFacade#removeCheckoutRecord
	 * (cs525.project.fujframework.core.CheckoutRecordEntry)
	 */
	@Override
	public int removeCheckoutRecord(CheckoutRecordEntry checkoutRecordEntry) {
		if (isStaff) {
			return checkOutRecordFacade.removeCheckoutRecord(checkoutRecordEntry);
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cs525.project.fujframework.core.CheckoutRecordFacade#checkInRecord(cs525.
	 * project.fujframework.core.CheckoutRecordEntry)
	 */
	@Override
	public int checkInRecord(CheckoutRecordEntry checkoutRecordEntry) {
		if (isStaff) {
			return checkOutRecordFacade.checkInRecord(checkoutRecordEntry);
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cs525.project.fujframework.core.CheckoutRecordFacade#undoCheckIn(cs525.
	 * project.fujframework.core.CheckoutRecordEntry)
	 */
	@Override
	public int undoCheckIn(CheckoutRecordEntry checkoutRecordEntry) {
		if (isStaff) {
			return checkOutRecordFacade.undoCheckIn(checkoutRecordEntry);
		}
		return 0;
	}

	@Override
	public ResultSet getAllCheckoutRecordsByCustomer(int customerId, Class<?> tableName, Class<?> joinTableName) {
		return checkOutRecordFacade.getAllCheckoutRecordsByCustomer(customerId, tableName, joinTableName);
	}

	@Override
	public ResultSet getAllCheckoutRecordsByCustomerAndUser(int customerId, int userId, Class<?> tableName) {
		return checkOutRecordFacade.getAllCheckoutRecordsByCustomerAndUser(customerId, userId, tableName);
	}

}
