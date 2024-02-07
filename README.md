# Ejercicio Entidad Financiera

Una entidad financiera nos pide informatizar su banco para ser más eficiente ante la competencia. El responsable del departamento de informática se reune con nosotros y obtenemos la siguiente información:

- El banco trabaja principalmente con: clientes, cuentas bancarias, transacciones y productos bancarios. Además, se debe tener en cuenta los empleados del propio banco.
- De los clientes (customer) se trabaja con la siguiente información: dni, nombre, apellidos, dirección, población y código postal.
- Las cuentas bancarias (bank account) contiene: número cuenta, titular de la cuenta (cliente), transacciones, productos contratados y saldo.
- Las transacciones son los movimientos de entradas (ingresos) y salidas (pagos) de una cuenta bancaria. De los movimientos (movements) se almacena un código único por cada movimiento, descripción del movimiento e importe del movimiento. Si el importe es positivo se entiende que es un ingreso, sino, un pago.
- Los productos bancarios son definidos por el banco. Actualmente se tienen:
  - Hipoteca: es un producto del que se desea almacenar el código, nombre, descripción, fecha de inicio del préstamo, interés, fecha de fin del préstamo e importe prestado.
  - Plazo Fijo: es un producto donde el cliente ofrece al banco un dinero durante un tiempo estipulado y el banco le da un interés al cliente. Se desea almacenar: código del plazo, nombre, descripción, duración en meses del plazo, interés aplicado.
  - Tarjetas: es un producto del que se desea almacenar el código, nombre, descripción, fecha caducidad y número de la tarjeta.
- De los empleados se almacena el dni, nombre, apellidos y número de la seguridad social.
   
El banco realiza las siguiente acciones:

- Una persona puede abrir una cuenta bancaría. En el momento que la persona crea una cuenta bancaria, pasa a ser cliente del banco.
- Un cliente puede tener compras y gastos (transacciones) y se tiene que reflejar en la cuenta bancaria.
- Un cliente desea poder consultar los datos de su cuenta bancaria: transacciones realizadas, saldos, etc.
- Un cliente puede contratar productos del banco o no. Los productos van asociados a la cuenta bancaria.
