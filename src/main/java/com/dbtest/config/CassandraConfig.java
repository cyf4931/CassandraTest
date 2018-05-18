package com.dbtest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories("com.dbtest.repository")
public class CassandraConfig extends AbstractCassandraConfiguration {

    private static final String KEYSPACE_NAME = "dbtest";
    private static final String CONTACT_POINTS = "10.170.7.22";
    private static final int PORT = 9042;

    @Override
    protected String getKeyspaceName() {

        return KEYSPACE_NAME;
    }

    @Override
    protected String getContactPoints() {
        return CONTACT_POINTS;
    }

    @Override
    protected int getPort() {
        return PORT;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[] { "com.dbtest.Bean" };
    }

    /*
     * @Bean public CassandraOperations operations() throws Exception { return
     * new CassandraTemplate(session().getObject(), new
     * MappingCassandraConverter(new CassandraMappingContext())); }
     */
}
