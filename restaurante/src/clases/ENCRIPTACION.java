package clases;

public class ENCRIPTACION {

    private static String Limpiar_texto(String texto) {
        String tabla = "abcdefghijklmnñopqrstuvwxyzáéíóúABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚ1234567890.,;_:+-*/ @$#¿?!Â¡=()[]{}\\\"";
        texto = texto.replaceAll("\n", "");

        for (int x = 0; x < texto.length(); x++) {
            int posicion = tabla.indexOf(texto.charAt(x));

            if (posicion == -1) {
                texto = texto.replace(texto.charAt(x), ' ');
            }
        }
        return texto;
    }

    public static String Encriptar(String texto, int clave) {
        String tabla = "abcdefghijklmnñopqrstuvwxyzáéíóúABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚ1234567890.,;_:+-*/ @$#¿?!Â¡=()[]{}\\\"";
        String texto_limpio = Limpiar_texto(texto);

        String resultado = "";

        for (int i = 0; i < texto_limpio.length(); i++) {
            int posicion = tabla.indexOf(texto_limpio.charAt(i));

            if ((posicion + clave) < tabla.length()) {
                resultado += tabla.charAt(posicion + clave);
            } else {
                resultado += tabla.charAt((posicion + clave) - tabla.length());
            }
        }
        return resultado;
    }

    public static String Desencriptar(String texto, int clave) {
        String tabla = "abcdefghijklmnñopqrstuvwxyzáéíóúABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚ1234567890.,;_:+-*/ @$#¿?!Â¡=()[]{}\\\"";
        String texto_limpio = Limpiar_texto(texto);

        String resultado = "";

        for (int x = 0; x < texto_limpio.length(); x++) {
            int posicion = tabla.indexOf(texto_limpio.charAt(x));

            if ((posicion - clave) < 0) {
                resultado += tabla.charAt((posicion - clave) + tabla.length());
            } else {
                resultado += tabla.charAt(posicion - clave);
            }
        }
        return resultado;
    }
}
