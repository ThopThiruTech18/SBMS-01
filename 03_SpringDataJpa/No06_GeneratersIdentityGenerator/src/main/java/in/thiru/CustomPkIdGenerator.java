package in.thiru;

//in.thiru.CustomPkIdGenerator

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomPkIdGenerator implements IdentifierGenerator {

	@SuppressWarnings("deprecation")
	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {

		String name = "SNEHA";

		String query = "Select count(emp) FROM Employee emp";

		Long count = (Long) session.createQuery(query).uniqueResult();

		long nextValue = (count == null ? 1 : count + 1);

		return name + String.format("%07d", nextValue);
	}

}
