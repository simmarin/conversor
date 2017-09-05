# CONVERSIONES  
## Objetivo   
Este proyecto tiene como objetivo realizar la conversión entre unidades de informacón:
- Kilobytes a Megabytes    
- Megabytes a Gigabytes   
- Gigabytes a Terabytes y viceversa   
## Descripcion   
El proyecto contiene:   
- Clase "Operaciones": Contiene los 2 métodos con las operaciones basicas que se van a utilizar para todas las conversiones , la multiplicación y la división.  
- Clases para cada conversión: Estos heredan de la clase "Operaciones" junto con los dos metodos.   
1-Kb_Mb: Este realiza la conversión entre Mb a Kb y viceversa.  
2-Mb_Gb: Este realiza la conversión entre Mb a Gb y viceversa.  
3-Gb_Tb: Este realiza la conversión entre Mb a Tb y viceversa.   
- Clase "principal": Desde donde se instancia cada clase conversión, creando un objeto por clase, se manda a llamar el método necesario. 
