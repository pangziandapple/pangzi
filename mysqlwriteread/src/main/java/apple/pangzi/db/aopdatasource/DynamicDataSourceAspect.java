package apple.pangzi.db.aopdatasource;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

public class DynamicDataSourceAspect {

	public void pointCut() {
	};

	public void before(JoinPoint point) {
		Object target = point.getTarget();
		String methodName = point.getSignature().getName();
		Class<?>[] clazz = target.getClass().getInterfaces();
		Class<?>[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod().getParameterTypes();
		try {
			Method method = clazz[0].getMethod(methodName, parameterTypes);
			if (method != null && method.isAnnotationPresent(DataSource.class)) {
				DataSource data = method.getAnnotation(DataSource.class);
				//此时存放数据源时不会受多线程的影响
				DynamicDataSourceHolder.putDataSource(data.value());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void after(JoinPoint point) {
		DynamicDataSourceHolder.clearDataSource();
	}
}
