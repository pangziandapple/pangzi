package apple.pangzi.db.aopdatasource;

public class DynamicDataSourceHolder {

	/**
	 * 多线程时变量变量不会相互影响
	 */
	private static final ThreadLocal<DynamicDataSourceGlobal> holder = new ThreadLocal<DynamicDataSourceGlobal>();

	public static void putDataSource(DynamicDataSourceGlobal dataSource) {
		holder.set(dataSource);
	}

	public static DynamicDataSourceGlobal getDataSource() {
		return holder.get();
	}

	public static void clearDataSource() {
		holder.remove();
	}

}