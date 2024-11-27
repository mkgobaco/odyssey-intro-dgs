package com.example.listings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.micrometer.core.instrument.*;
import io.micrometer.datadog.*;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ListingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListingsApplication.class, args);
	}

/*
	@Bean
	public MeterRegistry meterRegistry() {
		// Configure Datadog-specific settings
		DatadogConfig datadogConfig = new DatadogConfig() {
			@Override
			public String apiKey() {
				return "882574513b34a278627b6c72a498d3c7";
			}

			@Override
			public String get(String key) {
				return null; // Use the default values for other configuration options
			}
		};

		// Create and return a DatadogMeterRegistry
		return new DatadogMeterRegistry(datadogConfig, Clock.SYSTEM);
	}
*/

//	// Define a sample counter bean
//	@Bean
//	public Counter sampleCounter(MeterRegistry meterRegistry) {
//		return Counter.builder("custom.counter")
//				.description("A custom counter metric")
//				.register(meterRegistry);
//	}
}
