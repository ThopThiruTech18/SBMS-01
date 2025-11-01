package in.thiru;

//in.thiru.CustomIdGenerator

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator {

	@SuppressWarnings("deprecation")
	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {

		String prefix = "THIRU";
		String query = "SELECT COUNT(e) FROM Employee e";

		Long count = (Long) session.createQuery(query).uniqueResult();

		long nextIdVal = (count == null ? 1 : count + 1);

		return prefix +  String.format("%05d", nextIdVal); // THIRU00001
	}

}
