package Empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> listaEmpleados;

    public Empresa() {
        this.listaEmpleados = new ArrayList<>();
    }

    public Empresa(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public Empleado buscarEmpleado(int id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getIdentificacion() == id) {
                return empleado;
            }
        }
        return null;
    }

    public void liquidarNomina(List<Empleado> lista) {
        for (Empleado empleado : lista) {
            double neto = empleado.calcularPagoMensual(empleado) + empleado.calcularBonificacion(empleado);
            empleado.setPagoNeto(neto);
        }
    }

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

    empleados.add(new Vendedor(111, "Andres Castillo", 2005, 2100000, 15000000));
    empleados.add(new Vendedor(112, "Valentina Torres", 2015, 1700000, 9200000));
    empleados.add(new Vendedor(113, "Sebastian Herrera", 2022, 1550000, 6100000));

    empleados.add(new Repartidor(211, "Camila Vargas", 2016, 1500000, 85, Zona.B));
    empleados.add(new Repartidor(212, "Daniel Romero", 2019, 1480000, 90, Zona.A));
    empleados.add(new Repartidor(213, "Julian Castro", 2024, 1380000, 70, Zona.C));

        Empresa empresa = new Empresa(empleados);
        empresa.liquidarNomina(empleados);

        for (Empleado empleado : empleados) {
            imprimirEmpleado(empleado);
        }
    }

    private static void imprimirEmpleado(Empleado empleado) {
        if (empleado instanceof Vendedor vendedor) {
            System.out.println(
                    "Vendedor, " + vendedor.getIdentificacion() + ", " + vendedor.getNombre() + ", "
                            + vendedor.getAnioIngreso() + ", " + vendedor.getSalarioBase() + ", "
                            + vendedor.getTotalVentas() + ", " + vendedor.getValorComision() + ", "
                            + vendedor.getDescuentos() + ", " + vendedor.getPagoNeto());
            return;
        }

        if (empleado instanceof Repartidor repartidor) {
            System.out.println(
                    "Repartidor, " + repartidor.getIdentificacion() + ", " + repartidor.getNombre() + ", "
                            + repartidor.getAnioIngreso() + ", " + repartidor.getSalarioBase() + ", "
                            + repartidor.getNumeroRepartos() + ", " + repartidor.getValorRepartosPagados() + ", "
                            + repartidor.getDescuentos() + ", " + repartidor.getPagoNeto());
        }
    }
}
