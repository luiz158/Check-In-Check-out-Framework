/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the MIT License (MIT);
 */
package cs525.project.fujframework.core.dataaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This @{DbActionImpl} class implements @{DbAction} used for performing
 * database actions by communicating with @{SimpleConnectionPool}
 * 
 * @author Fish
 * 
 *         version 1.0.0
 *
 */
public class DbActionImpl implements DbAction {
	SimpleConnectionPool connection = SimpleConnectionPool.getInstance();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cs525.project.fujframework.core.dataaccess.DbAction#Create(java.lang.
	 * String)
	 */
	@Override
	public int Create(String query) {
		Connection con = null;
		PreparedStatement ps = null;
		int countRecord = 0;
		try {

			con = connection.getConnection();
			ps = con.prepareStatement(query);

			countRecord = ps.executeUpdate();
		} catch (Exception e) {

		} finally {
			cleanupResources(ps, con);
		}
		return countRecord;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cs525.project.fujframework.core.dataaccess.DbAction#read(java.lang.
	 * String)
	 */
	@Override
	public Object read(String query) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {

			con = connection.getConnection();
			ps = con.prepareStatement(query);

			rs = ps.executeQuery();
		} catch (Exception e) {
			// false;
		} finally {
			cleanupResources(ps, con);
		}

		return rs;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cs525.project.fujframework.core.dataaccess.DbAction#delete(java.lang.
	 * String)
	 */
	@Override
	public int delete(String query) {
		PreparedStatement ps = null;
		Connection con = null;
		int countRecord = 0;
		try {

			con = connection.getConnection();
			ps = con.prepareStatement(query);
		} catch (Exception e) {

		} finally {
			cleanupResources(ps, con);
		}
		return countRecord;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cs525.project.fujframework.core.dataaccess.DbAction#update(java.lang.
	 * String)
	 */
	@Override
	public int update(String query) {
		Connection con = null;
		PreparedStatement ps = null;
		int recordCounter = 0;
		try {

			con = connection.getConnection();
			ps = con.prepareStatement(query);

			recordCounter = ps.executeUpdate();
		} catch (Exception e) {

			return recordCounter;
		} finally {
			cleanupResources(ps, con);
		}
		return recordCounter;
	}

	private void cleanupResources(PreparedStatement ps, Connection con) {
		try {
			ps.close();
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
