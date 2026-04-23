# Laboratorio-7-Ejercicio-1
 
Una empresa requiere un módulo software para gestionar la liquidación de la nómina de sus 
empleados. La empresa tiene dos tipos de empleados: Vendedores y Repartidores, ambos con 
información básica como identificación, nombre, edad y año de ingreso. Cada empleado tiene 
un salario básico. 
 
Un vendedor recibe una comisión del 15% sobre el valor total de las ventas realizadas durante 
un mes. El pago mensual se calcula: Sumando el salario básico mas la comisión y restando el 
10% por prestaciones sociales.   
 
Un repartidor tiene un acumulado de repartos, y el valor pagado por cada reparto es de 
$10.000. Un empleado repartidor se encuentra asignado a una zona que puede ser A, B, C o 
D. Al crear un Empleado Repartidor, el programa debe comprobar la zona. Si la zona 
proporcionada es diferente de A, B, C o D, por defecto se debe asignar el valor 'C' al atributo 
zona. Esta validación de la zona debe realizarse en la clase  y debe ser llamada en el momento 
en que se crea una instancia de la clase Empleado Repartidor y no debe ser directamente visible 
por ninguna otra clase. El pago mensual se calcula: Sumando el salario básico mas el valor total 
de sus repartos y se resta el 10% por prestaciones sociales. 
 
Todos los empleados reciben una bonificación, si cumplen las siguientes condiciones: 
 
1. Si un empleado vendedor tiene más de 20 años en la empresa recibe una bonificación de 
$100.000. 
2. Si un empleado repartidor tiene 5 años en la empresa y se encuentra asignado a la zona C 
recibe una bonificación de $50.000. 
Artefactos a entregar 
 1  Modelo de diseño diagrama de clases UML debidamente documentado. 
 2  Proyecto donde se implemente el modelo de diseño diagrama de clases UML. 
 3  Dentro del proyecto implemente la clase Empresa con un método main() para probar el 
modelo de diseño. 
 4  En el método main() implemente: 
 5  Declare un arreglo dinámico de la clase Empleado. 
 6  Adicione tres instancias (objetos) de la clase Empleado Vendedor y 3 instancias (objetos) 
de la clase Empleado Repartidor. 
 7  Muestre por consola los datos de los empleados en el siguiente formato: 
“Vendedor, Identificación, Nombre, Año de Ingreso, Salario Básico, Valor 
Comisión, Descuentos, Neto Pagado”  
“Repartidor, Identificación, Nombre, Año de Ingreso, Salario Básico, Numero 
Repartos, Valor Pagado Repartos, Descuentos, Neto Pagado” 
                         PROGRAMA CIENCIAS DE LA COMPUTACIÓN E INTELIGENCIA 
ARTIFICIAL 
                                        ASIGNATURA FUNDAMENTOS DE DISEÑO DE SOFTWARE 
                        Laboratorio # 7 Relaciones entre clase herencia, clase abstractas, polimorfismo   
 
 8  Liquidar la nómina. Iterar sobre el arreglo dinámico y para cada objeto empleado instancia 
el método liquidar nómina. 
 9  Muestre por consola los datos de los empleados en el siguiente formato: 
“Vendedor, Identificación, Nombre, Año de Ingreso, Salario Básico, Total 
Ventas, Valor Comisión, Descuentos, Neto Pagado”  
“Repartidor, Identificación, Nombre, Año de Ingreso, Salario Básico, Numero 
Repartos, Valor Pagado Repartos, Descuentos, Neto Pagado” 
