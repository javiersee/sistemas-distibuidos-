const MAXNOM =40;

struct presionArterial{
  int sistolica;
  int diastolica;
};
struct  nodo_indicadores{
    int frecuenciaCardiaca;
    presionArterial sPresionArterial;
    int frecuenciaRespiratoria;
    float temperatura;
    int saturacionOxigeno;
};

struct nodo_paciente{
        char nombres[MAXNOM];
        float edad;
        int numHabitacion;
        nodo_indicadores indicadores;
};


program gestion_alertas{
    version gestion_alertas_version{
            bool enviarIndicador(nodo_paciente obj)=1;
    } = 1;
}=0x20000001;
