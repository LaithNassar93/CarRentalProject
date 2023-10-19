insert into station (city) values
                               ('Alabama'), ('Alaska'), ('Arizona'), ('Arkansas'), ('California'),
                               ('Colorado'), ('Connecticut'), ('Delaware'), ('Florida'), ('Georgia'),
                               ('Hawaii'), ('Idaho'), ('Illinois'), ('Indiana'), ('Iowa'),
                               ('Kansas'), ('Kentucky'), ('Louisiana'), ('Maine'), ('Maryland'),
                               ('Massachusetts'), ('Michigan'), ('Minnesota'), ('Mississippi'), ('Missouri'),
                               ('Montana'), ('Nebraska'), ('Nevada'), ('New Hampshire'), ('New Jersey'),
                               ('New Mexico'), ('New York'), ('North Carolina'), ('North Dakota'), ('Ohio'),
                               ('Oklahoma'), ('Oregon'), ('Pennsylvania'), ('Rhode Island'), ('South Carolina'),
                               ('South Dakota'), ('Tennessee'), ('Texas'), ('Utah'), ('Vermont'),
                               ('Virginia'), ('Washington'), ('West Virginia'), ('Wisconsin'), ('Wyoming');

insert into car (registration_nr, construction_year, mileage, model, station_id)
values
    ('car1', 2001, 16000, 'BMW', 1),
    ('car2', 2002, 25000, 'Toyota', 1),
    ('car3', 2003, 18000, 'Honda', 1),
    ('car4', 2004, 22000, 'Mercedes', 1),
    ('car5', 2005, 30000, 'Audi', 1),
    ('car6', 2006, 35000, 'Chevrolet', 1),
    ('car7', 2007, 40000, 'Nissan', 1),
    ('car8', 2008, 42000, 'Mazda', 1),
    ('car9', 2009, 50000, 'Ford', 1),
    ('car10', 2010, 52000, 'Volkswagen', 1),
    ('car11', 2011, 60000, 'Hyundai', 1),
    ('car12', 2012, 65000, 'Kia', 1),
    ('car13', 2013, 70000, 'Subaru', 1),
    ('car14', 2014, 75000, 'Jeep', 1),
    ('car15', 2015, 80000, 'Dodge', 1),
    ('car16', 2016, 85000, 'Chrysler', 1),
    ('car17', 2017, 90000, 'Tesla', 1),
    ('car18', 2018, 95000, 'Jaguar', 1),
    ('car19', 2019, 100000, 'Land Rover', 1),
    ('car20', 2020, 105000, 'Porsche', 1),
    ('car21', 2001, 110000, 'Ferrari', 1),
    ('car22', 2002, 115000, 'Lamborghini', 1),
    ('car23', 2003, 120000, 'Maserati', 1),
    ('car24', 2004, 125000, 'Aston Martin', 1),
    ('car25', 2005, 130000, 'Rolls Royce', 1),
    ('car26', 2006, 135000, 'Bentley', 1),
    ('car27', 2007, 140000, 'Bugatti', 1),
    ('car28', 2008, 145000, 'McLaren', 1),
    ('car29', 2009, 150000, 'Alfa Romeo', 1),
    ('car30', 2010, 155000, 'Lexus', 1),
    ('car31', 2011, 160000, 'Infiniti', 1),
    ('car32', 2012, 165000, 'Lincoln', 1),
    ('car33', 2013, 170000, 'Cadillac', 1),
    ('car34', 2014, 175000, 'Mitsubishi', 1),
    ('car35', 2015, 180000, 'Suzuki', 1),
    ('car36', 2016, 185000, 'Volvo', 1),
    ('car37', 2017, 190000, 'Saab', 1),
    ('car38', 2018, 195000, 'Peugeot', 1),
    ('car39', 2019, 200000, 'Renault', 1),
    ('car40', 2020, 205000, 'Skoda', 1);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car212', 2018, 50000, 'Toyota', 3);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car213', 2019, 60000, 'Honda', 4);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car214', 2016, 120000, 'Ford', 5);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car215', 2015, 130000, 'Chevrolet', 6);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car216', 2020, 25000, 'BMW', 7);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car217', 2018, 70000, 'Mercedes', 8);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car218', 2017, 80000, 'Audi', 9);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car219', 2019, 55000, 'Volkswagen', 10);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car220', 2016, 95000, 'Nissan', 11);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car221', 2020, 30000, 'Hyundai', 12);





insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car211', 2017, 160000, 'Seat', 2);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car311', 2016, 181200, 'Audi', 3);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car411', 2002, 97212, 'Mazda', 3);

insert into car (registration_nr, construction_year, mileage, model, station_id)
values ('car511', 2003, 200, 'Mercedes', null);

insert into customer (customer_number, first_name, last_name) values (111114, 'Laith', 'Nassar');
insert into customer (customer_number, first_name, last_name) values (111113, 'Sally', 'Haddad');
insert into customer (customer_number, first_name, last_name) values (111112, 'Maher', 'Kamel');

insert into rental (
    rental_date,
    car_registration_nr,
    driver_customer_number,
    rental_station_id,
    return_date,
    return_station_id,
    km
) values (
    CURRENT_DATE(),
    'car1',
    111114,
    1,
    CURRENT_DATE(),
    2,
    500
);

insert into rental (
    rental_date,
    car_registration_nr,
    driver_customer_number,
    rental_station_id,
    return_date,
    return_station_id,
    km
) values (
    CURRENT_DATE(),
    'car2',
    111113,
    3,
    CURRENT_DATE(),
    2,
    10000
);

insert into rental (
    rental_date,
    car_registration_nr,
    driver_customer_number,
    rental_station_id,
    return_date,
    return_station_id,
    km
) values (
    CURRENT_DATE(),
    'car3',
    111112,
    3,
    CURRENT_DATE(),
    2,
    500
);

insert into rental (
    rental_date,
    car_registration_nr,
    driver_customer_number,
    rental_station_id,
    return_date,
    return_station_id,
    km
) values (
    CURRENT_DATE(),
    'car4',
    111114,
    1,
    CURRENT_DATE(),
    2,
    500
);

insert into rental (
    rental_date,
    car_registration_nr,
    driver_customer_number,
    rental_station_id,
    return_date,
    return_station_id,
    km
) values (
    CURRENT_DATE(),
    'car5',
    111114,
    1,
    null,
    null,
    null
);
