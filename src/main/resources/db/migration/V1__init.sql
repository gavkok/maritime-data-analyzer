CREATE TABLE vessel_metrics (
    id SERIAL PRIMARY KEY,
    vessel_code VARCHAR(50) NOT NULL,
    datetime TIMESTAMP NOT NULL,
    latitude DECIMAL(10, 6) NOT NULL,
    longitude DECIMAL(10, 6) NOT NULL,
    power DECIMAL(10, 2),
    fuel_consumption DECIMAL(10, 2),
    actual_speed_overground DECIMAL(5, 2),
    proposed_speed_overground DECIMAL(5, 2),
    predicted_fuel_consumption DECIMAL(10, 2),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
