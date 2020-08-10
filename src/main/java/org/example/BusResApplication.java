package org.example;

import io.dropwizard.Application;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.jdbi.v3.core.Jdbi;

public class BusResApplication extends Application<BusResConfiguration> {

    public static void main(final String[] args) throws Exception {
        new BusResApplication().run(args);
    }

    @Override
    public String getName() {
        return "BusRes";
    }

    @Override
    public void initialize(final Bootstrap<BusResConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final BusResConfiguration configuration,
                    final Environment environment) {
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, configuration.getDataStoreFactory(),"postgresql");
        //environment.jersey().register(new ContactResources(jdbi));
    }

}
