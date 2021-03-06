package org.uma.mbd.mdLibreriaV1L.libreriav1l;

public class Libro {


        private String autor;
        private String titulo;
        private double precioBase;
        private static double IVA=10;

        public Libro (String autor,String tit,double pb){
            this.autor=autor;
            titulo=tit;
            precioBase=pb;
        }

        public String getAutor() {
            return autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public double getPrecioBase() {
            return precioBase;
        }

        public double getPrecioFinal(){
            return precioBase + precioBase*IVA/100;
        }

        public String toString(){
            return "("+ autor + ";" + titulo + ";" + precioBase + ";" + IVA + "%" + getPrecioFinal() + ")";
        }

        public static double getIVA() {
            return IVA;
        }

        public static void setIVA(double IVA) {
            Libro.IVA = IVA;
        }


    }


