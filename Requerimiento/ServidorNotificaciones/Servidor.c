/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */
#include "stdio.h"
#include "notificaciones.h"
#include "string.h"
#include <stdio_ext.h>


bool_t *
enviarnotificaciones_2_2_svc(struct alerta *argp, struct svc_req *rqstp)
{
	static bool_t  result;
	char ss[200];
	strcpy(ss,"viva  la u");
	int j ;
	printf("-------------------------------------------------------------------------------------------");
	printf("\n \t \t          *******************ALERTA GENERADA ********************** \t \t \n");
	printf("\n No  de habitacion  %i",(*argp).paciente.numHabitacion);
	printf("\n Nombres y apellidos  %s ",(*argp).paciente.nombres);	
	printf("\n Edad  %.2f",(*argp).paciente.edad);
	printf("\n Hora de alerta %s",(*argp).hora);
	printf("\n Fecha  de alerta %s",(*argp).fecha);
	printf("\n \t \t         indicadores que generan alertas \t \t \n");
	printf("\n \t \t Nombre de indicador      valor  \t \n");
	int contador=0;
	for ( j = 0; j < 7; j++)
	{ 
		if ((strcmp((*argp).generoAlerta[j].nombreIndicador,"null"))!=0)
	    {
			printf("\n %s",(*argp).generoAlerta[j].nombreIndicador);
			if ((strcmp((*argp).generoAlerta[j].nombreIndicador,"Temperatura"))==0)
	    {
			printf("                              %s \n",(*argp).generoAlerta[j].valor);
		  }
			if ((strcmp((*argp).generoAlerta[j].nombreIndicador,"Frecuencia Cardiaca"))==0)
	    {
			printf("                      %s \n",(*argp).generoAlerta[j].valor);
		  }
			if ((strcmp((*argp).generoAlerta[j].nombreIndicador,"Frecuencia Arterial"))==0)
	    {
			printf("                      %s \n",(*argp).generoAlerta[j].valor);
		  }
			if ((strcmp((*argp).generoAlerta[j].nombreIndicador,"Frecuencia Respiratoria"))==0)
	    {
			printf("                  %s \n",(*argp).generoAlerta[j].valor);
		  }
			if ((strcmp((*argp).generoAlerta[j].nombreIndicador,"Saturacion Oxigeno"))==0)
	    {
			printf("                       %s \n",(*argp).generoAlerta[j].valor);
		  }
 			

      contador=contador+1;
		}else
		{
			break;
		}	
	}
	__fpurge(stdin);
	
	if(contador==2){
		printf("\n     \t \t    La enfermara debe revisar al paciente \n");
	}
	else{
		printf("\n   \t \t    La enfermara y el medico deben revisar alpaciente \n");
	}

	printf("\n fecha   de alerta        |  hora  de alerta              | puntuacion  ");
	for (int  i = 0; i < 5; i++)
	{
		if ((*argp).ultimasAlertas[i].puntuacion!=0)
	    {
			printf("\n%s \t \t           %s       \t \t       %d  \n",(*argp).ultimasAlertas[i].fecha, (*argp).ultimasAlertas[i].hora, (*argp).ultimasAlertas[i].puntuacion);
            contador=contador+1;
		}else
		{
			break;
		}	

	//printf(" \n %c",(*argp).ultimasAlertas[i].fecha,"|     ",(*argp).ultimasAlertas[i].fecha," " );
	}
	printf("\n -------------------------------------------------------------------------------------------");
	
	return &result;
}