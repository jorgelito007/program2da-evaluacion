USE recaudacion;

CREATE TABLE Vehiculos (
    Matricula CHAR(7) PRIMARY KEY,
    MarcaModelo VARCHAR(50),
    Impuesto DECIMAL(6,2) NOT NULL DEFAULT 50.00,
    CHECK (Impuesto >= 10.00)
);