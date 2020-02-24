const MAXNOM =40;


struct ultimaAlerta{
  char hora[15];
  char fecha[15];
  int puntuacion;
};

struct presionArterial2{
  int sistolica;
  int diastolica;
};
struct  nodo_indicadores2{
    int frecuenciaCardiaca;
    presionArterial2 sPresionArterial;
    int frecuenciaRespiratoria;
    float temperatura;
    int saturacionOxigeno;
};

struct nodo_paciente2{
        char nombres[MAXNOM];
        float edad;
        int numHabitacion;
        nodo_indicadores2 indicadores;	
};

struct indicador_genero_alerta{
	char nombreIndicador[MAXNOM];
	char valor[MAXNOM];
};

struct alerta{
  	   nodo_paciente2 paciente;
	  char hora[15];
	  char fecha[15];
	  indicador_genero_alerta generoAlerta[5];
	  char mensajeNotificaciones[200];
	  ultimaAlerta ultimasAlertas[5];	
};







program gestion_notificaciones{
    version gestion_notificaciones_version{
        bool enviarNotificaciones_2(alerta objAlerta)=1;
    }=2;

}=0x0000002;
