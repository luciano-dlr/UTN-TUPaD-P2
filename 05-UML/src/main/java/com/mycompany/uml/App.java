/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uml;

/**
 *
 * @author delar
 */
public class App {

    public static void main(String[] args) {
        System.out.println("=== TRABAJO PRACTICO UML ===");

        // ======================
        // EJERCICIO 1
        // ======================
        Titular elTitular = new Titular("Juan" ,"12345678");
        Foto foto = new Foto("foto.png", "jpg");
        Pasaporte pasaporte = new Pasaporte("A12345", "2025-01-01", "foto familiar",elTitular.toString() );
        elTitular.setPasaporte(pasaporte);
        System.out.println(pasaporte);

        // ======================
        // EJERCICIO 2
        // ======================
        Usuario usuario = new Usuario("Ana", "98765432");
        Bateria bateria = new Bateria("Samsung-01", 4000);
        Celular celular = new Celular("111222333", "Samsung", "Galaxy", bateria);
        usuario.setCelular(celular);
        System.out.println(celular);

        // ======================
        // EJERCICIO 3
        // ======================
        Autor autor = new Autor("Borges", "Argentina");
        Editorial editorial = new Editorial("Planeta", "Av. Corrientes 1234");
        Libro libro = new Libro("El Aleph", "ISBN12345", autor, editorial);
        System.out.println(libro);

        // ======================
        // EJERCICIO 4
        // ======================
        Cliente cliente = new Cliente("Luciano", "44556677");
        Banco banco = new Banco("Santander", "30-12345678-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("5555666677778888", "12/27", banco);
        cliente.setTarjeta(tarjeta);
        System.out.println(tarjeta);

        // ======================
        // EJERCICIO 5
        // ======================
        Propietario propietario = new Propietario("Marta", "22334455");
        PlacaMadre placa = new PlacaMadre("ASUS-01", "B450");
        Computadora pc = new Computadora("HP", "SN1234", placa.toString(), propietario.toString());
        propietario.setComputadora(pc);
        System.out.println(pc);

        // ======================
        // EJERCICIO 6
        // ======================
        Cliente6 cliente6 = new Cliente6("Carlos", "123456789");
        Mesa mesa = new Mesa(5, 4);
        Reserva reserva = new Reserva("2025-09-17", "20:00", cliente, mesa);
        System.out.println(reserva);

        // ======================
        // EJERCICIO 7
        // ======================
        Conductor conductor = new Conductor("Diego", "LIC1234");
        Motor motor = new Motor("Nafta", "MOT9876");
        Vehiculo vehiculo = new Vehiculo("AA123BB", "Ford Fiesta", motor);
        conductor.setVehiculo(vehiculo);
        System.out.println(vehiculo);

        // ======================
        // EJERCICIO 8
        // ======================
        Usuario8 usuarioEjercicio8 = new Usuario8("Pedro", "pedro@mail.com");
        FirmaDigital firma = new FirmaDigital("HASH123", "2025-09-17", usuario);
        Documento doc = new Documento("Contrato", "Contenido legal", "HASH123","2025-09-17",usuario);
        System.out.println(doc);

        // ======================
        // EJERCICIO 9
        // ======================
        Paciente paciente = new Paciente("Laura", "OSDE");
        Profesional profesional = new Profesional("Dr. Pérez", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-10-01", "09:30", paciente, profesional);
        System.out.println(cita);

        // ======================
        // EJERCICIO 10
        // ======================
        Titular10 titular10 = new Titular10("Esteban", "66778899");
        ClaveSeguridad clave = new ClaveSeguridad("ABC123", "2025-01-01");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 10000.0, clave.toString(), titular10.toString());
        titular10.setCuenta(cuenta);
        System.out.println(cuenta);

        // ======================
        // EJERCICIO 11
        // ======================
        Artista artista = new Artista("Cerati", "Rock");
        Cancion cancion = new Cancion("Crimen", artista);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);

        // ======================
        // EJERCICIO 12
        // ======================
        Contribuyente contribuyente = new Contribuyente("Luciano", "20-12345678-9");
        Impuesto impuesto = new Impuesto(15000.0, contribuyente);
        Calculadora calculadora = new Calculadora();
        calculadora.calcular(impuesto);

        // ======================
        // EJERCICIO 13
        // ======================
        Usuario13 usuario13 = new Usuario13("Ana", "ana@email.com");
        GeneradorQR generadorQR = new GeneradorQR();
        generadorQR.generar("www.misitio.com", usuario);

        // ======================
        // EJERCICIO 14
        // ======================
        Proyecto proyecto = new Proyecto("Corto Animado", 15);
        EditorVideo editorVideo = new EditorVideo();
        editorVideo.exportar("MP4", proyecto);

       
    }
}
