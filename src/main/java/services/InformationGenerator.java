package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class InformationGenerator {
    private static final String LETTERS = "AEIOU";

    private static String generarPalabraAleatoria(int longitud) {
        Random random = new Random();
        StringBuilder palabra = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(LETTERS.length());
            palabra.append(LETTERS.charAt(indiceAleatorio));
        }

        return palabra.toString();
    }

    public static Map<String, String> generateRandomInformation() {
        Map<String, String> mapaPalabras = new HashMap<>();
        Random random = new Random();
        int cantLinks = random.nextInt(5) + 1;
        int cantWords = random.nextInt(51) + 10;

        int lengthWord = random.nextInt(2) + 1;
        for (int i = 0; i < cantLinks; i++) {
            String clave = generarPalabraAleatoria(lengthWord);
            StringBuilder conjuntoPalabras = new StringBuilder();

            for (int j = 0; j < cantWords; j++) {
                conjuntoPalabras.append(generarPalabraAleatoria(lengthWord));
                if (j < cantWords - 1) {
                    conjuntoPalabras.append(" ");
                }
            }

            mapaPalabras.put(clave, conjuntoPalabras.toString());
        }

        return mapaPalabras;
    }

    public static Map<String, String> getInformation(String searchCriteria){
        return switch (searchCriteria) {
            case "Javier Milei" -> Map.of(
                    "https://www.clarin.com/politica/ku-k-12-javier-milei-comparo-kircherismo-virus-apocaliptico-walking" +
                            "-dead-controvertido-video_0_Bz1NIU79uf.html",
                    """
                            Como si fuesen escenas de la popular serie The Walking Dead, Javier Milei publicó este jueves un
                             controversial video en sus redes sociales, donde se ven a dirigentes kirchneristas infectados 
                             por un supuesto virus llamado "Ku-K 12".
                                                    
                            Se trata de una animación, difundida en su cuenta oficial de Instagram, donde una voz en off 
                            narra que todo arrancó 12 años atrás cuando el virus "comenzó no solo con la destrucción 
                            Argentina", sino también con "la destrucción de mentes".
                                                    
                            "Los infectados perdieron toda capacidad de pensar por sí mismos atrapados en una ceguera que 
                            los consumió por completo", cuenta el narrador mientras se intercalan imágenes de Néstor, 
                            Cristina y Máximo Kirchner, junto a Roberto Baradel.
                                                    
                            El video luego continúa con la aparición del músico Fito Páez y la actriz Florencia Peña, 
                            afines al kirchnerismo, a quienes la voz en off acusa de haberse infectado "solo por 
                            conveniencia" y "a cambio de beneficios".
                                                        
                            "Otros nacieron sin futuro condenados desde el inicio a una vida vacía", sigue relatando el 
                            clip mientras aparece Natalia Zaracho, diputada nacional, trabajadora de la economía popular y 
                            dirigente del Frente Patria Grande, la fuerza de Juan Grabois.
                                                    
                            Con una estética similar a la serie "The Walking Dead", que habla de un virus zombie que devastó 
                            a la humanidad, los personajes deambulan como entes por una Buenos Aires apocalíptica con una 
                            imagen del Obelisco derruido.
                                                    
                            Allí también se puede ver al ex ministo de Economía, Sergio Massa, "caminando sin rumbo y 
                            persiguiendo ideales que los llevaron a la ruina".
                                                    
                            "Aunque hoy Ku-K 12 sigue presente en muchos, su poder se debilita. La enfermedad sigue pero 
                            ahora ya no contagia, se ha vuelto vulnerable", dice el narrador mientras aparece un Alberto 
                            Fernández personificado como zombie.
                                                        
                            El video finaliza con un mensaje esperanzador que muestra a un león caminando en medio de las 
                            ruinas, el animal símbolo de las ideas que pregona el Presidente y líder de La Libertad Avanza.
                                                    
                            "No todos fueron infectados, algunos resistieron escondidos en las sombras esperando el día en 
                            que el virus ya no pueda contagiar", concluye.
                                                    
                            El posteo en Instagram fue replicado luego por el propio mandatario en su cuenta de X, donde 
                            escribió: "Muchas gracias a todos los que han despertado...!!! VIVA LA LIBERTAD CARAJO".
                                                        
                            El domingo, durante su discurso de presentación del Presupuesto 2025 en el Congreso de la 
                            Nación, el libertario volvió a hacer referencia a su metáfora sobre despertar leones.
                                                    
                            "Cuando ingresé a la política señalé que no venía a guiar corderos sino a despertar leones. Y 
                            les cuento que, si no lo han visto o no lo quieren ver, los leones han despertado", expresó.
                            """,
                    "https://www.clarin.com.ar/politica/Javier-Milei-anuncio-un-acto-en-Parque-Lezama-donde-lanzara-La-" +
                            "Libertad-Avanza-a-nivel-nacional-20240919-0179.html",
                    """
                            Tal cual lo hizo en sus orígenes como candidato político, Javier Milei volverá a encabezar un 
                            acto de La Libertad Avanza en el Parque Lezama de la Ciudad de Buenos Aires, esta vez como 
                            Presidente de la Nación. Se trata del lanzamiento del partido violeta a nivel nacional y en la 
                            Casa Rosada anticipan que será “épico”.
                                                    
                            “Hola a todos, yo soy el león”, escribió Milei en su cuenta de la red social X para anunciar el 
                            acto en el tradicional parque del barrio porteño de San Telmo. Desde allí y no desde una 
                            localidad de la Provincia de Buenos Aires -como había trascendido semanas atrás- formalizará al 
                            partido libertario en todo el país, de cara a las elecciones legislativas 2025.
                                                        
                            Falta poco más de un año para que los argentinos vuelvan a las urnas a elegir la renovación de 
                            una parte de los legisladores que los representan. Cerca del Presidente no pierden de vista la 
                            necesidad de sumar bancas que le respondan en el Congreso y el próximo sábado 28 de septiembre 
                            darán otro paso hacia ese objetivo.
                                                        
                            El Presidente lo informó con un flyer que publicó esta tarde en X para convocar a sus militantes. 
                            “Para terminar con la casta volvemos a Parque Lezama. Lanzamiento nacional de La Libertad 
                            Avanza”, dice el texto en la imagen con fondo violeta.
                                                        
                            La convocatoria es para las 19 horas y se espera un discurso del líder del partido violeta. 
                            Milei tomará la palabra en el Parque Lezama luego de retornar el miércoles anterior de su viaje 
                            a Nueva York para ser orador ante la Asamblea de la ONU como Presidente de la Nación.
                                                    
                            En el Lezama se espera la puesta en escena que acostumbra proponer la cúpula del partido 
                            libertario que ganó las elecciones en 2023 y que en las últimas semanas debió explicar el veto 
                            a la mejora de las jubilaciones mientras se prepara de forma inminente para el segundo contra la
                             ley de financiamiento universitario.\s
                                                    
                            El anuncio ocurre al día siguiente del que hizo un dirigente de peso de la oposición con la que 
                            Milei ya demostró planea antagonizar en la campaña del año que viene: el que hará en La Plata 
                            este viernes el presidente del PJ bonaerense y líder de La Cámpora, Máximo Kirchner.
                            """
            );
            case "Cristina Kirchner" -> Map.of("https://www.clarin.com.ar/politica/Cristina-Kirchner-Milei-" +
                            "hablaba-de-cepo-al-Estado-y-ahora-le-esta-poniendo-un-cepo-a-la-educacion-20240918-0318.html",
                    """
                            La ex mandatario Cristina Kirchner se reunió este miércoles con presidentas electas de cuatro
                             centros de estudiantes de la UBA y advirtió que el Gobierno de Javier Milei le está poniendo
                              un "cepo a la educación".
                                                        
                            "Él hablaba de cepo al Estado y le está poniendo un cepo a la educación. Ahora viene mucha 
                            agresión para la universidad pública", expresó la ex mandataria sobre Milei durante una 
                            encuentro que mantuvo con jóvenes que fueron elegidas para representar a los estudiantes de 
                            la FADU, Ciencias Exactas, Filosofía y Letras y Ciencias Sociales.
                                                        
                            En esa línea, la ex jefa de Estado expresó que el Presupuesto 2025 representa un "cepo a la 
                            educación".
                                                        
                            "Me parece que le erraron al vizcachaso ahí, porque confundir el empleo público o el Estado, 
                            que puede ser visto como burocrático por parte de muchísimos argentinos... no pasa lo mismo 
                            con la universidad", analizó.
                                                        
                            Fernández de Kichner resaltó que "la universidad es el lugar al que todos quieren que sus 
                            hijos vayan. Es el lugar a donde los pibes tienen que ir, estudiar, recibirse, tener una 
                            carrera y un futuro".
                                                        
                            Además, destacó la conducción femenina en las casas de altos estudio, al resaltar que son 
                            "todas mujeres" y que es "tiempo de chicas", según celebró ante la presencia de las cuatro 
                            referentes estudiantiles.
                                                        
                            "Esto habla de cosas buenas y de esperanza. Nos quieren vender la batalla cultural, que los 
                            jóvenes son libertarios, pero en las elecciones de las universidades públicas no figuraron", 
                            subrayó la ex mandataria.
                            """,
                    "https://www.clarin.com.ar/politica/Causa-Vialidad-rechazaron-el-pedido-de-Cristina-Kirchner-" +
                            "para-apartar-a-un-juez-de-la-investigacion-20240917-0198.html",
                    """
                            La Cámara Federal de Casación Penal rechazó este martes la recusación del juez Gustavo 
                            Hornos de la causa Vialidad, en la que deberá resolver si confirma, revoca o agrava la 
                            condena de seis años de prisión a Cristina Kirchner por delitos cometidos con la obra 
                            pública en Santa Cruz. La expresidenta pidió que se lo aparte del caso porque fue denunciado 
                            por violencia de género.
                                                        
                            Los jueces Mariano Borinsky y Daniel Petrone que integran la Sala IV de la Cámara Federal de 
                            Casación Penal rechazaron el planteo por "improcedente", según la resolución.
                                                        
                            Cristina Kirchner había recusado al juez Hornos por considerar que un magistrado denunciado 
                            por cuestiones de género no puede fallar en una causa donde la principal acusada es un mujer.
                             Pero los jueces Borinsky y Barroetaveña rechazaron esa solicitud.
                             
                             La recusación de Hornos había sido presentada el 6 de septiembre último por la defensa de 
                             la ex presidenta, a cargo del abogado Carlos Beraldi.\s
                             
                             Borinsky y Barroetaveña consideraron que el argumento en base al cual se buscó sacar al 
                             magistrado de la causa “se sustenta en cuestiones ajenas a los hechos de este proceso”. En 
                             el caso "no ha sido demostrado, ni se observa" que se den alguna de las causales de 
                             recusación "por parcialidad subjetiva" previstas en la ley "ni tampoco un supuesto de falta
                              de imparcialidad objetiva por parte del juez recusado sobre los hechos que conforman este 
                              caso", indica la resolución.
                             
                             Tras rechazar la recusación, el tribunal dispuso que la causa vuelva a deliberación, es 
                             decir, a ser analizada por los tres magistrados tras haber escuchado a todas las partes 
                             en audiencias hechas en mayo pasado.
                             
                             La ex presidenta está condenada a 6 años de prisión por el delito de defraudación al Estado 
                             a través de la obra pública vial en Santa Cruz a favor del también condenado empresario 
                             Lázaro Báez durante su gobierno. Este veredicto del Tribunal Oral Federal 2 fue apelado 
                             por todas las partes; la fiscalía reclamó que también se la condene y se le agrave la pena 
                             por el delito de "asociación ilícita" y la defensa reclama la absolución.
                             
                             La denuncia contra el juez Hornos
                             El juez Hornos fue denunciado por violencia de género por una expareja y tiene una causa en
                              su contra a cargo del fiscal federal Guillermo Marijuan. Los jueces de la Casación 
                              decidieron la semana pasada comunicar el asunto al Consejo de la Magistratura, para que 
                              analice la conducta del juez Hornos.
                             
                             Sobre el juez recaen seis supuestos hechos de violencia que podrían estar vinculados a un 
                             “potencial aprovechamiento” por parte de Hornos de su condición de camarista, según el juez 
                             de instrucción Alfredo Godoy, que fue el primero que intervino en el caso. De ese modo, 
                             Hornos supuestamente buscaba que ella desistiera de iniciar algún tipo de acción legal 
                             contra él.
                             
                             La denunciante también aseguró haber sido amenazada por un amigo de Hornos, a quien definió 
                             como un “mafioso que trabaja en operaciones de inteligencia”.
                             
                             En paralelo a la causa penal, la Justicia dispuso sobre Hornos una prohibición de 
                             acercamiento a la denunciante de 200 metros, por el plazo de 90 días, y el cese de todo 
                             tipo de contacto físico, virtual o por vía de terceros.
                            """);
            default -> Map.of();
        };
    }
}
