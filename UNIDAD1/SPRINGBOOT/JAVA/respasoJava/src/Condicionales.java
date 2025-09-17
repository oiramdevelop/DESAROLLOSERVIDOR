public class Condicionales {
    public static void main(String[] args) throws Exception {
        int edad = 18;
        String marca = "Peugeout";
        float potencia= 135.5f;
       

        //Solo podra conducir si es mayor de edad y el coche tiene menos de 140 cv  de potencia
        if (edad >= 18 && potencia < 140) {
            System.out.println("Puedes conducir "+marca); ;
        } else if (edad < 18) {
            System.out.println("Eres menor de edad, no puedes conducir");
        } else {
            System.out.println("Tu coche es muy potente, no puedes conducir");

        }

    }
}
