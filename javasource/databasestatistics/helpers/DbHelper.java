package databasestatistics.helpers;

import java.sql.Connection;
import java.sql.SQLException;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;

public class DbHelper {
	public static ILogNode LOGGER = Core.getLogger("DatabaseStatistics");
	private static String IDENTIFIERQUOTESTRING = null;
	
	private static String getIdentifierQuoteString(Connection connection) throws SQLException {
		if (IDENTIFIERQUOTESTRING == null) {
			IDENTIFIERQUOTESTRING = connection.getMetaData().getIdentifierQuoteString();
		}
		return IDENTIFIERQUOTESTRING;
	}
	
	public static String escapeIdentifier(Connection connection, String identifier) throws SQLException {
		return getIdentifierQuoteString(connection) + identifier + getIdentifierQuoteString(connection);
	}
}
