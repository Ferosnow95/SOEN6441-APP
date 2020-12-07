package Guice;

import com.google.inject.AbstractModule;
import com.typesafe.config.Config;

public class CommonModule extends AbstractModule {

    private final Config config;

    /**
     * Default constructor
     *
     * @param config configuration object
     */

    public CommonModule(Config config ) {
        this.config = config;
    }

    /**
     * Configures the module
     *
     */
    @Override
    protected void configure() {

    }
}
