
/**
 * Author:  antonio
 * Created: 28-abr-2017
 */

/*
createdb monitor-ht -E UTF8 -l es_ES.UTF-8

CREATE USER dilar_monitor PASSWORD 'Lupita#2017#';

ALTER USER dilar_monitor WITH SUPERUSER;

*/

-- 28EE41012F1602BE

CREATE TABLE Devices
(
    device_uid          varchar(90) NOT NULL,
    tipo                text,
    location            text,
    fecha_alta          timestamp default now(),
    primary key (device_uid)
);




CREATE TABLE Measurements
(
    id                  serial NOT NULL,
    uid                 varchar(90) references Devices(device_uid),
    fecha_hora          timestamp default now(),
    primary key (id)
);
