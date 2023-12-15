public class App {
    public static void main(String[] args) throws Exception {
        String preguntas[] = {
        
            "¿Cuanto es la mitad de dos mas dos?",
            "edificio empieza por e y termina por...",
            "¿cual seria el siguiente numero de la secuencia?0,1,1,2,3,5,8,13,...",
            "¿cual es el apellido de bob esponja?",
            "¿que mes tiene 28 dias?",

            "Oro parece y plata no es, quien no lo adivine tonto es",
            "Dos abanicos que no paran en todo el día, pero cuando duermes se quedan quietos",
            "¿Llevo mi casa a cuestas y camino sin tener patas",
            "Pese a tener 4 patas, no puedo correr ni caminar. ¿Qué soy?",
            "¿Lana sube y lana baja. ¿De qué se trata?",

        };
        String respuestas[]={

            "3",
            "t",
            "21",
            "pantalones cuadrados",
            "todos",

            "Platano",
            "Las pestañas",
            "El caracol",
            "Silla",
            "Navaja",

            
            
        }   ;
        int rand;
        String res;
        

         Random rm = new Random();
         rand=rm.nextInt(0,6);

         System.out.println(preguntas[rand]);

         Scanner sc=new Scanner(System.in);
        res=sc.nextLine();
        

        if (res.equals(respuestas[rand])){

            System.out.println("");
        
        }else{
            System.out.println("");
        }
        
    }
}
