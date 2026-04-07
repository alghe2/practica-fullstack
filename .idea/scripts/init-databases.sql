-- Script de inicialización para las 10 bases de datos del proyecto CC-Analytics
-- CERO MONOLITOS: Cada microservicio tiene su propia base de datos aislada.

CREATE DATABASE IF NOT EXISTS db_auth;
CREATE DATABASE IF NOT EXISTS db_usuarios;
CREATE DATABASE IF NOT EXISTS db_jugadores;
CREATE DATABASE IF NOT EXISTS db_partidos;
CREATE DATABASE IF NOT EXISTS db_estadisticas;
CREATE DATABASE IF NOT EXISTS db_rendimiento;
CREATE DATABASE IF NOT EXISTS db_recomendaciones;
CREATE DATABASE IF NOT EXISTS db_formaciones;
CREATE DATABASE IF NOT EXISTS db_reportes;
CREATE DATABASE IF NOT EXISTS db_notificaciones;