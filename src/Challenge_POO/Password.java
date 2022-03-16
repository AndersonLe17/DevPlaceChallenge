package Challenge_POO;

/*
    Haz una clase llamada Password que siga las siguientes condiciones:
    ● Que tenga los atributos longitud y contraseña. Por defecto, la longitud será de 8 caracteres.
    ● Los constructores serán los siguiente:
        ■ Un constructor por defecto.
        ■ Un constructor con la longitud que nosotros le pasemos (Generará una contraseña aleatoria con esa longitud).
    ● Los métodos que implementa serán:
        ○ esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener más de 2 mayúsculas, más de 1 minúscula y más de 3 números.
        ○ generarPassword(): genera la contraseña del objeto con la longitud que tenga.
        ○ Métodos get para los atributos contraseña y longitud.
        ○ Método set para stributo longitud.
 */
public class Password {

    //Atributos
    private int longitud;
    private String contraseña;

    //Constructor
    public Password() {
        this.longitud = 8;
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.generarPassword();
    }

    public Password(String contraseña) {
        this.longitud = contraseña.length();
        this.contraseña = contraseña;
    }
    
    //Metodos
    public boolean esFuerte() {
        int cont_May = 0;
        int cont_min = 0;
        int cont_num = 0;

        for (int i = 0; i < this.longitud; i++) {

            int caracter = (this.contraseña.charAt(i));

            if (caracter >= 65 && caracter <= 90) {
                cont_May++;
            } else if (caracter >= 97 && caracter <= 122) {
                cont_min++;
            } else if (caracter >= 48 && caracter <= 57){
                cont_num++;
            }

        }
        
        if (cont_May > 2 && cont_min > 1 && cont_num > 3) {
            return true;
        }

        return false;
    }

    private void generarPassword() {
        int x;
        int i = 0;
        this.contraseña = "";
        while (i < this.longitud) {
            x = (int) (Math.random() * (123 - 48)) + 48;

            if ((x >= 48 && x <= 57) || (x >= 65 && x <= 90) || (x >= 97 && x <= 122)) {
                this.contraseña = this.contraseña + (char) x;
                i++;
            }

        }
    }

    //Getters & Setters
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

}
