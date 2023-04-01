package com.trabajo.clases.operaciones;

import com.trabajo.clases.info.Cliente;

import java.util.Scanner;

public class OperacionesCliente {
    private static Scanner scanner = new Scanner(System.in);

    public static void menu(){
      System.out.println("Eligir una opcion del menu del cliente" +
              "\n\t1. Registrar cliente" +
              "\n\t2. Listar clientes registrados" +
              "\n\t3. Ver informacion del cliente"+
              "\n\t4. Editar informacion del cliente seleccionado" +
              "\n\t5. Eliminar el cliente selecccionado");
      byte opcion = scanner.nextByte();

      switch (opcion) {
          case 1:
              registrarCliente();
              break;
          case 2:
              listarCliente();
              break;
          case 3:
              verCliente();
              break;
          case 4:
              editarCliente();
              break;

          default:
              System.out.println( "Seleccione una opcion valida");

      }
    }
    public static void registrarCliente() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Diana");
        cliente.setApellidos("Julian");
        cliente.setTipoCilente("Regular");
        cliente.setCorreo("dianeisabel2001@gmail.com");
        cliente.setRfc("JURD010520N40");
        cliente.setTelefono("2251090276");
        cliente.setDireccion(" av. poza rica 218 tlapacoyan, ver");

        System.out.println(" Nombre del cliente: " + cliente.getNombre() +
                cliente.getApellidos() +
                "\nel tipo de cliente es" + cliente.getTipoCilente()  +
                "\ncorreo electronico: " + cliente.getCorreo() +
                "\nclave rfc:" + cliente.getRfc() +
                "\ntelefono" + cliente.getTelefono() +
                "\ndireccion:" + cliente.getDireccion());
    }
    public static void listarCliente () {
        System.out.println("Metodo para listar clientes");
    }
    public static void verCliente () {
        System.out.println("Metodo para ver informacion del cliente");
    }
    public static void editarCliente () {
        System.out.println("Metodo para editar la informacion del cliente seleccionado");
    }
    public static void eliminarcliente () {
        System.out.println("Metodo para eliminar al cliente seleccionado");
    }
}
