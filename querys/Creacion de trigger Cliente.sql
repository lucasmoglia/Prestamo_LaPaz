CREATE OR REPLACE FUNCTION prestamo.create_code_cliente_function() 
RETURNS trigger AS $create_code_cliente$
DECLARE
BEGIN  
  NEW.codigo := 'C' || NEW.id + 1000000;
  RETURN NEW;
END;
$create_code_cliente$ LANGUAGE plpgsql;

CREATE TRIGGER create_code_cliente
BEFORE INSERT ON prestamo.cliente
FOR EACH ROW
EXECUTE PROCEDURE prestamo.create_code_cliente_function();